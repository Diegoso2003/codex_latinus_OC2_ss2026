// Generated from com/mycompany/antlr4/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexLatinusParser}.
 */
public interface CodexLatinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CodexLatinusParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CodexLatinusParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#var_glo}.
	 * @param ctx the parse tree
	 */
	void enterVar_glo(CodexLatinusParser.Var_gloContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#var_glo}.
	 * @param ctx the parse tree
	 */
	void exitVar_glo(CodexLatinusParser.Var_gloContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#l_decl}.
	 * @param ctx the parse tree
	 */
	void enterL_decl(CodexLatinusParser.L_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#l_decl}.
	 * @param ctx the parse tree
	 */
	void exitL_decl(CodexLatinusParser.L_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CodexLatinusParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CodexLatinusParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#functs}.
	 * @param ctx the parse tree
	 */
	void enterFuncts(CodexLatinusParser.FunctsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#functs}.
	 * @param ctx the parse tree
	 */
	void exitFuncts(CodexLatinusParser.FunctsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#l_met}.
	 * @param ctx the parse tree
	 */
	void enterL_met(CodexLatinusParser.L_metContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#l_met}.
	 * @param ctx the parse tree
	 */
	void exitL_met(CodexLatinusParser.L_metContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#met}.
	 * @param ctx the parse tree
	 */
	void enterMet(CodexLatinusParser.MetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#met}.
	 * @param ctx the parse tree
	 */
	void exitMet(CodexLatinusParser.MetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CodexLatinusParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CodexLatinusParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#l_inst}.
	 * @param ctx the parse tree
	 */
	void enterL_inst(CodexLatinusParser.L_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#l_inst}.
	 * @param ctx the parse tree
	 */
	void exitL_inst(CodexLatinusParser.L_instContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitivo}
	 * labeled alternative in {@link CodexLatinusParser#declS}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivo(CodexLatinusParser.PrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitivo}
	 * labeled alternative in {@link CodexLatinusParser#declS}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivo(CodexLatinusParser.PrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arreglo}
	 * labeled alternative in {@link CodexLatinusParser#declS}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(CodexLatinusParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arreglo}
	 * labeled alternative in {@link CodexLatinusParser#declS}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(CodexLatinusParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#valor_d}.
	 * @param ctx the parse tree
	 */
	void enterValor_d(CodexLatinusParser.Valor_dContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#valor_d}.
	 * @param ctx the parse tree
	 */
	void exitValor_d(CodexLatinusParser.Valor_dContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#comple}.
	 * @param ctx the parse tree
	 */
	void enterComple(CodexLatinusParser.CompleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#comple}.
	 * @param ctx the parse tree
	 */
	void exitComple(CodexLatinusParser.CompleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#condi}.
	 * @param ctx the parse tree
	 */
	void enterCondi(CodexLatinusParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#condi}.
	 * @param ctx the parse tree
	 */
	void exitCondi(CodexLatinusParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(CodexLatinusParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(CodexLatinusParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(CodexLatinusParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(CodexLatinusParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#cicloS}.
	 * @param ctx the parse tree
	 */
	void enterCicloS(CodexLatinusParser.CicloSContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#cicloS}.
	 * @param ctx the parse tree
	 */
	void exitCicloS(CodexLatinusParser.CicloSContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(CodexLatinusParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(CodexLatinusParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(CodexLatinusParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(CodexLatinusParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#cicloD}.
	 * @param ctx the parse tree
	 */
	void enterCicloD(CodexLatinusParser.CicloDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#cicloD}.
	 * @param ctx the parse tree
	 */
	void exitCicloD(CodexLatinusParser.CicloDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#cicloP}.
	 * @param ctx the parse tree
	 */
	void enterCicloP(CodexLatinusParser.CicloPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#cicloP}.
	 * @param ctx the parse tree
	 */
	void exitCicloP(CodexLatinusParser.CicloPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(CodexLatinusParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(CodexLatinusParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#l_impri}.
	 * @param ctx the parse tree
	 */
	void enterL_impri(CodexLatinusParser.L_impriContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#l_impri}.
	 * @param ctx the parse tree
	 */
	void exitL_impri(CodexLatinusParser.L_impriContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#impri}.
	 * @param ctx the parse tree
	 */
	void enterImpri(CodexLatinusParser.ImpriContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#impri}.
	 * @param ctx the parse tree
	 */
	void exitImpri(CodexLatinusParser.ImpriContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(CodexLatinusParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(CodexLatinusParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(CodexLatinusParser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(CodexLatinusParser.AsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(CodexLatinusParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(CodexLatinusParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(CodexLatinusParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(CodexLatinusParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(CodexLatinusParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(CodexLatinusParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#c_met}.
	 * @param ctx the parse tree
	 */
	void enterC_met(CodexLatinusParser.C_metContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#c_met}.
	 * @param ctx the parse tree
	 */
	void exitC_met(CodexLatinusParser.C_metContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(CodexLatinusParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(CodexLatinusParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declStru}.
	 * @param ctx the parse tree
	 */
	void enterDeclStru(CodexLatinusParser.DeclStruContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declStru}.
	 * @param ctx the parse tree
	 */
	void exitDeclStru(CodexLatinusParser.DeclStruContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#l_val}.
	 * @param ctx the parse tree
	 */
	void enterL_val(CodexLatinusParser.L_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#l_val}.
	 * @param ctx the parse tree
	 */
	void exitL_val(CodexLatinusParser.L_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(CodexLatinusParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(CodexLatinusParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CodexLatinusParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CodexLatinusParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LAtribComa}
	 * labeled alternative in {@link CodexLatinusParser#l_atrib}.
	 * @param ctx the parse tree
	 */
	void enterLAtribComa(CodexLatinusParser.LAtribComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LAtribComa}
	 * labeled alternative in {@link CodexLatinusParser#l_atrib}.
	 * @param ctx the parse tree
	 */
	void exitLAtribComa(CodexLatinusParser.LAtribComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LAtribPcoma}
	 * labeled alternative in {@link CodexLatinusParser#l_atrib}.
	 * @param ctx the parse tree
	 */
	void enterLAtribPcoma(CodexLatinusParser.LAtribPcomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LAtribPcoma}
	 * labeled alternative in {@link CodexLatinusParser#l_atrib}.
	 * @param ctx the parse tree
	 */
	void exitLAtribPcoma(CodexLatinusParser.LAtribPcomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#atrib_pcoma}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_pcoma(CodexLatinusParser.Atrib_pcomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#atrib_pcoma}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_pcoma(CodexLatinusParser.Atrib_pcomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(CodexLatinusParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(CodexLatinusParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(CodexLatinusParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(CodexLatinusParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#l_exp}.
	 * @param ctx the parse tree
	 */
	void enterL_exp(CodexLatinusParser.L_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#l_exp}.
	 * @param ctx the parse tree
	 */
	void exitL_exp(CodexLatinusParser.L_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(CodexLatinusParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(CodexLatinusParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CodexLatinusParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CodexLatinusParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(CodexLatinusParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(CodexLatinusParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#iguDif}.
	 * @param ctx the parse tree
	 */
	void enterIguDif(CodexLatinusParser.IguDifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#iguDif}.
	 * @param ctx the parse tree
	 */
	void exitIguDif(CodexLatinusParser.IguDifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#menMay}.
	 * @param ctx the parse tree
	 */
	void enterMenMay(CodexLatinusParser.MenMayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#menMay}.
	 * @param ctx the parse tree
	 */
	void exitMenMay(CodexLatinusParser.MenMayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#sumRes}.
	 * @param ctx the parse tree
	 */
	void enterSumRes(CodexLatinusParser.SumResContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#sumRes}.
	 * @param ctx the parse tree
	 */
	void exitSumRes(CodexLatinusParser.SumResContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CodexLatinusParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CodexLatinusParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#unario}.
	 * @param ctx the parse tree
	 */
	void enterUnario(CodexLatinusParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#unario}.
	 * @param ctx the parse tree
	 */
	void exitUnario(CodexLatinusParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CodexLatinusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CodexLatinusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#identi}.
	 * @param ctx the parse tree
	 */
	void enterIdenti(CodexLatinusParser.IdentiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#identi}.
	 * @param ctx the parse tree
	 */
	void exitIdenti(CodexLatinusParser.IdentiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#c_identi}.
	 * @param ctx the parse tree
	 */
	void enterC_identi(CodexLatinusParser.C_identiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#c_identi}.
	 * @param ctx the parse tree
	 */
	void exitC_identi(CodexLatinusParser.C_identiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#ll_func}.
	 * @param ctx the parse tree
	 */
	void enterLl_func(CodexLatinusParser.Ll_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#ll_func}.
	 * @param ctx the parse tree
	 */
	void exitLl_func(CodexLatinusParser.Ll_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#access_a}.
	 * @param ctx the parse tree
	 */
	void enterAccess_a(CodexLatinusParser.Access_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#access_a}.
	 * @param ctx the parse tree
	 */
	void exitAccess_a(CodexLatinusParser.Access_aContext ctx);
}