// Generated from com/mycompany/codex_latinus/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.codex_latinus;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CodexLatinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, WS=33, COMS_I=34, COMS=35, INT=36, DEC=37, TEXT=38, CHAR=39, 
		BOOL=40, ID=41, PR=42, IT=43, ES=44, SR=45, FC=46, DUM=47, PER=48, AT=49, 
		SI=50, FN=51, RT=52, RD=53, ST=54, AC=55, VAR=56, FNS=57, NUM=58, MAI=59;
	public static final int
		RULE_prog = 0, RULE_var_glo = 1, RULE_l_decl = 2, RULE_functs = 3, RULE_l_met = 4, 
		RULE_main = 5, RULE_decl = 6, RULE_t = 7, RULE_condi = 8, RULE_sino = 9, 
		RULE_default = 10, RULE_cicloS = 11, RULE_cicloD = 12, RULE_cicloP = 13, 
		RULE_comple = 14, RULE_inst = 15, RULE_l_impri = 16, RULE_impri = 17, 
		RULE_lectura = 18, RULE_asign = 19, RULE_l_inst = 20, RULE_metodo = 21, 
		RULE_funcion = 22, RULE_valor = 23, RULE_c_met = 24, RULE_variables = 25, 
		RULE_l_var = 26, RULE_declStru = 27, RULE_l_val = 28, RULE_struct = 29, 
		RULE_l_atrib = 30, RULE_atrib = 31, RULE_lista = 32, RULE_cont = 33, RULE_l_exp = 34, 
		RULE_arreg = 35, RULE_tipo = 36, RULE_expr = 37, RULE_and = 38, RULE_iguDif = 39, 
		RULE_menMay = 40, RULE_sumRes = 41, RULE_mulDiv = 42, RULE_unario = 43, 
		RULE_term = 44, RULE_identi = 45, RULE_c_identi = 46, RULE_ll_func = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "var_glo", "l_decl", "functs", "l_met", "main", "decl", "t", 
			"condi", "sino", "default", "cicloS", "cicloD", "cicloP", "comple", "inst", 
			"l_impri", "impri", "lectura", "asign", "l_inst", "metodo", "funcion", 
			"valor", "c_met", "variables", "l_var", "declStru", "l_val", "struct", 
			"l_atrib", "atrib", "lista", "cont", "l_exp", "arreg", "tipo", "expr", 
			"and", "iguDif", "menMay", "sumRes", "mulDiv", "unario", "term", "identi", 
			"c_identi", "ll_func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'>'", "':'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"'>>'", "'<<'", "'++'", "'--'", "'='", "','", "'textum'", "'decimalis'", 
			"'numerus'", "'littera'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'non'", "'.'", null, null, null, 
			null, null, null, null, null, null, "'perge'", "'interrumpe'", "'esto'", 
			"'series'", "'facere'", "'dum'", "'per'", "'aliter'", "'si'", "'finis'", 
			"'ratio'", "'reddere'", "'structura'", "'actio'", "'VARIABILES'", "'FINIS'", 
			"'NUMERA'", "'MAIOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "COMS_I", 
			"COMS", "INT", "DEC", "TEXT", "CHAR", "BOOL", "ID", "PR", "IT", "ES", 
			"SR", "FC", "DUM", "PER", "AT", "SI", "FN", "RT", "RD", "ST", "AC", "VAR", 
			"FNS", "NUM", "MAI"
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
	public String getGrammarFileName() { return "CodexLatinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexLatinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Var_gloContext var_glo() {
			return getRuleContext(Var_gloContext.class,0);
		}
		public FunctsContext functs() {
			return getRuleContext(FunctsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FNS() { return getToken(CodexLatinusParser.FNS, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			var_glo();
			setState(97);
			functs();
			setState(98);
			main();
			setState(99);
			match(FNS);
			setState(100);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_gloContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CodexLatinusParser.VAR, 0); }
		public L_declContext l_decl() {
			return getRuleContext(L_declContext.class,0);
		}
		public Var_gloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_glo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterVar_glo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitVar_glo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitVar_glo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_gloContext var_glo() throws RecognitionException {
		Var_gloContext _localctx = new Var_gloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_glo);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(VAR);
				setState(103);
				match(T__1);
				setState(104);
				l_decl();
				}
				break;
			case NUM:
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_declContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclStruContext> declStru() {
			return getRuleContexts(DeclStruContext.class);
		}
		public DeclStruContext declStru(int i) {
			return getRuleContext(DeclStruContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public L_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_declContext l_decl() throws RecognitionException {
		L_declContext _localctx = new L_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_l_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ES:
				case SR:
					{
					setState(108);
					decl();
					}
					break;
				case T__7:
					{
					setState(109);
					declStru();
					}
					break;
				case ST:
					{
					setState(110);
					struct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18067175067615488L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(CodexLatinusParser.NUM, 0); }
		public L_metContext l_met() {
			return getRuleContext(L_metContext.class,0);
		}
		public FunctsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFuncts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFuncts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFuncts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctsContext functs() throws RecognitionException {
		FunctsContext _localctx = new FunctsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functs);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(NUM);
				setState(116);
				match(T__1);
				setState(117);
				l_met();
				}
				break;
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_metContext extends ParserRuleContext {
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public L_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_met(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_met(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_metContext l_met() throws RecognitionException {
		L_metContext _localctx = new L_metContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_l_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AC:
					{
					setState(121);
					metodo();
					}
					break;
				case RT:
					{
					setState(122);
					funcion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RT || _la==AC );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAI() { return getToken(CodexLatinusParser.MAI, 0); }
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(MAI);
			setState(128);
			match(T__1);
			setState(129);
			l_inst();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ES() { return getToken(CodexLatinusParser.ES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CompleContext comple() {
			return getRuleContext(CompleContext.class,0);
		}
		public TerminalNode SR() { return getToken(CodexLatinusParser.SR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ES);
				setState(132);
				match(ID);
				setState(133);
				match(T__2);
				setState(134);
				tipo();
				setState(135);
				comple();
				}
				break;
			case SR:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(SR);
				setState(138);
				match(ID);
				setState(139);
				match(T__3);
				setState(140);
				expr(0);
				setState(141);
				match(T__4);
				setState(142);
				match(T__2);
				setState(143);
				t();
				setState(144);
				lista();
				setState(145);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_t);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				tipo();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CodexLatinusParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public CondiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCondi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondiContext condi() throws RecognitionException {
		CondiContext _localctx = new CondiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SI);
			setState(154);
			match(T__5);
			setState(155);
			expr(0);
			setState(156);
			match(T__6);
			setState(157);
			match(T__7);
			setState(158);
			l_inst();
			setState(159);
			match(T__8);
			setState(160);
			sino();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SinoContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CodexLatinusParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public DefaultContext default_() {
			return getRuleContext(DefaultContext.class,0);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sino);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(AT);
				setState(163);
				match(T__5);
				setState(164);
				expr(0);
				setState(165);
				match(T__6);
				setState(166);
				match(T__7);
				setState(167);
				l_inst();
				setState(168);
				match(T__8);
				setState(169);
				sino();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				default_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CodexLatinusParser.AT, 0); }
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(AT);
				setState(175);
				match(T__7);
				setState(176);
				l_inst();
				setState(177);
				match(T__8);
				setState(178);
				match(FN);
				setState(179);
				match(T__0);
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(FN);
				setState(182);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloSContext extends ParserRuleContext {
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public CicloSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCicloS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCicloS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCicloS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloSContext cicloS() throws RecognitionException {
		CicloSContext _localctx = new CicloSContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cicloS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DUM);
			setState(186);
			match(T__5);
			setState(187);
			expr(0);
			setState(188);
			match(T__6);
			setState(189);
			match(T__7);
			setState(190);
			l_inst();
			setState(191);
			match(T__8);
			setState(192);
			match(FN);
			setState(193);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloDContext extends ParserRuleContext {
		public TerminalNode FC() { return getToken(CodexLatinusParser.FC, 0); }
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public CicloDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCicloD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCicloD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCicloD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloDContext cicloD() throws RecognitionException {
		CicloDContext _localctx = new CicloDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cicloD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(FC);
			setState(196);
			match(T__7);
			setState(197);
			l_inst();
			setState(198);
			match(T__8);
			setState(199);
			match(DUM);
			setState(200);
			match(T__5);
			setState(201);
			expr(0);
			setState(202);
			match(T__6);
			setState(203);
			match(FN);
			setState(204);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloPContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(CodexLatinusParser.PER, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public CicloPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCicloP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCicloP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCicloP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloPContext cicloP() throws RecognitionException {
		CicloPContext _localctx = new CicloPContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cicloP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PER);
			setState(207);
			match(T__5);
			setState(208);
			decl();
			setState(209);
			match(T__0);
			setState(210);
			expr(0);
			setState(211);
			match(T__0);
			setState(212);
			asign();
			setState(213);
			match(T__6);
			setState(214);
			match(T__7);
			setState(215);
			l_inst();
			setState(216);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclStruContext declStru() {
			return getRuleContext(DeclStruContext.class,0);
		}
		public CompleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterComple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitComple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitComple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompleContext comple() throws RecognitionException {
		CompleContext _localctx = new CompleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comple);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__11:
			case T__12:
			case T__26:
			case T__27:
			case T__30:
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				expr(0);
				setState(219);
				match(T__0);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__0);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				declStru();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstContext extends ParserRuleContext {
		public CicloSContext cicloS() {
			return getRuleContext(CicloSContext.class,0);
		}
		public CicloPContext cicloP() {
			return getRuleContext(CicloPContext.class,0);
		}
		public CicloDContext cicloD() {
			return getRuleContext(CicloDContext.class,0);
		}
		public CondiContext condi() {
			return getRuleContext(CondiContext.class,0);
		}
		public TerminalNode RD() { return getToken(CodexLatinusParser.RD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PR() { return getToken(CodexLatinusParser.PR, 0); }
		public TerminalNode IT() { return getToken(CodexLatinusParser.IT, 0); }
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public L_impriContext l_impri() {
			return getRuleContext(L_impriContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inst);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				cicloS();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				cicloP();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				cicloD();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				condi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(RD);
				setState(230);
				expr(0);
				setState(231);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(PR);
				setState(234);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(IT);
				setState(236);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				asign();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(238);
				lectura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(239);
				l_impri();
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_impriContext extends ParserRuleContext {
		public List<ImpriContext> impri() {
			return getRuleContexts(ImpriContext.class);
		}
		public ImpriContext impri(int i) {
			return getRuleContext(ImpriContext.class,i);
		}
		public L_impriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_impri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_impri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_impri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_impri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_impriContext l_impri() throws RecognitionException {
		L_impriContext _localctx = new L_impriContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_l_impri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				impri();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
			setState(247);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImpriContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImpriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterImpri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitImpri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitImpri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpriContext impri() throws RecognitionException {
		ImpriContext _localctx = new ImpriContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_impri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__9);
			setState(250);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LecturaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lectura);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__10);
				}
				break;
			case T__5:
			case T__11:
			case T__12:
			case T__26:
			case T__27:
			case T__30:
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				expr(0);
				setState(254);
				match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignContext extends ParserRuleContext {
		public Token op;
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asign);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				identi(0);
				setState(259);
				((AsignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((AsignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				identi(0);
				setState(263);
				match(T__13);
				setState(264);
				expr(0);
				setState(265);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_instContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public L_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_inst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_instContext l_inst() throws RecognitionException {
		L_instContext _localctx = new L_instContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_l_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				inst();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10643206387547200L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(CodexLatinusParser.AC, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public L_atribContext l_atrib() {
			return getRuleContext(L_atribContext.class,0);
		}
		public C_metContext c_met() {
			return getRuleContext(C_metContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(AC);
			setState(275);
			match(ID);
			setState(276);
			match(T__5);
			setState(277);
			l_atrib();
			setState(278);
			match(T__6);
			setState(279);
			match(T__7);
			setState(280);
			c_met();
			setState(281);
			match(T__8);
			setState(282);
			match(FN);
			setState(283);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode RT() { return getToken(CodexLatinusParser.RT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public L_atribContext l_atrib() {
			return getRuleContext(L_atribContext.class,0);
		}
		public C_metContext c_met() {
			return getRuleContext(C_metContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RT);
			setState(286);
			tipo();
			setState(287);
			match(ID);
			setState(288);
			match(T__5);
			setState(289);
			l_atrib();
			setState(290);
			match(T__6);
			setState(291);
			match(T__7);
			setState(292);
			c_met();
			setState(293);
			match(T__8);
			setState(294);
			match(FN);
			setState(295);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclStruContext declStru() {
			return getRuleContext(DeclStruContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valor);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__11:
			case T__12:
			case T__26:
			case T__27:
			case T__30:
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				expr(0);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				declStru();
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_metContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public C_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterC_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitC_met(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitC_met(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_metContext c_met() throws RecognitionException {
		C_metContext _localctx = new C_metContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_c_met);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			variables();
			setState(302);
			l_inst();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CodexLatinusParser.VAR, 0); }
		public L_varContext l_var() {
			return getRuleContext(L_varContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(VAR);
			setState(305);
			match(T__3);
			setState(306);
			l_var();
			setState(307);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_varContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public L_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_varContext l_var() throws RecognitionException {
		L_varContext _localctx = new L_varContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_l_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				decl();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ES || _la==SR );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclStruContext extends ParserRuleContext {
		public L_valContext l_val() {
			return getRuleContext(L_valContext.class,0);
		}
		public DeclStruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declStru; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDeclStru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDeclStru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDeclStru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclStruContext declStru() throws RecognitionException {
		DeclStruContext _localctx = new DeclStruContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declStru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__7);
			setState(315);
			l_val(0);
			setState(316);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_valContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public L_valContext l_val() {
			return getRuleContext(L_valContext.class,0);
		}
		public L_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_valContext l_val() throws RecognitionException {
		return l_val(0);
	}

	private L_valContext l_val(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		L_valContext _localctx = new L_valContext(_ctx, _parentState);
		L_valContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_l_val, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			match(ID);
			setState(320);
			match(T__2);
			setState(321);
			valor();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new L_valContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_l_val);
					setState(323);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(324);
					match(T__14);
					setState(325);
					match(ID);
					setState(326);
					match(T__2);
					setState(327);
					valor();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends ParserRuleContext {
		public TerminalNode ST() { return getToken(CodexLatinusParser.ST, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public L_atribContext l_atrib() {
			return getRuleContext(L_atribContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ST);
			setState(334);
			match(ID);
			setState(335);
			match(T__7);
			setState(336);
			l_atrib();
			setState(337);
			match(T__8);
			setState(338);
			match(FN);
			setState(339);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_atribContext extends ParserRuleContext {
		public L_atribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_atrib; }
	 
		public L_atribContext() { }
		public void copyFrom(L_atribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Atrib_pcomaContext extends L_atribContext {
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public Atrib_pcomaContext(L_atribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAtrib_pcoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAtrib_pcoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAtrib_pcoma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Atrib_comaContext extends L_atribContext {
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public Atrib_comaContext(L_atribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAtrib_coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAtrib_coma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAtrib_coma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_atribContext l_atrib() throws RecognitionException {
		L_atribContext _localctx = new L_atribContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_l_atrib);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Atrib_comaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				atrib();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(342);
					match(T__14);
					setState(343);
					atrib();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Atrib_pcomaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(349);
					atrib();
					setState(350);
					match(T__0);
					}
					}
					setState(354); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ES || _la==SR );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public Token ta;
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ES() { return getToken(CodexLatinusParser.ES, 0); }
		public TerminalNode SR() { return getToken(CodexLatinusParser.SR, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((AtribContext)_localctx).ta = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ES || _la==SR) ) {
				((AtribContext)_localctx).ta = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
			match(ID);
			setState(360);
			match(T__2);
			setState(361);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__7);
			setState(364);
			cont();
			setState(365);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContContext extends ParserRuleContext {
		public L_expContext l_exp() {
			return getRuleContext(L_expContext.class,0);
		}
		public ContContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterCont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitCont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContContext cont() throws RecognitionException {
		ContContext _localctx = new ContContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cont);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__11:
			case T__12:
			case T__26:
			case T__27:
			case T__30:
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				l_exp();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class L_expContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public L_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterL_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitL_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitL_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_expContext l_exp() throws RecognitionException {
		L_expContext _localctx = new L_expContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_l_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			expr(0);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(372);
				match(T__14);
				setState(373);
				expr(0);
				}
				}
				setState(378);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArregContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArregContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterArreg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitArreg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitArreg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregContext arreg() throws RecognitionException {
		ArregContext _localctx = new ArregContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arreg);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(T__3);
				setState(380);
				expr(0);
				setState(381);
				match(T__4);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CodexLatinusParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3298535866368L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(389);
			and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(391);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(392);
					((ExprContext)_localctx).op = match(T__19);
					setState(393);
					and(0);
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ParserRuleContext {
		public Token op;
		public IguDifContext iguDif() {
			return getRuleContext(IguDifContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		return and(0);
	}

	private AndContext and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndContext _localctx = new AndContext(_ctx, _parentState);
		AndContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			iguDif(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(402);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(403);
					((AndContext)_localctx).op = match(T__20);
					setState(404);
					iguDif(0);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IguDifContext extends ParserRuleContext {
		public Token op;
		public MenMayContext menMay() {
			return getRuleContext(MenMayContext.class,0);
		}
		public IguDifContext iguDif() {
			return getRuleContext(IguDifContext.class,0);
		}
		public IguDifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iguDif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterIguDif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitIguDif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitIguDif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IguDifContext iguDif() throws RecognitionException {
		return iguDif(0);
	}

	private IguDifContext iguDif(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IguDifContext _localctx = new IguDifContext(_ctx, _parentState);
		IguDifContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_iguDif, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			menMay(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IguDifContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_iguDif);
					setState(413);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(414);
					((IguDifContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
						((IguDifContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(415);
					menMay(0);
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MenMayContext extends ParserRuleContext {
		public Token op;
		public SumResContext sumRes() {
			return getRuleContext(SumResContext.class,0);
		}
		public MenMayContext menMay() {
			return getRuleContext(MenMayContext.class,0);
		}
		public MenMayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menMay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMenMay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMenMay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMenMay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenMayContext menMay() throws RecognitionException {
		return menMay(0);
	}

	private MenMayContext menMay(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MenMayContext _localctx = new MenMayContext(_ctx, _parentState);
		MenMayContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_menMay, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(422);
			sumRes(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MenMayContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_menMay);
					setState(424);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(425);
					((MenMayContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440516L) != 0)) ) {
						((MenMayContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(426);
					sumRes(0);
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumResContext extends ParserRuleContext {
		public Token op;
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public SumResContext sumRes() {
			return getRuleContext(SumResContext.class,0);
		}
		public SumResContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumRes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterSumRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitSumRes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumResContext sumRes() throws RecognitionException {
		return sumRes(0);
	}

	private SumResContext sumRes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumResContext _localctx = new SumResContext(_ctx, _parentState);
		SumResContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_sumRes, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			mulDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumResContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumRes);
					setState(435);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(436);
					((SumResContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
						((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(437);
					mulDiv(0);
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ParserRuleContext {
		public Token op;
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public MulDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivContext mulDiv() throws RecognitionException {
		return mulDiv(0);
	}

	private MulDivContext mulDiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivContext _localctx = new MulDivContext(_ctx, _parentState);
		MulDivContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_mulDiv, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			unario();
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
					setState(446);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(447);
					((MulDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__28 || _la==T__29) ) {
						((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(448);
					unario();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnarioContext extends ParserRuleContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitUnario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnarioContext unario() throws RecognitionException {
		UnarioContext _localctx = new UnarioContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unario);
		int _la;
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				((UnarioContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2550136832L) != 0)) ) {
					((UnarioContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
				term();
				}
				break;
			case T__5:
			case T__11:
			case T__12:
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				term();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Token op;
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode DEC() { return getToken(CodexLatinusParser.DEC, 0); }
		public TerminalNode TEXT() { return getToken(CodexLatinusParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(CodexLatinusParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(CodexLatinusParser.BOOL, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_term);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(INT);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(DEC);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(TEXT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				match(CHAR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				identi(0);
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(465);
					((TermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__11 || _la==T__12) ) {
						((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				identi(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 8);
				{
				setState(470);
				match(T__5);
				setState(471);
				expr(0);
				setState(472);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentiContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public Ll_funcContext ll_func() {
			return getRuleContext(Ll_funcContext.class,0);
		}
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public C_identiContext c_identi() {
			return getRuleContext(C_identiContext.class,0);
		}
		public IdentiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterIdenti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitIdenti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitIdenti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentiContext identi() throws RecognitionException {
		return identi(0);
	}

	private IdentiContext identi(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentiContext _localctx = new IdentiContext(_ctx, _parentState);
		IdentiContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_identi, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(477);
				match(ID);
				}
				break;
			case 2:
				{
				setState(478);
				ll_func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentiContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identi);
					setState(481);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(482);
					c_identi();
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class C_identiContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public C_identiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_identi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterC_identi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitC_identi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitC_identi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_identiContext c_identi() throws RecognitionException {
		C_identiContext _localctx = new C_identiContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_c_identi);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(T__3);
				setState(489);
				expr(0);
				setState(490);
				match(T__4);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(T__31);
				setState(493);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ll_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public L_expContext l_exp() {
			return getRuleContext(L_expContext.class,0);
		}
		public Ll_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ll_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLl_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLl_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLl_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ll_funcContext ll_func() throws RecognitionException {
		Ll_funcContext _localctx = new Ll_funcContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ll_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(ID);
			setState(497);
			match(T__5);
			setState(498);
			l_exp();
			setState(499);
			match(T__6);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return l_val_sempred((L_valContext)_localctx, predIndex);
		case 37:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 38:
			return and_sempred((AndContext)_localctx, predIndex);
		case 39:
			return iguDif_sempred((IguDifContext)_localctx, predIndex);
		case 40:
			return menMay_sempred((MenMayContext)_localctx, predIndex);
		case 41:
			return sumRes_sempred((SumResContext)_localctx, predIndex);
		case 42:
			return mulDiv_sempred((MulDivContext)_localctx, predIndex);
		case 45:
			return identi_sempred((IdentiContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean l_val_sempred(L_valContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_sempred(AndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean iguDif_sempred(IguDifContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean menMay_sempred(MenMayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumRes_sempred(SumResContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulDiv_sempred(MulDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean identi_sempred(IdentiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u01f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002p\b\u0002\u000b\u0002\f\u0002q\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003x\b\u0003\u0001\u0004\u0001\u0004\u0004"+
		"\u0004|\b\u0004\u000b\u0004\f\u0004}\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0094\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0098\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00ad\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b8\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e0\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00f1\b\u000f\u0001\u0010\u0004\u0010"+
		"\u00f4\b\u0010\u000b\u0010\f\u0010\u00f5\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0101\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u010c\b\u0013\u0001\u0014\u0004\u0014\u010f\b\u0014\u000b\u0014"+
		"\f\u0014\u0110\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u012c\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0004\u001a\u0137\b\u001a\u000b\u001a\f\u001a\u0138\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0149\b\u001c\n\u001c\f\u001c\u014c\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0159\b\u001e\n\u001e\f\u001e\u015c\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0004\u001e\u0161\b\u001e\u000b\u001e\f\u001e\u0162\u0003\u001e"+
		"\u0165\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0003!\u0172\b!\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u0177\b\"\n\"\f\"\u017a\t\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0181\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u018b\b%\n%\f%\u018e\t%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0005&\u0196\b&\n&\f&\u0199\t&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u01a1\b\'\n\'\f\'\u01a4\t\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u01ac\b(\n(\f(\u01af\t(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u01b7\b)\n)\f)\u01ba\t)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u01c2\b*\n*\f*\u01c5\t*\u0001+\u0001+\u0001"+
		"+\u0003+\u01ca\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u01d3\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01db\b,\u0001"+
		"-\u0001-\u0001-\u0003-\u01e0\b-\u0001-\u0001-\u0005-\u01e4\b-\n-\f-\u01e7"+
		"\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01ef\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0000\b8JLNPRTZ0\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^\u0000\b\u0001\u0000\f\r\u0001\u0000,-\u0002"+
		"\u0000\u0010\u0013()\u0001\u0000\u0016\u0017\u0002\u0000\u0002\u0002\u0018"+
		"\u001a\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001e\u0002\u0000\u001b"+
		"\u001c\u001f\u001f\u01fa\u0000`\u0001\u0000\u0000\u0000\u0002j\u0001\u0000"+
		"\u0000\u0000\u0004o\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000"+
		"\b{\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0093\u0001"+
		"\u0000\u0000\u0000\u000e\u0097\u0001\u0000\u0000\u0000\u0010\u0099\u0001"+
		"\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00b7\u0001"+
		"\u0000\u0000\u0000\u0016\u00b9\u0001\u0000\u0000\u0000\u0018\u00c3\u0001"+
		"\u0000\u0000\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00df\u0001"+
		"\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000\u0000 \u00f3\u0001\u0000"+
		"\u0000\u0000\"\u00f9\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000"+
		"\u0000&\u010b\u0001\u0000\u0000\u0000(\u010e\u0001\u0000\u0000\u0000*"+
		"\u0112\u0001\u0000\u0000\u0000,\u011d\u0001\u0000\u0000\u0000.\u012b\u0001"+
		"\u0000\u0000\u00000\u012d\u0001\u0000\u0000\u00002\u0130\u0001\u0000\u0000"+
		"\u00004\u0136\u0001\u0000\u0000\u00006\u013a\u0001\u0000\u0000\u00008"+
		"\u013e\u0001\u0000\u0000\u0000:\u014d\u0001\u0000\u0000\u0000<\u0164\u0001"+
		"\u0000\u0000\u0000>\u0166\u0001\u0000\u0000\u0000@\u016b\u0001\u0000\u0000"+
		"\u0000B\u0171\u0001\u0000\u0000\u0000D\u0173\u0001\u0000\u0000\u0000F"+
		"\u0180\u0001\u0000\u0000\u0000H\u0182\u0001\u0000\u0000\u0000J\u0184\u0001"+
		"\u0000\u0000\u0000L\u018f\u0001\u0000\u0000\u0000N\u019a\u0001\u0000\u0000"+
		"\u0000P\u01a5\u0001\u0000\u0000\u0000R\u01b0\u0001\u0000\u0000\u0000T"+
		"\u01bb\u0001\u0000\u0000\u0000V\u01c9\u0001\u0000\u0000\u0000X\u01da\u0001"+
		"\u0000\u0000\u0000Z\u01df\u0001\u0000\u0000\u0000\\\u01ee\u0001\u0000"+
		"\u0000\u0000^\u01f0\u0001\u0000\u0000\u0000`a\u0003\u0002\u0001\u0000"+
		"ab\u0003\u0006\u0003\u0000bc\u0003\n\u0005\u0000cd\u00059\u0000\u0000"+
		"de\u0005\u0001\u0000\u0000e\u0001\u0001\u0000\u0000\u0000fg\u00058\u0000"+
		"\u0000gh\u0005\u0002\u0000\u0000hk\u0003\u0004\u0002\u0000ik\u0001\u0000"+
		"\u0000\u0000jf\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0003"+
		"\u0001\u0000\u0000\u0000lp\u0003\f\u0006\u0000mp\u00036\u001b\u0000np"+
		"\u0003:\u001d\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\u0005\u0001\u0000\u0000\u0000st\u0005"+
		":\u0000\u0000tu\u0005\u0002\u0000\u0000ux\u0003\b\u0004\u0000vx\u0001"+
		"\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x\u0007\u0001\u0000\u0000\u0000y|\u0003*\u0015\u0000z|\u0003,\u0016\u0000"+
		"{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\t\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005;\u0000\u0000\u0080\u0081\u0005\u0002\u0000"+
		"\u0000\u0081\u0082\u0003(\u0014\u0000\u0082\u000b\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005,\u0000\u0000\u0084\u0085\u0005)\u0000\u0000\u0085\u0086"+
		"\u0005\u0003\u0000\u0000\u0086\u0087\u0003H$\u0000\u0087\u0088\u0003\u001c"+
		"\u000e\u0000\u0088\u0094\u0001\u0000\u0000\u0000\u0089\u008a\u0005-\u0000"+
		"\u0000\u008a\u008b\u0005)\u0000\u0000\u008b\u008c\u0005\u0004\u0000\u0000"+
		"\u008c\u008d\u0003J%\u0000\u008d\u008e\u0005\u0005\u0000\u0000\u008e\u008f"+
		"\u0005\u0003\u0000\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091"+
		"\u0003@ \u0000\u0091\u0092\u0005\u0001\u0000\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093\u0083\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000"+
		"\u0000\u0000\u0094\r\u0001\u0000\u0000\u0000\u0095\u0098\u0003H$\u0000"+
		"\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u000f\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u00052\u0000\u0000\u009a\u009b\u0005\u0006\u0000\u0000\u009b"+
		"\u009c\u0003J%\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u009e\u0005"+
		"\b\u0000\u0000\u009e\u009f\u0003(\u0014\u0000\u009f\u00a0\u0005\t\u0000"+
		"\u0000\u00a0\u00a1\u0003\u0012\t\u0000\u00a1\u0011\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u00051\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4"+
		"\u00a5\u0003J%\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6\u00a7\u0005"+
		"\b\u0000\u0000\u00a7\u00a8\u0003(\u0014\u0000\u00a8\u00a9\u0005\t\u0000"+
		"\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0003\u0014\n\u0000\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u0013\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u00051\u0000\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1"+
		"\u0003(\u0014\u0000\u00b1\u00b2\u0005\t\u0000\u0000\u00b2\u00b3\u0005"+
		"3\u0000\u0000\u00b3\u00b4\u0005\u0001\u0000\u0000\u00b4\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u00053\u0000\u0000\u00b6\u00b8\u0005\u0001\u0000"+
		"\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u0015\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005/\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0003J%\u0000\u00bc\u00bd"+
		"\u0005\u0007\u0000\u0000\u00bd\u00be\u0005\b\u0000\u0000\u00be\u00bf\u0003"+
		"(\u0014\u0000\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u00c1\u00053\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u0017\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005.\u0000\u0000\u00c4\u00c5\u0005\b\u0000\u0000"+
		"\u00c5\u00c6\u0003(\u0014\u0000\u00c6\u00c7\u0005\t\u0000\u0000\u00c7"+
		"\u00c8\u0005/\u0000\u0000\u00c8\u00c9\u0005\u0006\u0000\u0000\u00c9\u00ca"+
		"\u0003J%\u0000\u00ca\u00cb\u0005\u0007\u0000\u0000\u00cb\u00cc\u00053"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd\u0019\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u00050\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000"+
		"\u0000\u00d0\u00d1\u0003\f\u0006\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000"+
		"\u00d2\u00d3\u0003J%\u0000\u00d3\u00d4\u0005\u0001\u0000\u0000\u00d4\u00d5"+
		"\u0003&\u0013\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6\u00d7\u0005"+
		"\b\u0000\u0000\u00d7\u00d8\u0003(\u0014\u0000\u00d8\u00d9\u0005\t\u0000"+
		"\u0000\u00d9\u001b\u0001\u0000\u0000\u0000\u00da\u00db\u0003J%\u0000\u00db"+
		"\u00dc\u0005\u0001\u0000\u0000\u00dc\u00e0\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0005\u0001\u0000\u0000\u00de\u00e0\u00036\u001b\u0000\u00df\u00da"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00f1"+
		"\u0003\u0016\u000b\u0000\u00e2\u00f1\u0003\u001a\r\u0000\u00e3\u00f1\u0003"+
		"\u0018\f\u0000\u00e4\u00f1\u0003\u0010\b\u0000\u00e5\u00e6\u00055\u0000"+
		"\u0000\u00e6\u00e7\u0003J%\u0000\u00e7\u00e8\u0005\u0001\u0000\u0000\u00e8"+
		"\u00f1\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005*\u0000\u0000\u00ea\u00f1"+
		"\u0005\u0001\u0000\u0000\u00eb\u00ec\u0005+\u0000\u0000\u00ec\u00f1\u0005"+
		"\u0001\u0000\u0000\u00ed\u00f1\u0003&\u0013\u0000\u00ee\u00f1\u0003$\u0012"+
		"\u0000\u00ef\u00f1\u0003 \u0010\u0000\u00f0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e2\u0001\u0000\u0000\u0000\u00f0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e4\u0001\u0000\u0000\u0000\u00f0\u00e5\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e9\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u001f\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003\"\u0011\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0001\u0000\u0000\u00f8!\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0005\n\u0000\u0000\u00fa\u00fb\u0003J%\u0000\u00fb#\u0001\u0000\u0000"+
		"\u0000\u00fc\u0101\u0005\u000b\u0000\u0000\u00fd\u00fe\u0003J%\u0000\u00fe"+
		"\u00ff\u0005\u000b\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100"+
		"\u00fc\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0101"+
		"%\u0001\u0000\u0000\u0000\u0102\u0103\u0003Z-\u0000\u0103\u0104\u0007"+
		"\u0000\u0000\u0000\u0104\u0105\u0005\u0001\u0000\u0000\u0105\u010c\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0003Z-\u0000\u0107\u0108\u0005\u000e\u0000"+
		"\u0000\u0108\u0109\u0003J%\u0000\u0109\u010a\u0005\u0001\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u0102\u0001\u0000\u0000\u0000\u010b"+
		"\u0106\u0001\u0000\u0000\u0000\u010c\'\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0003\u001e\u000f\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111)\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		"7\u0000\u0000\u0113\u0114\u0005)\u0000\u0000\u0114\u0115\u0005\u0006\u0000"+
		"\u0000\u0115\u0116\u0003<\u001e\u0000\u0116\u0117\u0005\u0007\u0000\u0000"+
		"\u0117\u0118\u0005\b\u0000\u0000\u0118\u0119\u00030\u0018\u0000\u0119"+
		"\u011a\u0005\t\u0000\u0000\u011a\u011b\u00053\u0000\u0000\u011b\u011c"+
		"\u0005\u0001\u0000\u0000\u011c+\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"4\u0000\u0000\u011e\u011f\u0003H$\u0000\u011f\u0120\u0005)\u0000\u0000"+
		"\u0120\u0121\u0005\u0006\u0000\u0000\u0121\u0122\u0003<\u001e\u0000\u0122"+
		"\u0123\u0005\u0007\u0000\u0000\u0123\u0124\u0005\b\u0000\u0000\u0124\u0125"+
		"\u00030\u0018\u0000\u0125\u0126\u0005\t\u0000\u0000\u0126\u0127\u0005"+
		"3\u0000\u0000\u0127\u0128\u0005\u0001\u0000\u0000\u0128-\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0003J%\u0000\u012a\u012c\u00036\u001b\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c"+
		"/\u0001\u0000\u0000\u0000\u012d\u012e\u00032\u0019\u0000\u012e\u012f\u0003"+
		"(\u0014\u0000\u012f1\u0001\u0000\u0000\u0000\u0130\u0131\u00058\u0000"+
		"\u0000\u0131\u0132\u0005\u0004\u0000\u0000\u0132\u0133\u00034\u001a\u0000"+
		"\u0133\u0134\u0005\u0005\u0000\u0000\u01343\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u0003\f\u0006\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u01395\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"\b\u0000\u0000\u013b\u013c\u00038\u001c\u0000\u013c\u013d\u0005\t\u0000"+
		"\u0000\u013d7\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u001c\uffff\uffff"+
		"\u0000\u013f\u0140\u0005)\u0000\u0000\u0140\u0141\u0005\u0003\u0000\u0000"+
		"\u0141\u0142\u0003.\u0017\u0000\u0142\u014a\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\n\u0002\u0000\u0000\u0144\u0145\u0005\u000f\u0000\u0000\u0145\u0146"+
		"\u0005)\u0000\u0000\u0146\u0147\u0005\u0003\u0000\u0000\u0147\u0149\u0003"+
		".\u0017\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b9\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u00056\u0000\u0000\u014e\u014f\u0005)\u0000\u0000\u014f"+
		"\u0150\u0005\b\u0000\u0000\u0150\u0151\u0003<\u001e\u0000\u0151\u0152"+
		"\u0005\t\u0000\u0000\u0152\u0153\u00053\u0000\u0000\u0153\u0154\u0005"+
		"\u0001\u0000\u0000\u0154;\u0001\u0000\u0000\u0000\u0155\u015a\u0003>\u001f"+
		"\u0000\u0156\u0157\u0005\u000f\u0000\u0000\u0157\u0159\u0003>\u001f\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u0165\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0003>\u001f\u0000\u015e\u015f\u0005\u0001\u0000\u0000\u015f"+
		"\u0161\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164"+
		"\u0155\u0001\u0000\u0000\u0000\u0164\u0160\u0001\u0000\u0000\u0000\u0165"+
		"=\u0001\u0000\u0000\u0000\u0166\u0167\u0007\u0001\u0000\u0000\u0167\u0168"+
		"\u0005)\u0000\u0000\u0168\u0169\u0005\u0003\u0000\u0000\u0169\u016a\u0003"+
		"H$\u0000\u016a?\u0001\u0000\u0000\u0000\u016b\u016c\u0005\b\u0000\u0000"+
		"\u016c\u016d\u0003B!\u0000\u016d\u016e\u0005\t\u0000\u0000\u016eA\u0001"+
		"\u0000\u0000\u0000\u016f\u0172\u0003D\"\u0000\u0170\u0172\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000"+
		"\u0000\u0000\u0172C\u0001\u0000\u0000\u0000\u0173\u0178\u0003J%\u0000"+
		"\u0174\u0175\u0005\u000f\u0000\u0000\u0175\u0177\u0003J%\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179E\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0005"+
		"\u0004\u0000\u0000\u017c\u017d\u0003J%\u0000\u017d\u017e\u0005\u0005\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000"+
		"\u0000\u0180\u017b\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0181G\u0001\u0000\u0000\u0000\u0182\u0183\u0007\u0002\u0000\u0000"+
		"\u0183I\u0001\u0000\u0000\u0000\u0184\u0185\u0006%\uffff\uffff\u0000\u0185"+
		"\u0186\u0003L&\u0000\u0186\u018c\u0001\u0000\u0000\u0000\u0187\u0188\n"+
		"\u0002\u0000\u0000\u0188\u0189\u0005\u0014\u0000\u0000\u0189\u018b\u0003"+
		"L&\u0000\u018a\u0187\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018dK\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0006&\uffff\uffff\u0000\u0190\u0191\u0003N\'\u0000\u0191"+
		"\u0197\u0001\u0000\u0000\u0000\u0192\u0193\n\u0002\u0000\u0000\u0193\u0194"+
		"\u0005\u0015\u0000\u0000\u0194\u0196\u0003N\'\u0000\u0195\u0192\u0001"+
		"\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198M\u0001\u0000"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0006\'\uffff"+
		"\uffff\u0000\u019b\u019c\u0003P(\u0000\u019c\u01a2\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\n\u0002\u0000\u0000\u019e\u019f\u0007\u0003\u0000\u0000\u019f"+
		"\u01a1\u0003P(\u0000\u01a0\u019d\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3O\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0006(\uffff\uffff\u0000\u01a6\u01a7\u0003R)"+
		"\u0000\u01a7\u01ad\u0001\u0000\u0000\u0000\u01a8\u01a9\n\u0002\u0000\u0000"+
		"\u01a9\u01aa\u0007\u0004\u0000\u0000\u01aa\u01ac\u0003R)\u0000\u01ab\u01a8"+
		"\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01aeQ\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u0006"+
		")\uffff\uffff\u0000\u01b1\u01b2\u0003T*\u0000\u01b2\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\n\u0002\u0000\u0000\u01b4\u01b5\u0007\u0005\u0000"+
		"\u0000\u01b5\u01b7\u0003T*\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b7"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9S\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0006*\uffff\uffff\u0000\u01bc\u01bd"+
		"\u0003V+\u0000\u01bd\u01c3\u0001\u0000\u0000\u0000\u01be\u01bf\n\u0002"+
		"\u0000\u0000\u01bf\u01c0\u0007\u0006\u0000\u0000\u01c0\u01c2\u0003V+\u0000"+
		"\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4U\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0007\u0007\u0000\u0000\u01c7\u01ca\u0003X,\u0000\u01c8\u01ca\u0003"+
		"X,\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000"+
		"\u0000\u01caW\u0001\u0000\u0000\u0000\u01cb\u01db\u0005$\u0000\u0000\u01cc"+
		"\u01db\u0005%\u0000\u0000\u01cd\u01db\u0005&\u0000\u0000\u01ce\u01db\u0005"+
		"\'\u0000\u0000\u01cf\u01db\u0005(\u0000\u0000\u01d0\u01d2\u0003Z-\u0000"+
		"\u01d1\u01d3\u0007\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01db\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0007\u0000\u0000\u0000\u01d5\u01db\u0003Z-\u0000\u01d6\u01d7"+
		"\u0005\u0006\u0000\u0000\u01d7\u01d8\u0003J%\u0000\u01d8\u01d9\u0005\u0007"+
		"\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01cb\u0001\u0000"+
		"\u0000\u0000\u01da\u01cc\u0001\u0000\u0000\u0000\u01da\u01cd\u0001\u0000"+
		"\u0000\u0000\u01da\u01ce\u0001\u0000\u0000\u0000\u01da\u01cf\u0001\u0000"+
		"\u0000\u0000\u01da\u01d0\u0001\u0000\u0000\u0000\u01da\u01d4\u0001\u0000"+
		"\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01dbY\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0006-\uffff\uffff\u0000\u01dd\u01e0\u0005)\u0000\u0000"+
		"\u01de\u01e0\u0003^/\u0000\u01df\u01dc\u0001\u0000\u0000\u0000\u01df\u01de"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e5\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\n\u0002\u0000\u0000\u01e2\u01e4\u0003\\.\u0000\u01e3\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6[\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005\u0004\u0000"+
		"\u0000\u01e9\u01ea\u0003J%\u0000\u01ea\u01eb\u0005\u0005\u0000\u0000\u01eb"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005 \u0000\u0000\u01ed\u01ef"+
		"\u0005)\u0000\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ef]\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005)\u0000"+
		"\u0000\u01f1\u01f2\u0005\u0006\u0000\u0000\u01f2\u01f3\u0003D\"\u0000"+
		"\u01f3\u01f4\u0005\u0007\u0000\u0000\u01f4_\u0001\u0000\u0000\u0000%j"+
		"oqw{}\u0093\u0097\u00ac\u00b7\u00df\u00f0\u00f5\u0100\u010b\u0110\u012b"+
		"\u0138\u014a\u015a\u0162\u0164\u0171\u0178\u0180\u018c\u0197\u01a2\u01ad"+
		"\u01b8\u01c3\u01c9\u01d2\u01da\u01df\u01e5\u01ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}