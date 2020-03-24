//////////////////////////////////////////////////////////////
//
// Specification of the Fun syntactic analyser.
//
// Developed June 2012 by David Watt (University of Glasgow).
//
// Converted to ANTLRv4 by Simon Gay, August 2015.
//
//////////////////////////////////////////////////////////////

grammar Fun;

// This specifies the Fun grammar, defining the syntax of Fun.

@header{
package ast;
}

//////// Programs

program
	:	var_decl* proc_decl+ EOF  # prog
	;


//////// Declarations

proc_decl
	:	PROC ID
		  LPAR formal_decl_seq? RPAR COLON
		  var_decl* seq_com DOT   # proc

	|	FUNC type ID
		  LPAR formal_decl_seq? RPAR COLON
		  var_decl* seq_com
		  RETURN expr DOT         # func
	;

formal_decl_seq
	:	formal_decl (COMMA formal_decl)* # formalseq
	;

formal_decl
	:	type ID                # formal
	;

var_decl
	:	type ID ASSN expr         # var
	;

type
	:	BOOL                      # bool
	|	INT                       # int
	;


//////// Commands

com
	:	assn             # assn_com
	|	ID LPAR actual_seq? RPAR       # proccall

	|	IF expr COLON c1=seq_com
		  ( DOT
		  | ELSE COLON c2=seq_com DOT
		  )                     # if

	|	WHILE expr COLON
		    seq_com DOT         # while
//  EXTENSION
    |   FOR assn TO expr COLON
            seq_com DOT         # for
    |   SWITCH expr COLON
            caseCommandSequence
            DEFAULT COLON
                seq_com DOT     # switch
	;
//  EXTENSION
// Sequence of case commands
caseCommandSequence
    : caseCommand*
    ;

//  EXTENSION
// Case command
caseCommand
    :   CASE guardExpression COLON
            com+
    ;

//  EXTENSION
// Guard expression
guardExpression
    : ( expr | range )
    ;

//  EXTENSION
// Assignment Command
assn
    : ID ASSN expr
    ;

//  EXTENSION
// Range notation
range
    :  lowerBound = NUM '..' upperBound = NUM
    ;

seq_com
	:	com*                      # seq
	;


//////// Expressions

expr
	:	e1=sec_expr
		  ( op=(EQ | LT | GT) e2=sec_expr )?
	;

sec_expr
	:	e1=prim_expr
		  ( op=(PLUS | MINUS | TIMES | DIV) e2=sec_expr )?
	;

prim_expr
	:	FALSE                  # false
	|	TRUE                   # true
	|	NUM                    # num
	|	ID                     # id
	|	ID LPAR actual_seq? RPAR    # funccall
	|	NOT prim_expr          # not
	|	LPAR expr RPAR         # parens
	;

actual_seq
	:  expr (COMMA expr)*  # actualseq
	;

//////// Lexicon

BOOL	:	'bool' ;
ELSE	:	'else' ;
FALSE	:	'false' ;
FUNC	:	'func' ;
IF	:	'if' ;
INT	:	'int' ;
PROC	:	'proc' ;
RETURN :	'return' ;
TRUE	:	'true' ;
WHILE	:	'while' ;
FOR : 'for' ;
TO : 'to' ;
SWITCH	:	'switch' ;
CASE	:	'case' ;
DEFAULT  : 'default';

EQ	:	'==' ;
LT	:	'<' ;
GT	:	'>' ;
PLUS	:	'+' ;
MINUS	:	'-' ;
TIMES	:	'*' ;
DIV	:	'/' ;
NOT	:	'not' ;

ASSN	:	'=' ;

LPAR	:	'(' ;
RPAR	:	')' ;
COLON	:	':' ;
DOT	:	'.' ;
DOTDOT: '..' ;
COMMA	:	',' ;

NUM	:	DIGIT+ ;

ID	:	LETTER (LETTER | DIGIT)* ;

SPACE	:	(' ' | '\t')+   -> skip ;
EOL	:	'\r'? '\n'          -> skip ;
COMMENT :	'#' ~('\r' | '\n')* '\r'? '\n'  -> skip ;

fragment LETTER : 'a'..'z' | 'A'..'Z' ;
fragment DIGIT  : '0'..'9' ;