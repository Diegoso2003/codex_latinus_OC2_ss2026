// Generated from com/mycompany/antlr4/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.antlr4;
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
		WS=1, COMS_I=2, COMS=3, INT=4, DEC=5, TEXT=6, CHAR=7, BOOL=8, VERUM=9, 
		FALSUS=10, PR=11, IT=12, ES=13, SR=14, FC=15, DUM=16, PER=17, AT=18, SI=19, 
		FN=20, RT=21, RD=22, ST=23, AC=24, VAR=25, FNS=26, MUN=27, MAI=28, TXT=29, 
		DECI=30, NUME=31, LITT=32, PAA=33, PAC=34, LLAA=35, LLAC=36, CORA=37, 
		CORC=38, DPUN=39, PCO=40, COM=41, PUN=42, MAY=43, MAYI=44, MEN=45, MENI=46, 
		MAS=47, MENOS=48, POR=49, DIV=50, INCRE=51, DECRE=52, AND=53, OR=54, DIF=55, 
		IGU=56, NON=57, LEER=58, IMPRI=59, ASIG=60, ID=61;
	public static final int
		RULE_prog = 0, RULE_var_glo = 1, RULE_l_decl = 2, RULE_decl = 3, RULE_functs = 4, 
		RULE_l_met = 5, RULE_met = 6, RULE_main = 7, RULE_l_inst = 8, RULE_declS = 9, 
		RULE_valor_d = 10, RULE_comple = 11, RULE_condi = 12, RULE_sino = 13, 
		RULE_default = 14, RULE_cicloS = 15, RULE_paren_expr = 16, RULE_bloque = 17, 
		RULE_cicloD = 18, RULE_cicloP = 19, RULE_inst = 20, RULE_l_impri = 21, 
		RULE_impri = 22, RULE_lectura = 23, RULE_asign = 24, RULE_metodo = 25, 
		RULE_funcion = 26, RULE_valor = 27, RULE_c_met = 28, RULE_variables = 29, 
		RULE_declStru = 30, RULE_l_val = 31, RULE_val = 32, RULE_struct = 33, 
		RULE_l_atrib = 34, RULE_atrib_pcoma = 35, RULE_atrib = 36, RULE_lista = 37, 
		RULE_l_exp = 38, RULE_tipo = 39, RULE_expr = 40, RULE_and = 41, RULE_iguDif = 42, 
		RULE_menMay = 43, RULE_sumRes = 44, RULE_mulDiv = 45, RULE_unario = 46, 
		RULE_term = 47, RULE_identi = 48, RULE_c_identi = 49, RULE_ll_func = 50, 
		RULE_access_a = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "var_glo", "l_decl", "decl", "functs", "l_met", "met", "main", 
			"l_inst", "declS", "valor_d", "comple", "condi", "sino", "default", "cicloS", 
			"paren_expr", "bloque", "cicloD", "cicloP", "inst", "l_impri", "impri", 
			"lectura", "asign", "metodo", "funcion", "valor", "c_met", "variables", 
			"declStru", "l_val", "val", "struct", "l_atrib", "atrib_pcoma", "atrib", 
			"lista", "l_exp", "tipo", "expr", "and", "iguDif", "menMay", "sumRes", 
			"mulDiv", "unario", "term", "identi", "c_identi", "ll_func", "access_a"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'bool'", "'verum'", 
			"'falsus'", "'perge'", "'interrumpe'", "'esto'", "'series'", "'facere'", 
			"'dum'", "'per'", "'aliter'", "'si'", "'finis'", "'ratio'", "'reddere'", 
			"'structura'", "'actio'", "'VARIABILES'", "'FINIS'", "'MUNERA'", "'MAIOR'", 
			"'textum'", "'decimalis'", "'numerus'", "'littera'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "':'", "';'", "','", "'.'", "'>'", "'>='", "'<'", 
			"'<='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'&&'", "'||'", "'!='", 
			"'=='", "'non'", "'<<'", "'>>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMS_I", "COMS", "INT", "DEC", "TEXT", "CHAR", "BOOL", "VERUM", 
			"FALSUS", "PR", "IT", "ES", "SR", "FC", "DUM", "PER", "AT", "SI", "FN", 
			"RT", "RD", "ST", "AC", "VAR", "FNS", "MUN", "MAI", "TXT", "DECI", "NUME", 
			"LITT", "PAA", "PAC", "LLAA", "LLAC", "CORA", "CORC", "DPUN", "PCO", 
			"COM", "PUN", "MAY", "MAYI", "MEN", "MENI", "MAS", "MENOS", "POR", "DIV", 
			"INCRE", "DECRE", "AND", "OR", "DIF", "IGU", "NON", "LEER", "IMPRI", 
			"ASIG", "ID"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FNS() { return getToken(CodexLatinusParser.FNS, 0); }
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
		public Var_gloContext var_glo() {
			return getRuleContext(Var_gloContext.class,0);
		}
		public FunctsContext functs() {
			return getRuleContext(FunctsContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(104);
				var_glo();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUN) {
				{
				setState(107);
				functs();
				}
			}

			setState(110);
			main();
			setState(111);
			match(FNS);
			setState(112);
			match(PCO);
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
		public TerminalNode MAY() { return getToken(CodexLatinusParser.MAY, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(VAR);
			setState(115);
			match(MAY);
			setState(116);
			l_decl();
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
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				decl();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8413184L) != 0) );
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
		public DeclSContext declS() {
			return getRuleContext(DeclSContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
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
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
			case SR:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				declS();
				}
				break;
			case ST:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				struct();
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
	public static class FunctsContext extends ParserRuleContext {
		public TerminalNode MUN() { return getToken(CodexLatinusParser.MUN, 0); }
		public TerminalNode MAY() { return getToken(CodexLatinusParser.MAY, 0); }
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
		enterRule(_localctx, 8, RULE_functs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(MUN);
			setState(128);
			match(MAY);
			setState(129);
			l_met();
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
		public List<MetContext> met() {
			return getRuleContexts(MetContext.class);
		}
		public MetContext met(int i) {
			return getRuleContext(MetContext.class,i);
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
		enterRule(_localctx, 10, RULE_l_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				met();
				}
				}
				setState(134); 
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
	public static class MetContext extends ParserRuleContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public MetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetContext met() throws RecognitionException {
		MetContext _localctx = new MetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_met);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AC:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				metodo();
				}
				break;
			case RT:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				funcion();
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAI() { return getToken(CodexLatinusParser.MAI, 0); }
		public TerminalNode MAY() { return getToken(CodexLatinusParser.MAY, 0); }
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
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(MAI);
			setState(141);
			match(MAY);
			setState(142);
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
		enterRule(_localctx, 16, RULE_l_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				inst();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3321826946245721840L) != 0) );
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
	public static class DeclSContext extends ParserRuleContext {
		public DeclSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declS; }
	 
		public DeclSContext() { }
		public void copyFrom(DeclSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitivoContext extends DeclSContext {
		public TerminalNode ES() { return getToken(CodexLatinusParser.ES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode DPUN() { return getToken(CodexLatinusParser.DPUN, 0); }
		public Valor_dContext valor_d() {
			return getRuleContext(Valor_dContext.class,0);
		}
		public PrimitivoContext(DeclSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArregloContext extends DeclSContext {
		public TerminalNode SR() { return getToken(CodexLatinusParser.SR, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public Access_aContext access_a() {
			return getRuleContext(Access_aContext.class,0);
		}
		public TerminalNode DPUN() { return getToken(CodexLatinusParser.DPUN, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ArregloContext(DeclSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSContext declS() throws RecognitionException {
		DeclSContext _localctx = new DeclSContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declS);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
				_localctx = new PrimitivoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ES);
				setState(150);
				match(ID);
				setState(151);
				match(DPUN);
				setState(152);
				valor_d();
				}
				break;
			case SR:
				_localctx = new ArregloContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(SR);
				setState(154);
				match(ID);
				setState(155);
				access_a();
				setState(156);
				match(DPUN);
				setState(157);
				tipo();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LLAA) {
					{
					setState(158);
					lista();
					}
				}

				setState(161);
				match(PCO);
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
	public static class Valor_dContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CompleContext comple() {
			return getRuleContext(CompleContext.class,0);
		}
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public Valor_dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterValor_d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitValor_d(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitValor_d(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_dContext valor_d() throws RecognitionException {
		Valor_dContext _localctx = new Valor_dContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valor_d);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case TXT:
			case DECI:
			case NUME:
			case LITT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				tipo();
				setState(166);
				comple();
				}
				break;
			case VERUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(VERUM);
				}
				break;
			case FALSUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(FALSUS);
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
	public static class CompleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		enterRule(_localctx, 22, RULE_comple);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case VERUM:
			case FALSUS:
			case PAA:
			case MAS:
			case MENOS:
			case INCRE:
			case DECRE:
			case NON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				expr(0);
				setState(173);
				match(PCO);
				}
				break;
			case LLAA:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
	public static class CondiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CodexLatinusParser.SI, 0); }
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 24, RULE_condi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SI);
			setState(179);
			paren_expr();
			setState(180);
			bloque();
			setState(181);
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
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 26, RULE_sino);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(AT);
				setState(184);
				paren_expr();
				setState(185);
				bloque();
				setState(186);
				sino();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		enterRule(_localctx, 28, RULE_default);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(AT);
				setState(192);
				bloque();
				setState(193);
				match(FN);
				setState(194);
				match(PCO);
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(FN);
				setState(197);
				match(PCO);
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
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		enterRule(_localctx, 30, RULE_cicloS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DUM);
			setState(201);
			paren_expr();
			setState(202);
			bloque();
			setState(203);
			match(FN);
			setState(204);
			match(PCO);
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
	public static class Paren_exprContext extends ParserRuleContext {
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
		public Paren_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterParen_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitParen_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitParen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_exprContext paren_expr() throws RecognitionException {
		Paren_exprContext _localctx = new Paren_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PAA);
			setState(207);
			expr(0);
			setState(208);
			match(PAC);
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
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAA() { return getToken(CodexLatinusParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(CodexLatinusParser.LLAC, 0); }
		public L_instContext l_inst() {
			return getRuleContext(L_instContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LLAA);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3321826946245721840L) != 0)) {
				{
				setState(211);
				l_inst();
				}
			}

			setState(214);
			match(LLAC);
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
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		enterRule(_localctx, 36, RULE_cicloD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FC);
			setState(217);
			bloque();
			setState(218);
			match(DUM);
			setState(219);
			paren_expr();
			setState(220);
			match(PCO);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public DeclSContext declS() {
			return getRuleContext(DeclSContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
		public AsignContext asign() {
			return getRuleContext(AsignContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 38, RULE_cicloP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PER);
			setState(223);
			match(PAA);
			setState(224);
			declS();
			setState(225);
			expr(0);
			setState(226);
			match(PCO);
			setState(227);
			asign();
			setState(228);
			match(PAC);
			setState(229);
			bloque();
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
		public DeclSContext declS() {
			return getRuleContext(DeclSContext.class,0);
		}
		public CondiContext condi() {
			return getRuleContext(CondiContext.class,0);
		}
		public TerminalNode RD() { return getToken(CodexLatinusParser.RD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		public Ll_funcContext ll_func() {
			return getRuleContext(Ll_funcContext.class,0);
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
		enterRule(_localctx, 40, RULE_inst);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				cicloS();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				cicloP();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				cicloD();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				declS();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				condi();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				match(RD);
				setState(237);
				expr(0);
				setState(238);
				match(PCO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				match(PR);
				setState(241);
				match(PCO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				match(IT);
				setState(243);
				match(PCO);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				asign();
				setState(245);
				match(PCO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				lectura();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				l_impri();
				setState(249);
				match(PCO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(251);
				ll_func();
				setState(252);
				match(PCO);
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
		enterRule(_localctx, 42, RULE_l_impri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				impri();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPRI );
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
		public TerminalNode IMPRI() { return getToken(CodexLatinusParser.IMPRI, 0); }
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
		enterRule(_localctx, 44, RULE_impri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IMPRI);
			setState(262);
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
		public TerminalNode LEER() { return getToken(CodexLatinusParser.LEER, 0); }
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
		enterRule(_localctx, 46, RULE_lectura);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEER:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(LEER);
				}
				break;
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case VERUM:
			case FALSUS:
			case PAA:
			case MAS:
			case MENOS:
			case INCRE:
			case DECRE:
			case NON:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				expr(0);
				setState(266);
				match(LEER);
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
		public TerminalNode INCRE() { return getToken(CodexLatinusParser.INCRE, 0); }
		public TerminalNode DECRE() { return getToken(CodexLatinusParser.DECRE, 0); }
		public TerminalNode ASIG() { return getToken(CodexLatinusParser.ASIG, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 48, RULE_asign);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				identi(0);
				setState(271);
				((AsignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCRE || _la==DECRE) ) {
					((AsignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((AsignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCRE || _la==DECRE) ) {
					((AsignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				identi(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				identi(0);
				setState(276);
				match(ASIG);
				setState(277);
				valor();
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
	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(CodexLatinusParser.AC, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
		public TerminalNode LLAA() { return getToken(CodexLatinusParser.LLAA, 0); }
		public C_metContext c_met() {
			return getRuleContext(C_metContext.class,0);
		}
		public TerminalNode LLAC() { return getToken(CodexLatinusParser.LLAC, 0); }
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
		public L_atribContext l_atrib() {
			return getRuleContext(L_atribContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(AC);
			setState(282);
			match(ID);
			setState(283);
			match(PAA);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ES || _la==SR) {
				{
				setState(284);
				l_atrib();
				}
			}

			setState(287);
			match(PAC);
			setState(288);
			match(LLAA);
			setState(289);
			c_met();
			setState(290);
			match(LLAC);
			setState(291);
			match(FN);
			setState(292);
			match(PCO);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
		public TerminalNode LLAA() { return getToken(CodexLatinusParser.LLAA, 0); }
		public C_metContext c_met() {
			return getRuleContext(C_metContext.class,0);
		}
		public TerminalNode LLAC() { return getToken(CodexLatinusParser.LLAC, 0); }
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
		public L_atribContext l_atrib() {
			return getRuleContext(L_atribContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RT);
			setState(295);
			tipo();
			setState(296);
			match(ID);
			setState(297);
			match(PAA);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ES || _la==SR) {
				{
				setState(298);
				l_atrib();
				}
			}

			setState(301);
			match(PAC);
			setState(302);
			match(LLAA);
			setState(303);
			c_met();
			setState(304);
			match(LLAC);
			setState(305);
			match(FN);
			setState(306);
			match(PCO);
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
		enterRule(_localctx, 54, RULE_valor);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case VERUM:
			case FALSUS:
			case PAA:
			case MAS:
			case MENOS:
			case INCRE:
			case DECRE:
			case NON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				expr(0);
				}
				break;
			case LLAA:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
		enterRule(_localctx, 56, RULE_c_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(312);
				variables();
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3321826946245721840L) != 0)) {
				{
				setState(315);
				l_inst();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CodexLatinusParser.VAR, 0); }
		public TerminalNode CORA() { return getToken(CodexLatinusParser.CORA, 0); }
		public L_declContext l_decl() {
			return getRuleContext(L_declContext.class,0);
		}
		public TerminalNode CORC() { return getToken(CodexLatinusParser.CORC, 0); }
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
		enterRule(_localctx, 58, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(VAR);
			setState(319);
			match(CORA);
			setState(320);
			l_decl();
			setState(321);
			match(CORC);
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
		public TerminalNode LLAA() { return getToken(CodexLatinusParser.LLAA, 0); }
		public L_valContext l_val() {
			return getRuleContext(L_valContext.class,0);
		}
		public TerminalNode LLAC() { return getToken(CodexLatinusParser.LLAC, 0); }
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
		enterRule(_localctx, 60, RULE_declStru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LLAA);
			setState(324);
			l_val();
			setState(325);
			match(LLAC);
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
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(CodexLatinusParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(CodexLatinusParser.COM, i);
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
		L_valContext _localctx = new L_valContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_l_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			val();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(328);
				match(COM);
				setState(329);
				val();
				}
				}
				setState(334);
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
	public static class ValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode DPUN() { return getToken(CodexLatinusParser.DPUN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ID);
			setState(336);
			match(DPUN);
			setState(337);
			valor();
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
	public static class StructContext extends ParserRuleContext {
		public TerminalNode ST() { return getToken(CodexLatinusParser.ST, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode LLAA() { return getToken(CodexLatinusParser.LLAA, 0); }
		public L_atribContext l_atrib() {
			return getRuleContext(L_atribContext.class,0);
		}
		public TerminalNode LLAC() { return getToken(CodexLatinusParser.LLAC, 0); }
		public TerminalNode FN() { return getToken(CodexLatinusParser.FN, 0); }
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		enterRule(_localctx, 66, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ST);
			setState(340);
			match(ID);
			setState(341);
			match(LLAA);
			setState(342);
			l_atrib();
			setState(343);
			match(LLAC);
			setState(344);
			match(FN);
			setState(345);
			match(PCO);
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
	public static class LAtribComaContext extends L_atribContext {
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(CodexLatinusParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(CodexLatinusParser.COM, i);
		}
		public LAtribComaContext(L_atribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLAtribComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLAtribComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLAtribComa(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LAtribPcomaContext extends L_atribContext {
		public List<Atrib_pcomaContext> atrib_pcoma() {
			return getRuleContexts(Atrib_pcomaContext.class);
		}
		public Atrib_pcomaContext atrib_pcoma(int i) {
			return getRuleContext(Atrib_pcomaContext.class,i);
		}
		public LAtribPcomaContext(L_atribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLAtribPcoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLAtribPcoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLAtribPcoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_atribContext l_atrib() throws RecognitionException {
		L_atribContext _localctx = new L_atribContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_l_atrib);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new LAtribComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				atrib();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(348);
					match(COM);
					setState(349);
					atrib();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LAtribPcomaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(355);
					atrib_pcoma();
					}
					}
					setState(358); 
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
	public static class Atrib_pcomaContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
		public Atrib_pcomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib_pcoma; }
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

	public final Atrib_pcomaContext atrib_pcoma() throws RecognitionException {
		Atrib_pcomaContext _localctx = new Atrib_pcomaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_atrib_pcoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			atrib();
			setState(363);
			match(PCO);
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
		public TerminalNode DPUN() { return getToken(CodexLatinusParser.DPUN, 0); }
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
		enterRule(_localctx, 72, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
			setState(366);
			match(ID);
			setState(367);
			match(DPUN);
			setState(368);
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
		public TerminalNode LLAA() { return getToken(CodexLatinusParser.LLAA, 0); }
		public TerminalNode LLAC() { return getToken(CodexLatinusParser.LLAC, 0); }
		public L_expContext l_exp() {
			return getRuleContext(L_expContext.class,0);
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
		enterRule(_localctx, 74, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(LLAA);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2457135817785607920L) != 0)) {
				{
				setState(371);
				l_exp();
				}
			}

			setState(374);
			match(LLAC);
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
		public List<TerminalNode> COM() { return getTokens(CodexLatinusParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(CodexLatinusParser.COM, i);
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
		enterRule(_localctx, 76, RULE_l_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			expr(0);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(377);
				match(COM);
				setState(378);
				expr(0);
				}
				}
				setState(383);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TXT() { return getToken(CodexLatinusParser.TXT, 0); }
		public TerminalNode DECI() { return getToken(CodexLatinusParser.DECI, 0); }
		public TerminalNode NUME() { return getToken(CodexLatinusParser.NUME, 0); }
		public TerminalNode LITT() { return getToken(CodexLatinusParser.LITT, 0); }
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
		enterRule(_localctx, 78, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843017266757888L) != 0)) ) {
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
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(CodexLatinusParser.OR, 0); }
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(387);
			and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(389);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(390);
					match(OR);
					setState(391);
					and(0);
					}
					} 
				}
				setState(396);
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
	public static class AndContext extends ParserRuleContext {
		public IguDifContext iguDif() {
			return getRuleContext(IguDifContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public TerminalNode AND() { return getToken(CodexLatinusParser.AND, 0); }
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398);
			iguDif(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(400);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(401);
					match(AND);
					setState(402);
					iguDif(0);
					}
					} 
				}
				setState(407);
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
	public static class IguDifContext extends ParserRuleContext {
		public MenMayContext menMay() {
			return getRuleContext(MenMayContext.class,0);
		}
		public IguDifContext iguDif() {
			return getRuleContext(IguDifContext.class,0);
		}
		public TerminalNode IGU() { return getToken(CodexLatinusParser.IGU, 0); }
		public TerminalNode DIF() { return getToken(CodexLatinusParser.DIF, 0); }
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_iguDif, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			menMay(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IguDifContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_iguDif);
					setState(411);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(412);
					_la = _input.LA(1);
					if ( !(_la==DIF || _la==IGU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(413);
					menMay(0);
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public SumResContext sumRes() {
			return getRuleContext(SumResContext.class,0);
		}
		public MenMayContext menMay() {
			return getRuleContext(MenMayContext.class,0);
		}
		public TerminalNode MEN() { return getToken(CodexLatinusParser.MEN, 0); }
		public TerminalNode MAY() { return getToken(CodexLatinusParser.MAY, 0); }
		public TerminalNode MENI() { return getToken(CodexLatinusParser.MENI, 0); }
		public TerminalNode MAYI() { return getToken(CodexLatinusParser.MAYI, 0); }
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_menMay, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			sumRes(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MenMayContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_menMay);
					setState(422);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(423);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(424);
					sumRes(0);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public SumResContext sumRes() {
			return getRuleContext(SumResContext.class,0);
		}
		public TerminalNode MAS() { return getToken(CodexLatinusParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(CodexLatinusParser.MENOS, 0); }
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_sumRes, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			mulDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumResContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumRes);
					setState(433);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(434);
					_la = _input.LA(1);
					if ( !(_la==MAS || _la==MENOS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(435);
					mulDiv(0);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public TerminalNode POR() { return getToken(CodexLatinusParser.POR, 0); }
		public TerminalNode DIV() { return getToken(CodexLatinusParser.DIV, 0); }
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_mulDiv, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(442);
			unario();
			}
			_ctx.stop = _input.LT(-1);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
					setState(444);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(445);
					_la = _input.LA(1);
					if ( !(_la==POR || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(446);
					unario();
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(CodexLatinusParser.MENOS, 0); }
		public TerminalNode MAS() { return getToken(CodexLatinusParser.MAS, 0); }
		public TerminalNode NON() { return getToken(CodexLatinusParser.NON, 0); }
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
		enterRule(_localctx, 92, RULE_unario);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
			case MENOS:
			case NON:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144537400540921856L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(453);
				term();
				}
				break;
			case INT:
			case DEC:
			case TEXT:
			case CHAR:
			case VERUM:
			case FALSUS:
			case PAA:
			case INCRE:
			case DECRE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
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
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode DEC() { return getToken(CodexLatinusParser.DEC, 0); }
		public TerminalNode TEXT() { return getToken(CodexLatinusParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(CodexLatinusParser.CHAR, 0); }
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode INCRE() { return getToken(CodexLatinusParser.INCRE, 0); }
		public TerminalNode DECRE() { return getToken(CodexLatinusParser.DECRE, 0); }
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
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
		enterRule(_localctx, 94, RULE_term);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(INT);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(DEC);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(TEXT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(CHAR);
				}
				break;
			case VERUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				match(VERUM);
				}
				break;
			case FALSUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(FALSUS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				identi(0);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(464);
					_la = _input.LA(1);
					if ( !(_la==INCRE || _la==DECRE) ) {
					_errHandler.recoverInline(this);
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
			case INCRE:
			case DECRE:
				enterOuterAlt(_localctx, 8);
				{
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==INCRE || _la==DECRE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(468);
				identi(0);
				}
				break;
			case PAA:
				enterOuterAlt(_localctx, 9);
				{
				setState(469);
				paren_expr();
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_identi, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(473);
				match(ID);
				}
				break;
			case 2:
				{
				setState(474);
				ll_func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentiContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identi);
					setState(477);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(478);
					c_identi();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		public Access_aContext access_a() {
			return getRuleContext(Access_aContext.class,0);
		}
		public TerminalNode PUN() { return getToken(CodexLatinusParser.PUN, 0); }
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
		enterRule(_localctx, 98, RULE_c_identi);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORA:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				access_a();
				}
				break;
			case PUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(PUN);
				setState(486);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
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
		enterRule(_localctx, 100, RULE_ll_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(ID);
			setState(490);
			match(PAA);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2457135817785607920L) != 0)) {
				{
				setState(491);
				l_exp();
				}
			}

			setState(494);
			match(PAC);
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
	public static class Access_aContext extends ParserRuleContext {
		public TerminalNode CORA() { return getToken(CodexLatinusParser.CORA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORC() { return getToken(CodexLatinusParser.CORC, 0); }
		public Access_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAccess_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAccess_a(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAccess_a(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_aContext access_a() throws RecognitionException {
		Access_aContext _localctx = new Access_aContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_access_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(CORA);
			setState(497);
			expr(0);
			setState(498);
			match(CORC);
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
		case 40:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 41:
			return and_sempred((AndContext)_localctx, predIndex);
		case 42:
			return iguDif_sempred((IguDifContext)_localctx, predIndex);
		case 43:
			return menMay_sempred((MenMayContext)_localctx, predIndex);
		case 44:
			return sumRes_sempred((SumResContext)_localctx, predIndex);
		case 45:
			return mulDiv_sempred((MulDivContext)_localctx, predIndex);
		case 48:
			return identi_sempred((IdentiContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_sempred(AndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean iguDif_sempred(IguDifContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean menMay_sempred(MenMayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumRes_sempred(SumResContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulDiv_sempred(MulDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean identi_sempred(IdentiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u01f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0003\u0000j\b\u0000\u0001\u0000\u0003"+
		"\u0000m\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002x\b"+
		"\u0002\u000b\u0002\f\u0002y\u0001\u0003\u0001\u0003\u0003\u0003~\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005"+
		"\u0085\b\u0005\u000b\u0005\f\u0005\u0086\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0004\b\u0092\b\b\u000b\b\f\b\u0093\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a0\b\t\u0001"+
		"\t\u0001\t\u0003\t\u00a4\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b1\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00be\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c7\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00d5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00ff\b\u0014\u0001\u0015\u0004\u0015\u0102\b"+
		"\u0015\u000b\u0015\f\u0015\u0103\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010d\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0118\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u011e\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u012c"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0137\b\u001b\u0001"+
		"\u001c\u0003\u001c\u013a\b\u001c\u0001\u001c\u0003\u001c\u013d\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u014b\b\u001f\n\u001f\f\u001f\u014e\t\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0005\"\u015f\b\"\n\"\f\"\u0162\t\"\u0001\""+
		"\u0004\"\u0165\b\"\u000b\"\f\"\u0166\u0003\"\u0169\b\"\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0003%\u0175\b%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0005&\u017c\b&\n&\f&\u017f\t&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0189\b(\n(\f(\u018c"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0194\b)\n)\f)\u0197"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u019f\b*\n*\f*\u01a2"+
		"\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u01aa\b+\n+\f+\u01ad"+
		"\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u01b5\b,\n,\f,\u01b8"+
		"\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u01c0\b-\n-\f-\u01c3"+
		"\t-\u0001.\u0001.\u0001.\u0003.\u01c8\b.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u01d2\b/\u0001/\u0001/\u0001/\u0003/\u01d7"+
		"\b/\u00010\u00010\u00010\u00030\u01dc\b0\u00010\u00010\u00050\u01e0\b"+
		"0\n0\f0\u01e3\t0\u00011\u00011\u00011\u00031\u01e8\b1\u00012\u00012\u0001"+
		"2\u00032\u01ed\b2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0000"+
		"\u0007PRTVXZ`4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\b"+
		"\u0001\u000034\u0001\u0000\r\u000e\u0003\u0000\b\b\u001d ==\u0001\u0000"+
		"78\u0001\u0000+.\u0001\u0000/0\u0001\u000012\u0002\u0000/099\u01fd\u0000"+
		"i\u0001\u0000\u0000\u0000\u0002r\u0001\u0000\u0000\u0000\u0004w\u0001"+
		"\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000"+
		"\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000"+
		"\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000\u0000"+
		"\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000"+
		"\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000"+
		"\u0000\u001a\u00bd\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000\u0000"+
		"\u0000\u001e\u00c8\u0001\u0000\u0000\u0000 \u00ce\u0001\u0000\u0000\u0000"+
		"\"\u00d2\u0001\u0000\u0000\u0000$\u00d8\u0001\u0000\u0000\u0000&\u00de"+
		"\u0001\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000\u0000*\u0101\u0001\u0000"+
		"\u0000\u0000,\u0105\u0001\u0000\u0000\u0000.\u010c\u0001\u0000\u0000\u0000"+
		"0\u0117\u0001\u0000\u0000\u00002\u0119\u0001\u0000\u0000\u00004\u0126"+
		"\u0001\u0000\u0000\u00006\u0136\u0001\u0000\u0000\u00008\u0139\u0001\u0000"+
		"\u0000\u0000:\u013e\u0001\u0000\u0000\u0000<\u0143\u0001\u0000\u0000\u0000"+
		">\u0147\u0001\u0000\u0000\u0000@\u014f\u0001\u0000\u0000\u0000B\u0153"+
		"\u0001\u0000\u0000\u0000D\u0168\u0001\u0000\u0000\u0000F\u016a\u0001\u0000"+
		"\u0000\u0000H\u016d\u0001\u0000\u0000\u0000J\u0172\u0001\u0000\u0000\u0000"+
		"L\u0178\u0001\u0000\u0000\u0000N\u0180\u0001\u0000\u0000\u0000P\u0182"+
		"\u0001\u0000\u0000\u0000R\u018d\u0001\u0000\u0000\u0000T\u0198\u0001\u0000"+
		"\u0000\u0000V\u01a3\u0001\u0000\u0000\u0000X\u01ae\u0001\u0000\u0000\u0000"+
		"Z\u01b9\u0001\u0000\u0000\u0000\\\u01c7\u0001\u0000\u0000\u0000^\u01d6"+
		"\u0001\u0000\u0000\u0000`\u01db\u0001\u0000\u0000\u0000b\u01e7\u0001\u0000"+
		"\u0000\u0000d\u01e9\u0001\u0000\u0000\u0000f\u01f0\u0001\u0000\u0000\u0000"+
		"hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000km\u0003\b\u0004\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0003\u000e"+
		"\u0007\u0000op\u0005\u001a\u0000\u0000pq\u0005(\u0000\u0000q\u0001\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0019\u0000\u0000st\u0005+\u0000\u0000tu\u0003"+
		"\u0004\u0002\u0000u\u0003\u0001\u0000\u0000\u0000vx\u0003\u0006\u0003"+
		"\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0005\u0001\u0000\u0000\u0000"+
		"{~\u0003\u0012\t\u0000|~\u0003B!\u0000}{\u0001\u0000\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u001b"+
		"\u0000\u0000\u0080\u0081\u0005+\u0000\u0000\u0081\u0082\u0003\n\u0005"+
		"\u0000\u0082\t\u0001\u0000\u0000\u0000\u0083\u0085\u0003\f\u0006\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u000b\u0001\u0000\u0000\u0000\u0088\u008b\u00032\u0019\u0000\u0089"+
		"\u008b\u00034\u001a\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u001c\u0000\u0000\u008d\u008e\u0005+\u0000\u0000\u008e\u008f\u0003\u0010"+
		"\b\u0000\u008f\u000f\u0001\u0000\u0000\u0000\u0090\u0092\u0003(\u0014"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0011\u0001\u0000\u0000\u0000\u0095\u0096\u0005\r\u0000\u0000"+
		"\u0096\u0097\u0005=\u0000\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098"+
		"\u00a4\u0003\u0014\n\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a\u009b"+
		"\u0005=\u0000\u0000\u009b\u009c\u0003f3\u0000\u009c\u009d\u0005\'\u0000"+
		"\u0000\u009d\u009f\u0003N\'\u0000\u009e\u00a0\u0003J%\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005(\u0000\u0000\u00a2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a3\u0095\u0001\u0000\u0000\u0000\u00a3\u0099\u0001"+
		"\u0000\u0000\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003"+
		"N\'\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0005\t\u0000\u0000\u00a9\u00ab\u0005\n\u0000"+
		"\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0015\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0003P(\u0000\u00ad\u00ae\u0005(\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00b1\u0003<\u001e\u0000\u00b0\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u0017"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0013\u0000\u0000\u00b3\u00b4"+
		"\u0003 \u0010\u0000\u00b4\u00b5\u0003\"\u0011\u0000\u00b5\u00b6\u0003"+
		"\u001a\r\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0012"+
		"\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000\u00b9\u00ba\u0003\"\u0011"+
		"\u0000\u00ba\u00bb\u0003\u001a\r\u0000\u00bb\u00be\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0003\u001c\u000e\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u001b\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0012\u0000\u0000\u00c0\u00c1\u0003\"\u0011\u0000\u00c1"+
		"\u00c2\u0005\u0014\u0000\u0000\u00c2\u00c3\u0005(\u0000\u0000\u00c3\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0014\u0000\u0000\u00c5\u00c7"+
		"\u0005(\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0010\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000\u00ca\u00cb\u0003\""+
		"\u0011\u0000\u00cb\u00cc\u0005\u0014\u0000\u0000\u00cc\u00cd\u0005(\u0000"+
		"\u0000\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005!\u0000\u0000"+
		"\u00cf\u00d0\u0003P(\u0000\u00d0\u00d1\u0005\"\u0000\u0000\u00d1!\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0005#\u0000\u0000\u00d3\u00d5\u0003\u0010"+
		"\b\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005$\u0000\u0000"+
		"\u00d7#\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000f\u0000\u0000\u00d9"+
		"\u00da\u0003\"\u0011\u0000\u00da\u00db\u0005\u0010\u0000\u0000\u00db\u00dc"+
		"\u0003 \u0010\u0000\u00dc\u00dd\u0005(\u0000\u0000\u00dd%\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u0011\u0000\u0000\u00df\u00e0\u0005!\u0000"+
		"\u0000\u00e0\u00e1\u0003\u0012\t\u0000\u00e1\u00e2\u0003P(\u0000\u00e2"+
		"\u00e3\u0005(\u0000\u0000\u00e3\u00e4\u00030\u0018\u0000\u00e4\u00e5\u0005"+
		"\"\u0000\u0000\u00e5\u00e6\u0003\"\u0011\u0000\u00e6\'\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ff\u0003\u001e\u000f\u0000\u00e8\u00ff\u0003&\u0013\u0000"+
		"\u00e9\u00ff\u0003$\u0012\u0000\u00ea\u00ff\u0003\u0012\t\u0000\u00eb"+
		"\u00ff\u0003\u0018\f\u0000\u00ec\u00ed\u0005\u0016\u0000\u0000\u00ed\u00ee"+
		"\u0003P(\u0000\u00ee\u00ef\u0005(\u0000\u0000\u00ef\u00ff\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005\u000b\u0000\u0000\u00f1\u00ff\u0005(\u0000"+
		"\u0000\u00f2\u00f3\u0005\f\u0000\u0000\u00f3\u00ff\u0005(\u0000\u0000"+
		"\u00f4\u00f5\u00030\u0018\u0000\u00f5\u00f6\u0005(\u0000\u0000\u00f6\u00ff"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ff\u0003.\u0017\u0000\u00f8\u00f9\u0003"+
		"*\u0015\u0000\u00f9\u00fa\u0005(\u0000\u0000\u00fa\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0003d2\u0000\u00fc\u00fd\u0005(\u0000\u0000\u00fd"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fe\u00e7\u0001\u0000\u0000\u0000\u00fe"+
		"\u00e8\u0001\u0000\u0000\u0000\u00fe\u00e9\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ea\u0001\u0000\u0000\u0000\u00fe\u00eb\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ec\u0001\u0000\u0000\u0000\u00fe\u00f0\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f2\u0001\u0000\u0000\u0000\u00fe\u00f4\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fb\u0001\u0000\u0000\u0000\u00ff)\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0003,\u0016\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104+\u0001\u0000\u0000\u0000\u0105\u0106\u0005;\u0000"+
		"\u0000\u0106\u0107\u0003P(\u0000\u0107-\u0001\u0000\u0000\u0000\u0108"+
		"\u010d\u0005:\u0000\u0000\u0109\u010a\u0003P(\u0000\u010a\u010b\u0005"+
		":\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000"+
		"\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d/\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0003`0\u0000\u010f\u0110\u0007\u0000\u0000\u0000\u0110"+
		"\u0118\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0000\u0000\u0000\u0112"+
		"\u0118\u0003`0\u0000\u0113\u0114\u0003`0\u0000\u0114\u0115\u0005<\u0000"+
		"\u0000\u0115\u0116\u00036\u001b\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u010e\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000"+
		"\u0117\u0113\u0001\u0000\u0000\u0000\u01181\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0018\u0000\u0000\u011a\u011b\u0005=\u0000\u0000\u011b\u011d"+
		"\u0005!\u0000\u0000\u011c\u011e\u0003D\"\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005\"\u0000\u0000\u0120\u0121\u0005#\u0000"+
		"\u0000\u0121\u0122\u00038\u001c\u0000\u0122\u0123\u0005$\u0000\u0000\u0123"+
		"\u0124\u0005\u0014\u0000\u0000\u0124\u0125\u0005(\u0000\u0000\u01253\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005\u0015\u0000\u0000\u0127\u0128\u0003"+
		"N\'\u0000\u0128\u0129\u0005=\u0000\u0000\u0129\u012b\u0005!\u0000\u0000"+
		"\u012a\u012c\u0003D\"\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005\"\u0000\u0000\u012e\u012f\u0005#\u0000\u0000\u012f\u0130"+
		"\u00038\u001c\u0000\u0130\u0131\u0005$\u0000\u0000\u0131\u0132\u0005\u0014"+
		"\u0000\u0000\u0132\u0133\u0005(\u0000\u0000\u01335\u0001\u0000\u0000\u0000"+
		"\u0134\u0137\u0003P(\u0000\u0135\u0137\u0003<\u001e\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u01377\u0001"+
		"\u0000\u0000\u0000\u0138\u013a\u0003:\u001d\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0003\u0010\b\u0000\u013c\u013b\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d9\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005\u0019\u0000\u0000\u013f\u0140\u0005%\u0000\u0000\u0140"+
		"\u0141\u0003\u0004\u0002\u0000\u0141\u0142\u0005&\u0000\u0000\u0142;\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005#\u0000\u0000\u0144\u0145\u0003>\u001f"+
		"\u0000\u0145\u0146\u0005$\u0000\u0000\u0146=\u0001\u0000\u0000\u0000\u0147"+
		"\u014c\u0003@ \u0000\u0148\u0149\u0005)\u0000\u0000\u0149\u014b\u0003"+
		"@ \u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d?\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005=\u0000\u0000\u0150\u0151\u0005\'\u0000\u0000\u0151"+
		"\u0152\u00036\u001b\u0000\u0152A\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"\u0017\u0000\u0000\u0154\u0155\u0005=\u0000\u0000\u0155\u0156\u0005#\u0000"+
		"\u0000\u0156\u0157\u0003D\"\u0000\u0157\u0158\u0005$\u0000\u0000\u0158"+
		"\u0159\u0005\u0014\u0000\u0000\u0159\u015a\u0005(\u0000\u0000\u015aC\u0001"+
		"\u0000\u0000\u0000\u015b\u0160\u0003H$\u0000\u015c\u015d\u0005)\u0000"+
		"\u0000\u015d\u015f\u0003H$\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f"+
		"\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u0169\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0163\u0165\u0003F#\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001"+
		"\u0000\u0000\u0000\u0168\u015b\u0001\u0000\u0000\u0000\u0168\u0164\u0001"+
		"\u0000\u0000\u0000\u0169E\u0001\u0000\u0000\u0000\u016a\u016b\u0003H$"+
		"\u0000\u016b\u016c\u0005(\u0000\u0000\u016cG\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0007\u0001\u0000\u0000\u016e\u016f\u0005=\u0000\u0000\u016f\u0170"+
		"\u0005\'\u0000\u0000\u0170\u0171\u0003N\'\u0000\u0171I\u0001\u0000\u0000"+
		"\u0000\u0172\u0174\u0005#\u0000\u0000\u0173\u0175\u0003L&\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0005$\u0000\u0000\u0177K\u0001"+
		"\u0000\u0000\u0000\u0178\u017d\u0003P(\u0000\u0179\u017a\u0005)\u0000"+
		"\u0000\u017a\u017c\u0003P(\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c"+
		"\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017eM\u0001\u0000\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0007\u0002\u0000\u0000\u0181O\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0006(\uffff\uffff\u0000\u0183\u0184\u0003"+
		"R)\u0000\u0184\u018a\u0001\u0000\u0000\u0000\u0185\u0186\n\u0002\u0000"+
		"\u0000\u0186\u0187\u00056\u0000\u0000\u0187\u0189\u0003R)\u0000\u0188"+
		"\u0185\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a"+
		"\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"Q\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0006)\uffff\uffff\u0000\u018e\u018f\u0003T*\u0000\u018f\u0195\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\n\u0002\u0000\u0000\u0191\u0192\u00055"+
		"\u0000\u0000\u0192\u0194\u0003T*\u0000\u0193\u0190\u0001\u0000\u0000\u0000"+
		"\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u0196S\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0006*\uffff\uffff\u0000\u0199"+
		"\u019a\u0003V+\u0000\u019a\u01a0\u0001\u0000\u0000\u0000\u019b\u019c\n"+
		"\u0002\u0000\u0000\u019c\u019d\u0007\u0003\u0000\u0000\u019d\u019f\u0003"+
		"V+\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1U\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0006+\uffff\uffff\u0000\u01a4\u01a5\u0003X,\u0000\u01a5"+
		"\u01ab\u0001\u0000\u0000\u0000\u01a6\u01a7\n\u0002\u0000\u0000\u01a7\u01a8"+
		"\u0007\u0004\u0000\u0000\u01a8\u01aa\u0003X,\u0000\u01a9\u01a6\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01acW\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0006,\uffff\uffff"+
		"\u0000\u01af\u01b0\u0003Z-\u0000\u01b0\u01b6\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\n\u0002\u0000\u0000\u01b2\u01b3\u0007\u0005\u0000\u0000\u01b3\u01b5"+
		"\u0003Z-\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7Y\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0006-\uffff\uffff\u0000\u01ba\u01bb\u0003\\.\u0000"+
		"\u01bb\u01c1\u0001\u0000\u0000\u0000\u01bc\u01bd\n\u0002\u0000\u0000\u01bd"+
		"\u01be\u0007\u0006\u0000\u0000\u01be\u01c0\u0003\\.\u0000\u01bf\u01bc"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2[\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c5\u0007"+
		"\u0007\u0000\u0000\u01c5\u01c8\u0003^/\u0000\u01c6\u01c8\u0003^/\u0000"+
		"\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8]\u0001\u0000\u0000\u0000\u01c9\u01d7\u0005\u0004\u0000\u0000\u01ca"+
		"\u01d7\u0005\u0005\u0000\u0000\u01cb\u01d7\u0005\u0006\u0000\u0000\u01cc"+
		"\u01d7\u0005\u0007\u0000\u0000\u01cd\u01d7\u0005\t\u0000\u0000\u01ce\u01d7"+
		"\u0005\n\u0000\u0000\u01cf\u01d1\u0003`0\u0000\u01d0\u01d2\u0007\u0000"+
		"\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d7\u0001\u0000\u0000\u0000\u01d3\u01d4\u0007\u0000"+
		"\u0000\u0000\u01d4\u01d7\u0003`0\u0000\u01d5\u01d7\u0003 \u0010\u0000"+
		"\u01d6\u01c9\u0001\u0000\u0000\u0000\u01d6\u01ca\u0001\u0000\u0000\u0000"+
		"\u01d6\u01cb\u0001\u0000\u0000\u0000\u01d6\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d6\u01cd\u0001\u0000\u0000\u0000\u01d6\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d6\u01cf\u0001\u0000\u0000\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7_\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u00060\uffff\uffff\u0000\u01d9\u01dc\u0005=\u0000\u0000\u01da\u01dc"+
		"\u0003d2\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000"+
		"\u0000\u0000\u01dc\u01e1\u0001\u0000\u0000\u0000\u01dd\u01de\n\u0002\u0000"+
		"\u0000\u01de\u01e0\u0003b1\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e2a\u0001\u0000\u0000\u0000\u01e3\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e8\u0003f3\u0000\u01e5\u01e6\u0005*"+
		"\u0000\u0000\u01e6\u01e8\u0005=\u0000\u0000\u01e7\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8c\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0005=\u0000\u0000\u01ea\u01ec\u0005!\u0000\u0000\u01eb\u01ed"+
		"\u0003L&\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\"\u0000"+
		"\u0000\u01efe\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005%\u0000\u0000\u01f1"+
		"\u01f2\u0003P(\u0000\u01f2\u01f3\u0005&\u0000\u0000\u01f3g\u0001\u0000"+
		"\u0000\u0000*ily}\u0086\u008a\u0093\u009f\u00a3\u00aa\u00b0\u00bd\u00c6"+
		"\u00d4\u00fe\u0103\u010c\u0117\u011d\u012b\u0136\u0139\u013c\u014c\u0160"+
		"\u0166\u0168\u0174\u017d\u018a\u0195\u01a0\u01ab\u01b6\u01c1\u01c7\u01d1"+
		"\u01d6\u01db\u01e1\u01e7\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}