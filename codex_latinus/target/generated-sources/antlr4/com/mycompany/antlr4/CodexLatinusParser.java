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
		FN=20, RT=21, RD=22, ST=23, AC=24, VAR=25, FNS=26, MUN=27, MAI=28, PAA=29, 
		PAC=30, LLAA=31, LLAC=32, CORA=33, CORC=34, DPUN=35, PCO=36, MAY=37, MAYI=38, 
		MEN=39, MENI=40, MAS=41, MENOS=42, POR=43, DIV=44, INCRE=45, DECRE=46, 
		AND=47, OR=48, DIF=49, IGU=50, NON=51, COM=52, PUN=53, LEER=54, IMPRI=55, 
		ASIG=56, TXT=57, DECI=58, NUME=59, LITT=60, ID=61;
	public static final int
		RULE_prog = 0, RULE_var_glo = 1, RULE_l_decl = 2, RULE_decl = 3, RULE_functs = 4, 
		RULE_l_met = 5, RULE_met = 6, RULE_main = 7, RULE_l_inst = 8, RULE_declS = 9, 
		RULE_condi = 10, RULE_sino = 11, RULE_default = 12, RULE_cicloS = 13, 
		RULE_bloque = 14, RULE_cicloD = 15, RULE_cicloP = 16, RULE_comple = 17, 
		RULE_inst = 18, RULE_l_impri = 19, RULE_impri = 20, RULE_lectura = 21, 
		RULE_asign = 22, RULE_metodo = 23, RULE_funcion = 24, RULE_valor = 25, 
		RULE_c_met = 26, RULE_variables = 27, RULE_declStru = 28, RULE_l_val = 29, 
		RULE_val = 30, RULE_struct = 31, RULE_l_atrib = 32, RULE_atrib_pcoma = 33, 
		RULE_atrib = 34, RULE_lista = 35, RULE_l_exp = 36, RULE_tipo = 37, RULE_expr = 38, 
		RULE_and = 39, RULE_iguDif = 40, RULE_menMay = 41, RULE_sumRes = 42, RULE_mulDiv = 43, 
		RULE_unario = 44, RULE_term = 45, RULE_identi = 46, RULE_c_identi = 47, 
		RULE_ll_func = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "var_glo", "l_decl", "decl", "functs", "l_met", "met", "main", 
			"l_inst", "declS", "condi", "sino", "default", "cicloS", "bloque", "cicloD", 
			"cicloP", "comple", "inst", "l_impri", "impri", "lectura", "asign", "metodo", 
			"funcion", "valor", "c_met", "variables", "declStru", "l_val", "val", 
			"struct", "l_atrib", "atrib_pcoma", "atrib", "lista", "l_exp", "tipo", 
			"expr", "and", "iguDif", "menMay", "sumRes", "mulDiv", "unario", "term", 
			"identi", "c_identi", "ll_func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'bool'", "'verum'", 
			"'falsus'", "'perge'", "'interrumpe'", "'esto'", "'series'", "'facere'", 
			"'dum'", "'per'", "'aliter'", "'si'", "'finis'", "'ratio'", "'reddere'", 
			"'structura'", "'actio'", "'VARIABILES'", "'FINIS'", "'MUNERA'", "'MAIOR'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "'>'", "'>='", 
			"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'&&'", "'||'", 
			"'!='", "'=='", "'non'", "','", "'.'", "'<<'", "'>>'", "'='", "'textum'", 
			"'decimalis'", "'numerus'", "'littera'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMS_I", "COMS", "INT", "DEC", "TEXT", "CHAR", "BOOL", "VERUM", 
			"FALSUS", "PR", "IT", "ES", "SR", "FC", "DUM", "PER", "AT", "SI", "FN", 
			"RT", "RD", "ST", "AC", "VAR", "FNS", "MUN", "MAI", "PAA", "PAC", "LLAA", 
			"LLAC", "CORA", "CORC", "DPUN", "PCO", "MAY", "MAYI", "MEN", "MENI", 
			"MAS", "MENOS", "POR", "DIV", "INCRE", "DECRE", "AND", "OR", "DIF", "IGU", 
			"NON", "COM", "PUN", "LEER", "IMPRI", "ASIG", "TXT", "DECI", "NUME", 
			"LITT", "ID"
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(98);
				var_glo();
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUN) {
				{
				setState(101);
				functs();
				}
			}

			setState(104);
			main();
			setState(105);
			match(FNS);
			setState(106);
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
			setState(108);
			match(VAR);
			setState(109);
			match(MAY);
			setState(110);
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
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				decl();
				}
				}
				setState(115); 
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
			case SR:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				declS();
				}
				break;
			case ST:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
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
			setState(121);
			match(MUN);
			setState(122);
			match(MAY);
			setState(123);
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
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				met();
				}
				}
				setState(128); 
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AC:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				metodo();
				}
				break;
			case RT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
			setState(134);
			match(MAI);
			setState(135);
			match(MAY);
			setState(136);
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
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				inst();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2362250155283709680L) != 0) );
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CompleContext comple() {
			return getRuleContext(CompleContext.class,0);
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
		public TerminalNode CORA() { return getToken(CodexLatinusParser.CORA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORC() { return getToken(CodexLatinusParser.CORC, 0); }
		public TerminalNode DPUN() { return getToken(CodexLatinusParser.DPUN, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode PCO() { return getToken(CodexLatinusParser.PCO, 0); }
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
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ES:
				_localctx = new PrimitivoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ES);
				setState(144);
				match(ID);
				setState(145);
				match(DPUN);
				setState(146);
				tipo();
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(147);
					comple();
					}
					break;
				}
				}
				break;
			case SR:
				_localctx = new ArregloContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(SR);
				setState(151);
				match(ID);
				setState(152);
				match(CORA);
				setState(153);
				expr(0);
				setState(154);
				match(CORC);
				setState(155);
				match(DPUN);
				setState(156);
				tipo();
				setState(157);
				lista();
				setState(158);
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
	public static class CondiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CodexLatinusParser.SI, 0); }
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
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
		enterRule(_localctx, 20, RULE_condi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SI);
			setState(163);
			match(PAA);
			setState(164);
			expr(0);
			setState(165);
			match(PAC);
			setState(166);
			bloque();
			setState(167);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
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
		enterRule(_localctx, 22, RULE_sino);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(AT);
				setState(170);
				match(PAA);
				setState(171);
				expr(0);
				setState(172);
				match(PAC);
				setState(173);
				bloque();
				setState(174);
				sino();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
		enterRule(_localctx, 24, RULE_default);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(AT);
				setState(180);
				bloque();
				setState(181);
				match(FN);
				setState(182);
				match(PCO);
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(FN);
				setState(185);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
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
		enterRule(_localctx, 26, RULE_cicloS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(DUM);
			setState(189);
			match(PAA);
			setState(190);
			expr(0);
			setState(191);
			match(PAC);
			setState(192);
			bloque();
			setState(193);
			match(FN);
			setState(194);
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
		enterRule(_localctx, 28, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LLAA);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2362250155283709680L) != 0)) {
				{
				setState(197);
				l_inst();
				}
			}

			setState(200);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
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
		enterRule(_localctx, 30, RULE_cicloD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(FC);
			setState(203);
			bloque();
			setState(204);
			match(DUM);
			setState(205);
			match(PAA);
			setState(206);
			expr(0);
			setState(207);
			match(PAC);
			setState(208);
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
		enterRule(_localctx, 32, RULE_cicloP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(PER);
			setState(211);
			match(PAA);
			setState(212);
			declS();
			setState(213);
			expr(0);
			setState(214);
			match(PCO);
			setState(215);
			asign();
			setState(216);
			match(PAC);
			setState(217);
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
		enterRule(_localctx, 34, RULE_comple);
		try {
			setState(224);
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
				setState(219);
				expr(0);
				setState(220);
				match(PCO);
				}
				break;
			case PCO:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(PCO);
				}
				break;
			case LLAA:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
		enterRule(_localctx, 36, RULE_inst);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				cicloS();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				cicloP();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				cicloD();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				declS();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				condi();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(RD);
				setState(232);
				expr(0);
				setState(233);
				match(PCO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(PR);
				setState(236);
				match(PCO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(IT);
				setState(238);
				match(PCO);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				asign();
				setState(240);
				match(PCO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				lectura();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(243);
				l_impri();
				setState(244);
				match(PCO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(246);
				ll_func();
				setState(247);
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
		enterRule(_localctx, 38, RULE_l_impri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				impri();
				}
				}
				setState(254); 
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
		enterRule(_localctx, 40, RULE_impri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(IMPRI);
			setState(257);
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
		enterRule(_localctx, 42, RULE_lectura);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEER:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
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
				setState(260);
				expr(0);
				setState(261);
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
		enterRule(_localctx, 44, RULE_asign);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				identi(0);
				setState(266);
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
				setState(268);
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
				setState(269);
				identi(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				identi(0);
				setState(271);
				match(ASIG);
				setState(272);
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
		enterRule(_localctx, 46, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(AC);
			setState(277);
			match(ID);
			setState(278);
			match(PAA);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ES || _la==SR) {
				{
				setState(279);
				l_atrib();
				}
			}

			setState(282);
			match(PAC);
			setState(283);
			match(LLAA);
			setState(284);
			c_met();
			setState(285);
			match(LLAC);
			setState(286);
			match(FN);
			setState(287);
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
		enterRule(_localctx, 48, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(RT);
			setState(290);
			tipo();
			setState(291);
			match(ID);
			setState(292);
			match(PAA);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ES || _la==SR) {
				{
				setState(293);
				l_atrib();
				}
			}

			setState(296);
			match(PAC);
			setState(297);
			match(LLAA);
			setState(298);
			c_met();
			setState(299);
			match(LLAC);
			setState(300);
			match(FN);
			setState(301);
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
		enterRule(_localctx, 50, RULE_valor);
		try {
			setState(305);
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
				setState(303);
				expr(0);
				}
				break;
			case LLAA:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
		enterRule(_localctx, 52, RULE_c_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(307);
				variables();
				}
			}

			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2362250155283709680L) != 0)) {
				{
				setState(310);
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
		enterRule(_localctx, 54, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(VAR);
			setState(314);
			match(CORA);
			setState(315);
			l_decl();
			setState(316);
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
		enterRule(_localctx, 56, RULE_declStru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(LLAA);
			setState(319);
			l_val();
			setState(320);
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
		enterRule(_localctx, 58, RULE_l_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			val();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(323);
				match(COM);
				setState(324);
				val();
				}
				}
				setState(329);
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
		enterRule(_localctx, 60, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ID);
			setState(331);
			match(DPUN);
			setState(332);
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
		enterRule(_localctx, 62, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ST);
			setState(335);
			match(ID);
			setState(336);
			match(LLAA);
			setState(337);
			l_atrib();
			setState(338);
			match(LLAC);
			setState(339);
			match(FN);
			setState(340);
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
		enterRule(_localctx, 64, RULE_l_atrib);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LAtribComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				atrib();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(343);
					match(COM);
					setState(344);
					atrib();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LAtribPcomaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					atrib_pcoma();
					}
					}
					setState(353); 
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
		enterRule(_localctx, 66, RULE_atrib_pcoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			atrib();
			setState(358);
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
		enterRule(_localctx, 68, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
			setState(361);
			match(ID);
			setState(362);
			match(DPUN);
			setState(363);
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
		enterRule(_localctx, 70, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LLAA);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2308206959750285040L) != 0)) {
				{
				setState(366);
				l_exp();
				}
			}

			setState(369);
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
		enterRule(_localctx, 72, RULE_l_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			expr(0);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(372);
				match(COM);
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
		enterRule(_localctx, 74, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4467570830351532288L) != 0)) ) {
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(384);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(385);
					match(OR);
					setState(386);
					and(0);
					}
					} 
				}
				setState(391);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(393);
			iguDif(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(395);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(396);
					match(AND);
					setState(397);
					iguDif(0);
					}
					} 
				}
				setState(402);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_iguDif, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			menMay(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IguDifContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_iguDif);
					setState(406);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(407);
					_la = _input.LA(1);
					if ( !(_la==DIF || _la==IGU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(408);
					menMay(0);
					}
					} 
				}
				setState(413);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_menMay, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415);
			sumRes(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MenMayContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_menMay);
					setState(417);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(418);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(419);
					sumRes(0);
					}
					} 
				}
				setState(424);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_sumRes, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(426);
			mulDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumResContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumRes);
					setState(428);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(429);
					_la = _input.LA(1);
					if ( !(_la==MAS || _la==MENOS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(430);
					mulDiv(0);
					}
					} 
				}
				setState(435);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_mulDiv, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(437);
			unario();
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
					setState(439);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(440);
					_la = _input.LA(1);
					if ( !(_la==POR || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(441);
					unario();
					}
					} 
				}
				setState(446);
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
		enterRule(_localctx, 88, RULE_unario);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
			case MENOS:
			case NON:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2258396883451904L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
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
				setState(449);
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
		public TerminalNode PAA() { return getToken(CodexLatinusParser.PAA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAC() { return getToken(CodexLatinusParser.PAC, 0); }
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
		enterRule(_localctx, 90, RULE_term);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(INT);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(DEC);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(TEXT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(CHAR);
				}
				break;
			case VERUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				match(VERUM);
				}
				break;
			case FALSUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(FALSUS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				identi(0);
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(459);
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
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==INCRE || _la==DECRE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				identi(0);
				}
				break;
			case PAA:
				enterOuterAlt(_localctx, 9);
				{
				setState(464);
				match(PAA);
				setState(465);
				expr(0);
				setState(466);
				match(PAC);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_identi, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(471);
				match(ID);
				}
				break;
			case 2:
				{
				setState(472);
				ll_func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentiContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identi);
					setState(475);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(476);
					c_identi();
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		public TerminalNode CORA() { return getToken(CodexLatinusParser.CORA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORC() { return getToken(CodexLatinusParser.CORC, 0); }
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
		enterRule(_localctx, 94, RULE_c_identi);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORA:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(CORA);
				setState(483);
				expr(0);
				setState(484);
				match(CORC);
				}
				break;
			case PUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(PUN);
				setState(487);
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
		enterRule(_localctx, 96, RULE_ll_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ID);
			setState(491);
			match(PAA);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2308206959750285040L) != 0)) {
				{
				setState(492);
				l_exp();
				}
			}

			setState(495);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 39:
			return and_sempred((AndContext)_localctx, predIndex);
		case 40:
			return iguDif_sempred((IguDifContext)_localctx, predIndex);
		case 41:
			return menMay_sempred((MenMayContext)_localctx, predIndex);
		case 42:
			return sumRes_sempred((SumResContext)_localctx, predIndex);
		case 43:
			return mulDiv_sempred((MulDivContext)_localctx, predIndex);
		case 46:
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
		"\u0004\u0001=\u01f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0003\u0000"+
		"d\b\u0000\u0001\u0000\u0003\u0000g\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0004\u0002r\b\u0002\u000b\u0002\f\u0002s\u0001\u0003\u0001\u0003"+
		"\u0003\u0003x\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0004\u0005\u007f\b\u0005\u000b\u0005\f\u0005\u0080\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0004\b\u008c\b\b\u000b\b\f\b\u008d\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a1"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00b2\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00bb\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00e1\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00fa\b\u0012\u0001\u0013\u0004\u0013"+
		"\u00fd\b\u0013\u000b\u0013\f\u0013\u00fe\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0108"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0113\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0119\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0127\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0132"+
		"\b\u0019\u0001\u001a\u0003\u001a\u0135\b\u001a\u0001\u001a\u0003\u001a"+
		"\u0138\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0146\b\u001d\n\u001d\f\u001d\u0149\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u015a\b \n \f \u015d\t \u0001 \u0004 \u0160\b "+
		"\u000b \f \u0161\u0003 \u0164\b \u0001!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0170\b#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0005$\u0177\b$\n$\f$\u017a\t$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0184\b&\n&\f&\u0187\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u018f\b\'\n\'\f\'\u0192\t\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u019a\b(\n(\f(\u019d"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01a5\b)\n)\f)\u01a8"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01b0\b*\n*\f*\u01b3"+
		"\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u01bb\b+\n+\f+\u01be"+
		"\t+\u0001,\u0001,\u0001,\u0003,\u01c3\b,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u01cd\b-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u01d5\b-\u0001.\u0001.\u0001.\u0003.\u01da\b.\u0001.\u0001"+
		".\u0005.\u01de\b.\n.\f.\u01e1\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u01e9\b/\u00010\u00010\u00010\u00030\u01ee\b0\u00010\u00010\u0001"+
		"0\u0000\u0007LNPRTV\\1\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`\u0000\b\u0001\u0000-.\u0001\u0000\r\u000e\u0002\u0000\b\b9=\u0001\u0000"+
		"12\u0001\u0000%(\u0001\u0000)*\u0001\u0000+,\u0002\u0000)*33\u01fc\u0000"+
		"c\u0001\u0000\u0000\u0000\u0002l\u0001\u0000\u0000\u0000\u0004q\u0001"+
		"\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000"+
		"\u0000\n~\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e"+
		"\u0086\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012"+
		"\u00a0\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016"+
		"\u00b1\u0001\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000\u0000\u001a"+
		"\u00bc\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000\u0000\u001e"+
		"\u00ca\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\"\u00e0"+
		"\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000\u0000&\u00fc\u0001\u0000"+
		"\u0000\u0000(\u0100\u0001\u0000\u0000\u0000*\u0107\u0001\u0000\u0000\u0000"+
		",\u0112\u0001\u0000\u0000\u0000.\u0114\u0001\u0000\u0000\u00000\u0121"+
		"\u0001\u0000\u0000\u00002\u0131\u0001\u0000\u0000\u00004\u0134\u0001\u0000"+
		"\u0000\u00006\u0139\u0001\u0000\u0000\u00008\u013e\u0001\u0000\u0000\u0000"+
		":\u0142\u0001\u0000\u0000\u0000<\u014a\u0001\u0000\u0000\u0000>\u014e"+
		"\u0001\u0000\u0000\u0000@\u0163\u0001\u0000\u0000\u0000B\u0165\u0001\u0000"+
		"\u0000\u0000D\u0168\u0001\u0000\u0000\u0000F\u016d\u0001\u0000\u0000\u0000"+
		"H\u0173\u0001\u0000\u0000\u0000J\u017b\u0001\u0000\u0000\u0000L\u017d"+
		"\u0001\u0000\u0000\u0000N\u0188\u0001\u0000\u0000\u0000P\u0193\u0001\u0000"+
		"\u0000\u0000R\u019e\u0001\u0000\u0000\u0000T\u01a9\u0001\u0000\u0000\u0000"+
		"V\u01b4\u0001\u0000\u0000\u0000X\u01c2\u0001\u0000\u0000\u0000Z\u01d4"+
		"\u0001\u0000\u0000\u0000\\\u01d9\u0001\u0000\u0000\u0000^\u01e8\u0001"+
		"\u0000\u0000\u0000`\u01ea\u0001\u0000\u0000\u0000bd\u0003\u0002\u0001"+
		"\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000"+
		"\u0000\u0000eg\u0003\b\u0004\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0003\u000e\u0007\u0000ij\u0005"+
		"\u001a\u0000\u0000jk\u0005$\u0000\u0000k\u0001\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0019\u0000\u0000mn\u0005%\u0000\u0000no\u0003\u0004\u0002\u0000"+
		"o\u0003\u0001\u0000\u0000\u0000pr\u0003\u0006\u0003\u0000qp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000t\u0005\u0001\u0000\u0000\u0000ux\u0003\u0012\t\u0000"+
		"vx\u0003>\u001f\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x\u0007\u0001\u0000\u0000\u0000yz\u0005\u001b\u0000\u0000z{\u0005%\u0000"+
		"\u0000{|\u0003\n\u0005\u0000|\t\u0001\u0000\u0000\u0000}\u007f\u0003\f"+
		"\u0006\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u000b\u0001\u0000\u0000\u0000\u0082\u0085\u0003.\u0017\u0000\u0083\u0085"+
		"\u00030\u0018\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001c"+
		"\u0000\u0000\u0087\u0088\u0005%\u0000\u0000\u0088\u0089\u0003\u0010\b"+
		"\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008c\u0003$\u0012\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u0090\u0005\r\u0000\u0000\u0090"+
		"\u0091\u0005=\u0000\u0000\u0091\u0092\u0005#\u0000\u0000\u0092\u0094\u0003"+
		"J%\u0000\u0093\u0095\u0003\"\u0011\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u00a1\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u000e\u0000\u0000\u0097\u0098\u0005=\u0000\u0000"+
		"\u0098\u0099\u0005!\u0000\u0000\u0099\u009a\u0003L&\u0000\u009a\u009b"+
		"\u0005\"\u0000\u0000\u009b\u009c\u0005#\u0000\u0000\u009c\u009d\u0003"+
		"J%\u0000\u009d\u009e\u0003F#\u0000\u009e\u009f\u0005$\u0000\u0000\u009f"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a0\u008f\u0001\u0000\u0000\u0000\u00a0"+
		"\u0096\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a4\u0005\u001d\u0000\u0000\u00a4"+
		"\u00a5\u0003L&\u0000\u00a5\u00a6\u0005\u001e\u0000\u0000\u00a6\u00a7\u0003"+
		"\u001c\u000e\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u0015\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005\u0012\u0000\u0000\u00aa\u00ab\u0005"+
		"\u001d\u0000\u0000\u00ab\u00ac\u0003L&\u0000\u00ac\u00ad\u0005\u001e\u0000"+
		"\u0000\u00ad\u00ae\u0003\u001c\u000e\u0000\u00ae\u00af\u0003\u0016\u000b"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u0018\f\u0000"+
		"\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u0017\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0012\u0000\u0000"+
		"\u00b4\u00b5\u0003\u001c\u000e\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000"+
		"\u00b6\u00b7\u0005$\u0000\u0000\u00b7\u00bb\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0014\u0000\u0000\u00b9\u00bb\u0005$\u0000\u0000\u00ba\u00b3"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u0019"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd\u00be"+
		"\u0005\u001d\u0000\u0000\u00be\u00bf\u0003L&\u0000\u00bf\u00c0\u0005\u001e"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1\u00c2\u0005\u0014"+
		"\u0000\u0000\u00c2\u00c3\u0005$\u0000\u0000\u00c3\u001b\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0005\u001f\u0000\u0000\u00c5\u00c7\u0003\u0010\b\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9"+
		"\u001d\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u000f\u0000\u0000\u00cb"+
		"\u00cc\u0003\u001c\u000e\u0000\u00cc\u00cd\u0005\u0010\u0000\u0000\u00cd"+
		"\u00ce\u0005\u001d\u0000\u0000\u00ce\u00cf\u0003L&\u0000\u00cf\u00d0\u0005"+
		"\u001e\u0000\u0000\u00d0\u00d1\u0005$\u0000\u0000\u00d1\u001f\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0011\u0000\u0000\u00d3\u00d4\u0005\u001d"+
		"\u0000\u0000\u00d4\u00d5\u0003\u0012\t\u0000\u00d5\u00d6\u0003L&\u0000"+
		"\u00d6\u00d7\u0005$\u0000\u0000\u00d7\u00d8\u0003,\u0016\u0000\u00d8\u00d9"+
		"\u0005\u001e\u0000\u0000\u00d9\u00da\u0003\u001c\u000e\u0000\u00da!\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003L&\u0000\u00dc\u00dd\u0005$\u0000"+
		"\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00e1\u0005$\u0000\u0000"+
		"\u00df\u00e1\u00038\u001c\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"#\u0001\u0000\u0000\u0000\u00e2\u00fa\u0003\u001a\r\u0000\u00e3\u00fa"+
		"\u0003 \u0010\u0000\u00e4\u00fa\u0003\u001e\u000f\u0000\u00e5\u00fa\u0003"+
		"\u0012\t\u0000\u00e6\u00fa\u0003\u0014\n\u0000\u00e7\u00e8\u0005\u0016"+
		"\u0000\u0000\u00e8\u00e9\u0003L&\u0000\u00e9\u00ea\u0005$\u0000\u0000"+
		"\u00ea\u00fa\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u000b\u0000\u0000"+
		"\u00ec\u00fa\u0005$\u0000\u0000\u00ed\u00ee\u0005\f\u0000\u0000\u00ee"+
		"\u00fa\u0005$\u0000\u0000\u00ef\u00f0\u0003,\u0016\u0000\u00f0\u00f1\u0005"+
		"$\u0000\u0000\u00f1\u00fa\u0001\u0000\u0000\u0000\u00f2\u00fa\u0003*\u0015"+
		"\u0000\u00f3\u00f4\u0003&\u0013\u0000\u00f4\u00f5\u0005$\u0000\u0000\u00f5"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003`0\u0000\u00f7\u00f8\u0005"+
		"$\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00e2\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e3\u0001\u0000\u0000\u0000\u00f9\u00e4\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e5\u0001\u0000\u0000\u0000\u00f9\u00e6\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e7\u0001\u0000\u0000\u0000\u00f9\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f2\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00fa%\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0003(\u0014\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\'\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u00057\u0000\u0000\u0101\u0102\u0003L&\u0000\u0102)\u0001\u0000"+
		"\u0000\u0000\u0103\u0108\u00056\u0000\u0000\u0104\u0105\u0003L&\u0000"+
		"\u0105\u0106\u00056\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0103\u0001\u0000\u0000\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0108"+
		"+\u0001\u0000\u0000\u0000\u0109\u010a\u0003\\.\u0000\u010a\u010b\u0007"+
		"\u0000\u0000\u0000\u010b\u0113\u0001\u0000\u0000\u0000\u010c\u010d\u0007"+
		"\u0000\u0000\u0000\u010d\u0113\u0003\\.\u0000\u010e\u010f\u0003\\.\u0000"+
		"\u010f\u0110\u00058\u0000\u0000\u0110\u0111\u00032\u0019\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u0109\u0001\u0000\u0000\u0000\u0112\u010c"+
		"\u0001\u0000\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0113-\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005\u0018\u0000\u0000\u0115\u0116\u0005"+
		"=\u0000\u0000\u0116\u0118\u0005\u001d\u0000\u0000\u0117\u0119\u0003@ "+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u001e\u0000"+
		"\u0000\u011b\u011c\u0005\u001f\u0000\u0000\u011c\u011d\u00034\u001a\u0000"+
		"\u011d\u011e\u0005 \u0000\u0000\u011e\u011f\u0005\u0014\u0000\u0000\u011f"+
		"\u0120\u0005$\u0000\u0000\u0120/\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"\u0015\u0000\u0000\u0122\u0123\u0003J%\u0000\u0123\u0124\u0005=\u0000"+
		"\u0000\u0124\u0126\u0005\u001d\u0000\u0000\u0125\u0127\u0003@ \u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u001e\u0000\u0000\u0129"+
		"\u012a\u0005\u001f\u0000\u0000\u012a\u012b\u00034\u001a\u0000\u012b\u012c"+
		"\u0005 \u0000\u0000\u012c\u012d\u0005\u0014\u0000\u0000\u012d\u012e\u0005"+
		"$\u0000\u0000\u012e1\u0001\u0000\u0000\u0000\u012f\u0132\u0003L&\u0000"+
		"\u0130\u0132\u00038\u001c\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u01323\u0001\u0000\u0000\u0000\u0133\u0135"+
		"\u00036\u001b\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0138\u0003"+
		"\u0010\b\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u01385\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u0019\u0000"+
		"\u0000\u013a\u013b\u0005!\u0000\u0000\u013b\u013c\u0003\u0004\u0002\u0000"+
		"\u013c\u013d\u0005\"\u0000\u0000\u013d7\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005\u001f\u0000\u0000\u013f\u0140\u0003:\u001d\u0000\u0140\u0141"+
		"\u0005 \u0000\u0000\u01419\u0001\u0000\u0000\u0000\u0142\u0147\u0003<"+
		"\u001e\u0000\u0143\u0144\u00054\u0000\u0000\u0144\u0146\u0003<\u001e\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148;\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005=\u0000\u0000\u014b\u014c\u0005#\u0000\u0000\u014c\u014d\u0003"+
		"2\u0019\u0000\u014d=\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0017\u0000"+
		"\u0000\u014f\u0150\u0005=\u0000\u0000\u0150\u0151\u0005\u001f\u0000\u0000"+
		"\u0151\u0152\u0003@ \u0000\u0152\u0153\u0005 \u0000\u0000\u0153\u0154"+
		"\u0005\u0014\u0000\u0000\u0154\u0155\u0005$\u0000\u0000\u0155?\u0001\u0000"+
		"\u0000\u0000\u0156\u015b\u0003D\"\u0000\u0157\u0158\u00054\u0000\u0000"+
		"\u0158\u015a\u0003D\"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a"+
		"\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u0164\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u0160\u0003B!\u0000\u015f\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001"+
		"\u0000\u0000\u0000\u0163\u0156\u0001\u0000\u0000\u0000\u0163\u015f\u0001"+
		"\u0000\u0000\u0000\u0164A\u0001\u0000\u0000\u0000\u0165\u0166\u0003D\""+
		"\u0000\u0166\u0167\u0005$\u0000\u0000\u0167C\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0007\u0001\u0000\u0000\u0169\u016a\u0005=\u0000\u0000\u016a\u016b"+
		"\u0005#\u0000\u0000\u016b\u016c\u0003J%\u0000\u016cE\u0001\u0000\u0000"+
		"\u0000\u016d\u016f\u0005\u001f\u0000\u0000\u016e\u0170\u0003H$\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005 \u0000\u0000\u0172G\u0001"+
		"\u0000\u0000\u0000\u0173\u0178\u0003L&\u0000\u0174\u0175\u00054\u0000"+
		"\u0000\u0175\u0177\u0003L&\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179I\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0007\u0002\u0000\u0000\u017cK\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0006&\uffff\uffff\u0000\u017e\u017f\u0003"+
		"N\'\u0000\u017f\u0185\u0001\u0000\u0000\u0000\u0180\u0181\n\u0002\u0000"+
		"\u0000\u0181\u0182\u00050\u0000\u0000\u0182\u0184\u0003N\'\u0000\u0183"+
		"\u0180\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"M\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0006\'\uffff\uffff\u0000\u0189\u018a\u0003P(\u0000\u018a\u0190\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\n\u0002\u0000\u0000\u018c\u018d\u0005/"+
		"\u0000\u0000\u018d\u018f\u0003P(\u0000\u018e\u018b\u0001\u0000\u0000\u0000"+
		"\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191O\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0193\u0194\u0006(\uffff\uffff\u0000\u0194"+
		"\u0195\u0003R)\u0000\u0195\u019b\u0001\u0000\u0000\u0000\u0196\u0197\n"+
		"\u0002\u0000\u0000\u0197\u0198\u0007\u0003\u0000\u0000\u0198\u019a\u0003"+
		"R)\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000"+
		"\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019cQ\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0006)\uffff\uffff\u0000\u019f\u01a0\u0003T*\u0000\u01a0"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a1\u01a2\n\u0002\u0000\u0000\u01a2\u01a3"+
		"\u0007\u0004\u0000\u0000\u01a3\u01a5\u0003T*\u0000\u01a4\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7S\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0006*\uffff\uffff"+
		"\u0000\u01aa\u01ab\u0003V+\u0000\u01ab\u01b1\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\n\u0002\u0000\u0000\u01ad\u01ae\u0007\u0005\u0000\u0000\u01ae\u01b0"+
		"\u0003V+\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2U\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0006+\uffff\uffff\u0000\u01b5\u01b6\u0003X,\u0000"+
		"\u01b6\u01bc\u0001\u0000\u0000\u0000\u01b7\u01b8\n\u0002\u0000\u0000\u01b8"+
		"\u01b9\u0007\u0006\u0000\u0000\u01b9\u01bb\u0003X,\u0000\u01ba\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bdW\u0001\u0000"+
		"\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c0\u0007\u0007"+
		"\u0000\u0000\u01c0\u01c3\u0003Z-\u0000\u01c1\u01c3\u0003Z-\u0000\u01c2"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"Y\u0001\u0000\u0000\u0000\u01c4\u01d5\u0005\u0004\u0000\u0000\u01c5\u01d5"+
		"\u0005\u0005\u0000\u0000\u01c6\u01d5\u0005\u0006\u0000\u0000\u01c7\u01d5"+
		"\u0005\u0007\u0000\u0000\u01c8\u01d5\u0005\t\u0000\u0000\u01c9\u01d5\u0005"+
		"\n\u0000\u0000\u01ca\u01cc\u0003\\.\u0000\u01cb\u01cd\u0007\u0000\u0000"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d5\u0001\u0000\u0000\u0000\u01ce\u01cf\u0007\u0000\u0000"+
		"\u0000\u01cf\u01d5\u0003\\.\u0000\u01d0\u01d1\u0005\u001d\u0000\u0000"+
		"\u01d1\u01d2\u0003L&\u0000\u01d2\u01d3\u0005\u001e\u0000\u0000\u01d3\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d4\u01c4\u0001\u0000\u0000\u0000\u01d4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01d4\u01c6\u0001\u0000\u0000\u0000\u01d4\u01c7"+
		"\u0001\u0000\u0000\u0000\u01d4\u01c8\u0001\u0000\u0000\u0000\u01d4\u01c9"+
		"\u0001\u0000\u0000\u0000\u01d4\u01ca\u0001\u0000\u0000\u0000\u01d4\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000\u01d5[\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0006.\uffff\uffff\u0000\u01d7\u01da\u0005"+
		"=\u0000\u0000\u01d8\u01da\u0003`0\u0000\u01d9\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01df\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\n\u0002\u0000\u0000\u01dc\u01de\u0003^/\u0000\u01dd"+
		"\u01db\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"]\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0005!\u0000\u0000\u01e3\u01e4\u0003L&\u0000\u01e4\u01e5\u0005\"\u0000"+
		"\u0000\u01e5\u01e9\u0001\u0000\u0000\u0000\u01e6\u01e7\u00055\u0000\u0000"+
		"\u01e7\u01e9\u0005=\u0000\u0000\u01e8\u01e2\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e9_\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0005=\u0000\u0000\u01eb\u01ed\u0005\u001d\u0000\u0000\u01ec\u01ee\u0003"+
		"H$\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u001e\u0000"+
		"\u0000\u01f0a\u0001\u0000\u0000\u0000)cfsw\u0080\u0084\u008d\u0094\u00a0"+
		"\u00b1\u00ba\u00c6\u00e0\u00f9\u00fe\u0107\u0112\u0118\u0126\u0131\u0134"+
		"\u0137\u0147\u015b\u0161\u0163\u016f\u0178\u0185\u0190\u019b\u01a6\u01b1"+
		"\u01bc\u01c2\u01cc\u01d4\u01d9\u01df\u01e8\u01ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}