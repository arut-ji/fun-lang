// Generated from /Users/arutjinadit/Lecture/programming-languages/course-work/arut-course-work/Fun.g4 by ANTLR 4.8

package ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, ELSE=2, FALSE=3, FUNC=4, IF=5, INT=6, PROC=7, RETURN=8, TRUE=9, 
		WHILE=10, FOR=11, TO=12, SWITCH=13, CASE=14, DEFAULT=15, EQ=16, LT=17, 
		GT=18, PLUS=19, MINUS=20, TIMES=21, DIV=22, NOT=23, ASSN=24, LPAR=25, 
		RPAR=26, COLON=27, DOT=28, DOTDOT=29, COMMA=30, NUM=31, ID=32, SPACE=33, 
		EOL=34, COMMENT=35;
	public static final int
		RULE_program = 0, RULE_proc_decl = 1, RULE_formal_decl_seq = 2, RULE_formal_decl = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_com = 6, RULE_caseCommandSequence = 7, 
		RULE_caseCommand = 8, RULE_guardExpression = 9, RULE_assn = 10, RULE_range = 11, 
		RULE_seq_com = 12, RULE_expr = 13, RULE_sec_expr = 14, RULE_prim_expr = 15, 
		RULE_actual_seq = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "proc_decl", "formal_decl_seq", "formal_decl", "var_decl", 
			"type", "com", "caseCommandSequence", "caseCommand", "guardExpression", 
			"assn", "range", "seq_com", "expr", "sec_expr", "prim_expr", "actual_seq"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'else'", "'false'", "'func'", "'if'", "'int'", "'proc'", 
			"'return'", "'true'", "'while'", "'for'", "'to'", "'switch'", "'case'", 
			"'default'", "'=='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'not'", 
			"'='", "'('", "')'", "':'", "'.'", "'..'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "ELSE", "FALSE", "FUNC", "IF", "INT", "PROC", "RETURN", 
			"TRUE", "WHILE", "FOR", "TO", "SWITCH", "CASE", "DEFAULT", "EQ", "LT", 
			"GT", "PLUS", "MINUS", "TIMES", "DIV", "NOT", "ASSN", "LPAR", "RPAR", 
			"COLON", "DOT", "DOTDOT", "COMMA", "NUM", "ID", "SPACE", "EOL", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Fun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(FunParser.EOF, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Proc_declContext> proc_decl() {
			return getRuleContexts(Proc_declContext.class);
		}
		public Proc_declContext proc_decl(int i) {
			return getRuleContext(Proc_declContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOL || _la==INT) {
				{
				{
				setState(34);
				var_decl();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				proc_decl();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC || _la==PROC );
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_declContext extends ParserRuleContext {
		public Proc_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_decl; }
	 
		public Proc_declContext() { }
		public void copyFrom(Proc_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcContext extends Proc_declContext {
		public TerminalNode PROC() { return getToken(FunParser.PROC, 0); }
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public Formal_decl_seqContext formal_decl_seq() {
			return getRuleContext(Formal_decl_seqContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public ProcContext(Proc_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends Proc_declContext {
		public TerminalNode FUNC() { return getToken(FunParser.FUNC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FunParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public Formal_decl_seqContext formal_decl_seq() {
			return getRuleContext(Formal_decl_seqContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public FuncContext(Proc_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_declContext proc_decl() throws RecognitionException {
		Proc_declContext _localctx = new Proc_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc_decl);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROC:
				_localctx = new ProcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(PROC);
				setState(48);
				match(ID);
				setState(49);
				match(LPAR);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOL || _la==INT) {
					{
					setState(50);
					formal_decl_seq();
					}
				}

				setState(53);
				match(RPAR);
				setState(54);
				match(COLON);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL || _la==INT) {
					{
					{
					setState(55);
					var_decl();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				seq_com();
				setState(62);
				match(DOT);
				}
				break;
			case FUNC:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(FUNC);
				setState(65);
				type();
				setState(66);
				match(ID);
				setState(67);
				match(LPAR);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOL || _la==INT) {
					{
					setState(68);
					formal_decl_seq();
					}
				}

				setState(71);
				match(RPAR);
				setState(72);
				match(COLON);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL || _la==INT) {
					{
					{
					setState(73);
					var_decl();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				seq_com();
				setState(80);
				match(RETURN);
				setState(81);
				expr();
				setState(82);
				match(DOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_decl_seqContext extends ParserRuleContext {
		public Formal_decl_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_decl_seq; }
	 
		public Formal_decl_seqContext() { }
		public void copyFrom(Formal_decl_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalseqContext extends Formal_decl_seqContext {
		public List<Formal_declContext> formal_decl() {
			return getRuleContexts(Formal_declContext.class);
		}
		public Formal_declContext formal_decl(int i) {
			return getRuleContext(Formal_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunParser.COMMA, i);
		}
		public FormalseqContext(Formal_decl_seqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFormalseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFormalseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitFormalseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_decl_seqContext formal_decl_seq() throws RecognitionException {
		Formal_decl_seqContext _localctx = new Formal_decl_seqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal_decl_seq);
		int _la;
		try {
			_localctx = new FormalseqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			formal_decl();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				formal_decl();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_declContext extends ParserRuleContext {
		public Formal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_decl; }
	 
		public Formal_declContext() { }
		public void copyFrom(Formal_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalContext extends Formal_declContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public FormalContext(Formal_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_declContext formal_decl() throws RecognitionException {
		Formal_declContext _localctx = new Formal_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal_decl);
		try {
			_localctx = new FormalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends Var_declContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			_localctx = new VarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
			match(ID);
			setState(99);
			match(ASSN);
			setState(100);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(FunParser.BOOL, 0); }
		public BoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TypeContext {
		public TerminalNode INT() { return getToken(FunParser.INT, 0); }
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(BOOL);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProccallContext extends ComContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public Actual_seqContext actual_seq() {
			return getRuleContext(Actual_seqContext.class,0);
		}
		public ProccallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterProccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitProccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitProccall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ComContext {
		public TerminalNode FOR() { return getToken(FunParser.FOR, 0); }
		public AssnContext assn() {
			return getRuleContext(AssnContext.class,0);
		}
		public TerminalNode TO() { return getToken(FunParser.TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public ForContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assn_comContext extends ComContext {
		public AssnContext assn() {
			return getRuleContext(AssnContext.class,0);
		}
		public Assn_comContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterAssn_com(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitAssn_com(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitAssn_com(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(FunParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ComContext {
		public Seq_comContext c1;
		public Seq_comContext c2;
		public TerminalNode IF() { return getToken(FunParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(FunParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FunParser.COLON, i);
		}
		public List<Seq_comContext> seq_com() {
			return getRuleContexts(Seq_comContext.class);
		}
		public Seq_comContext seq_com(int i) {
			return getRuleContext(Seq_comContext.class,i);
		}
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public TerminalNode ELSE() { return getToken(FunParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchContext extends ComContext {
		public TerminalNode SWITCH() { return getToken(FunParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(FunParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FunParser.COLON, i);
		}
		public CaseCommandSequenceContext caseCommandSequence() {
			return getRuleContext(CaseCommandSequenceContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(FunParser.DEFAULT, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FunParser.DOT, 0); }
		public SwitchContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_com);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Assn_comContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				assn();
				}
				break;
			case 2:
				_localctx = new ProccallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				match(LPAR);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NOT) | (1L << LPAR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(109);
					actual_seq();
					}
				}

				setState(112);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(IF);
				setState(114);
				expr();
				setState(115);
				match(COLON);
				setState(116);
				((IfContext)_localctx).c1 = seq_com();
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(117);
					match(DOT);
					}
					break;
				case ELSE:
					{
					setState(118);
					match(ELSE);
					setState(119);
					match(COLON);
					setState(120);
					((IfContext)_localctx).c2 = seq_com();
					setState(121);
					match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(WHILE);
				setState(126);
				expr();
				setState(127);
				match(COLON);
				setState(128);
				seq_com();
				setState(129);
				match(DOT);
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(FOR);
				setState(132);
				assn();
				setState(133);
				match(TO);
				setState(134);
				expr();
				setState(135);
				match(COLON);
				setState(136);
				seq_com();
				setState(137);
				match(DOT);
				}
				break;
			case 6:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(SWITCH);
				setState(140);
				expr();
				setState(141);
				match(COLON);
				setState(142);
				caseCommandSequence();
				setState(143);
				match(DEFAULT);
				setState(144);
				match(COLON);
				setState(145);
				seq_com();
				setState(146);
				match(DOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseCommandSequenceContext extends ParserRuleContext {
		public List<CaseCommandContext> caseCommand() {
			return getRuleContexts(CaseCommandContext.class);
		}
		public CaseCommandContext caseCommand(int i) {
			return getRuleContext(CaseCommandContext.class,i);
		}
		public CaseCommandSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCommandSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterCaseCommandSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitCaseCommandSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitCaseCommandSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseCommandSequenceContext caseCommandSequence() throws RecognitionException {
		CaseCommandSequenceContext _localctx = new CaseCommandSequenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_caseCommandSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(150);
				caseCommand();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseCommandContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FunParser.CASE, 0); }
		public GuardExpressionContext guardExpression() {
			return getRuleContext(GuardExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FunParser.COLON, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public CaseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterCaseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitCaseCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitCaseCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseCommandContext caseCommand() throws RecognitionException {
		CaseCommandContext _localctx = new CaseCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caseCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(CASE);
			setState(157);
			guardExpression();
			setState(158);
			match(COLON);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				com();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public GuardExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterGuardExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitGuardExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitGuardExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardExpressionContext guardExpression() throws RecognitionException {
		GuardExpressionContext _localctx = new GuardExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_guardExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(164);
				expr();
				}
				break;
			case 2:
				{
				setState(165);
				range();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode ASSN() { return getToken(FunParser.ASSN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterAssn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitAssn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitAssn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssnContext assn() throws RecognitionException {
		AssnContext _localctx = new AssnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(ASSN);
			setState(170);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public Token lowerBound;
		public Token upperBound;
		public TerminalNode DOTDOT() { return getToken(FunParser.DOTDOT, 0); }
		public List<TerminalNode> NUM() { return getTokens(FunParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(FunParser.NUM, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((RangeContext)_localctx).lowerBound = match(NUM);
			setState(173);
			match(DOTDOT);
			setState(174);
			((RangeContext)_localctx).upperBound = match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Seq_comContext extends ParserRuleContext {
		public Seq_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq_com; }
	 
		public Seq_comContext() { }
		public void copyFrom(Seq_comContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqContext extends Seq_comContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public SeqContext(Seq_comContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seq_comContext seq_com() throws RecognitionException {
		Seq_comContext _localctx = new Seq_comContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_seq_com);
		int _la;
		try {
			_localctx = new SeqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << ID))) != 0)) {
				{
				{
				setState(176);
				com();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Sec_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public List<Sec_exprContext> sec_expr() {
			return getRuleContexts(Sec_exprContext.class);
		}
		public Sec_exprContext sec_expr(int i) {
			return getRuleContext(Sec_exprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(FunParser.EQ, 0); }
		public TerminalNode LT() { return getToken(FunParser.LT, 0); }
		public TerminalNode GT() { return getToken(FunParser.GT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((ExprContext)_localctx).e1 = sec_expr();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) {
				{
				setState(183);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				((ExprContext)_localctx).e2 = sec_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sec_exprContext extends ParserRuleContext {
		public Prim_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public Sec_exprContext sec_expr() {
			return getRuleContext(Sec_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(FunParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(FunParser.DIV, 0); }
		public Sec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterSec_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitSec_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitSec_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sec_exprContext sec_expr() throws RecognitionException {
		Sec_exprContext _localctx = new Sec_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sec_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((Sec_exprContext)_localctx).e1 = prim_expr();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) {
				{
				setState(188);
				((Sec_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
					((Sec_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				((Sec_exprContext)_localctx).e2 = sec_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prim_exprContext extends ParserRuleContext {
		public Prim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim_expr; }
	 
		public Prim_exprContext() { }
		public void copyFrom(Prim_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends Prim_exprContext {
		public TerminalNode NOT() { return getToken(FunParser.NOT, 0); }
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public NotContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends Prim_exprContext {
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public ParensContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunccallContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(FunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunParser.RPAR, 0); }
		public Actual_seqContext actual_seq() {
			return getRuleContext(Actual_seqContext.class,0);
		}
		public FunccallContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends Prim_exprContext {
		public TerminalNode NUM() { return getToken(FunParser.NUM, 0); }
		public NumContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Prim_exprContext {
		public TerminalNode FALSE() { return getToken(FunParser.FALSE, 0); }
		public FalseContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends Prim_exprContext {
		public TerminalNode TRUE() { return getToken(FunParser.TRUE, 0); }
		public TrueContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public IdContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prim_exprContext prim_expr() throws RecognitionException {
		Prim_exprContext _localctx = new Prim_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_prim_expr);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(FALSE);
				}
				break;
			case 2:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(TRUE);
				}
				break;
			case 3:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(NUM);
				}
				break;
			case 4:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(ID);
				}
				break;
			case 5:
				_localctx = new FunccallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(ID);
				setState(197);
				match(LPAR);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << TRUE) | (1L << NOT) | (1L << LPAR) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(198);
					actual_seq();
					}
				}

				setState(201);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(NOT);
				setState(203);
				prim_expr();
				}
				break;
			case 7:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(LPAR);
				setState(205);
				expr();
				setState(206);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_seqContext extends ParserRuleContext {
		public Actual_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_seq; }
	 
		public Actual_seqContext() { }
		public void copyFrom(Actual_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualseqContext extends Actual_seqContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunParser.COMMA, i);
		}
		public ActualseqContext(Actual_seqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).enterActualseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunListener ) ((FunListener)listener).exitActualseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunVisitor ) return ((FunVisitor<? extends T>)visitor).visitActualseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_seqContext actual_seq() throws RecognitionException {
		Actual_seqContext _localctx = new Actual_seqContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_actual_seq);
		int _la;
		try {
			_localctx = new ActualseqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expr();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				expr();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\5\bq\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0097\n\b\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\n\3\n\3\n\3\n\6\n"+
		"\u00a3\n\n\r\n\16\n\u00a4\3\13\3\13\5\13\u00a9\n\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\7\16\u00b4\n\16\f\16\16\16\u00b7\13\16\3\17\3\17\3"+
		"\17\5\17\u00bc\n\17\3\20\3\20\3\20\5\20\u00c1\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00ca\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00d3\n\21\3\22\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2\22\24\3\2\25"+
		"\30\2\u00e9\2\'\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\b`\3\2\2\2\nc\3\2\2\2\f"+
		"j\3\2\2\2\16\u0096\3\2\2\2\20\u009b\3\2\2\2\22\u009e\3\2\2\2\24\u00a8"+
		"\3\2\2\2\26\u00aa\3\2\2\2\30\u00ae\3\2\2\2\32\u00b5\3\2\2\2\34\u00b8\3"+
		"\2\2\2\36\u00bd\3\2\2\2 \u00d2\3\2\2\2\"\u00d4\3\2\2\2$&\5\n\6\2%$\3\2"+
		"\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(+\3\2\2\2)\'\3\2\2\2*,\5\4\3\2+*"+
		"\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3\2"+
		"\2\2\61\62\7\t\2\2\62\63\7\"\2\2\63\65\7\33\2\2\64\66\5\6\4\2\65\64\3"+
		"\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\34\2\28<\7\35\2\29;\5\n\6\2:"+
		"9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\5\32\16"+
		"\2@A\7\36\2\2AW\3\2\2\2BC\7\6\2\2CD\5\f\7\2DE\7\"\2\2EG\7\33\2\2FH\5\6"+
		"\4\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\34\2\2JN\7\35\2\2KM\5\n\6\2LK\3"+
		"\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\32\16\2R"+
		"S\7\n\2\2ST\5\34\17\2TU\7\36\2\2UW\3\2\2\2V\61\3\2\2\2VB\3\2\2\2W\5\3"+
		"\2\2\2X]\5\b\5\2YZ\7 \2\2Z\\\5\b\5\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^"+
		"\3\2\2\2^\7\3\2\2\2_]\3\2\2\2`a\5\f\7\2ab\7\"\2\2b\t\3\2\2\2cd\5\f\7\2"+
		"de\7\"\2\2ef\7\32\2\2fg\5\34\17\2g\13\3\2\2\2hk\7\3\2\2ik\7\b\2\2jh\3"+
		"\2\2\2ji\3\2\2\2k\r\3\2\2\2l\u0097\5\26\f\2mn\7\"\2\2np\7\33\2\2oq\5\""+
		"\22\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r\u0097\7\34\2\2st\7\7\2\2tu\5\34\17"+
		"\2uv\7\35\2\2v}\5\32\16\2w~\7\36\2\2xy\7\4\2\2yz\7\35\2\2z{\5\32\16\2"+
		"{|\7\36\2\2|~\3\2\2\2}w\3\2\2\2}x\3\2\2\2~\u0097\3\2\2\2\177\u0080\7\f"+
		"\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7\35\2\2\u0082\u0083\5\32\16\2"+
		"\u0083\u0084\7\36\2\2\u0084\u0097\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087"+
		"\5\26\f\2\u0087\u0088\7\16\2\2\u0088\u0089\5\34\17\2\u0089\u008a\7\35"+
		"\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7\36\2\2\u008c\u0097\3\2\2\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7\35\2\2\u0090\u0091"+
		"\5\20\t\2\u0091\u0092\7\21\2\2\u0092\u0093\7\35\2\2\u0093\u0094\5\32\16"+
		"\2\u0094\u0095\7\36\2\2\u0095\u0097\3\2\2\2\u0096l\3\2\2\2\u0096m\3\2"+
		"\2\2\u0096s\3\2\2\2\u0096\177\3\2\2\2\u0096\u0085\3\2\2\2\u0096\u008d"+
		"\3\2\2\2\u0097\17\3\2\2\2\u0098\u009a\5\22\n\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\21\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\5\24\13\2\u00a0"+
		"\u00a2\7\35\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2\2\u00a6"+
		"\u00a9\5\34\17\2\u00a7\u00a9\5\30\r\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7\32\2\2\u00ac"+
		"\u00ad\5\34\17\2\u00ad\27\3\2\2\2\u00ae\u00af\7!\2\2\u00af\u00b0\7\37"+
		"\2\2\u00b0\u00b1\7!\2\2\u00b1\31\3\2\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\33\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\5\36\20\2\u00b9\u00ba\t\2"+
		"\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\35\3\2\2\2\u00bd\u00c0\5 \21\2\u00be\u00bf\t\3\2\2\u00bf\u00c1\5\36\20"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00d3"+
		"\7\5\2\2\u00c3\u00d3\7\13\2\2\u00c4\u00d3\7!\2\2\u00c5\u00d3\7\"\2\2\u00c6"+
		"\u00c7\7\"\2\2\u00c7\u00c9\7\33\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00c8\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d3\7\34\2\2\u00cc"+
		"\u00cd\7\31\2\2\u00cd\u00d3\5 \21\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\5"+
		"\34\17\2\u00d0\u00d1\7\34\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c2\3\2\2\2"+
		"\u00d2\u00c3\3\2\2\2\u00d2\u00c4\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00c6"+
		"\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3!\3\2\2\2\u00d4"+
		"\u00d9\5\34\17\2\u00d5\u00d6\7 \2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"#\3\2\2\2\u00db\u00d9\3\2\2\2\27\'-\65<GNV]jp}\u0096\u009b\u00a4\u00a8"+
		"\u00b5\u00bb\u00c0\u00c9\u00d2\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}