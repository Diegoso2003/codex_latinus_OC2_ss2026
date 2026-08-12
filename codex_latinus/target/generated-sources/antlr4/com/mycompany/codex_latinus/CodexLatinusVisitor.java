// Generated from com/mycompany/codex_latinus/CodexLatinus.g4 by ANTLR 4.13.2
package com.mycompany.codex_latinus;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodexLatinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodexLatinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CodexLatinusParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#var_glo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_glo(CodexLatinusParser.Var_gloContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_decl(CodexLatinusParser.L_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#functs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncts(CodexLatinusParser.FunctsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_met}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_met(CodexLatinusParser.L_metContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CodexLatinusParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CodexLatinusParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(CodexLatinusParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#condi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(CodexLatinusParser.CondiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(CodexLatinusParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(CodexLatinusParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cicloS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloS(CodexLatinusParser.CicloSContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cicloD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloD(CodexLatinusParser.CicloDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cicloP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloP(CodexLatinusParser.CicloPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#comple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComple(CodexLatinusParser.CompleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(CodexLatinusParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_impri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_impri(CodexLatinusParser.L_impriContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#impri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpri(CodexLatinusParser.ImpriContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(CodexLatinusParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(CodexLatinusParser.AsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_inst(CodexLatinusParser.L_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(CodexLatinusParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(CodexLatinusParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(CodexLatinusParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#c_met}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_met(CodexLatinusParser.C_metContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(CodexLatinusParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_var(CodexLatinusParser.L_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declStru}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStru(CodexLatinusParser.DeclStruContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_val(CodexLatinusParser.L_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(CodexLatinusParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib_coma}
	 * labeled alternative in {@link CodexLatinusParser#l_atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_coma(CodexLatinusParser.Atrib_comaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib_pcoma}
	 * labeled alternative in {@link CodexLatinusParser#l_atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib_pcoma(CodexLatinusParser.Atrib_pcomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(CodexLatinusParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(CodexLatinusParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(CodexLatinusParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#l_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_exp(CodexLatinusParser.L_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#arreg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreg(CodexLatinusParser.ArregContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(CodexLatinusParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CodexLatinusParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CodexLatinusParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#iguDif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIguDif(CodexLatinusParser.IguDifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#menMay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenMay(CodexLatinusParser.MenMayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#sumRes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(CodexLatinusParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CodexLatinusParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnario(CodexLatinusParser.UnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CodexLatinusParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#identi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenti(CodexLatinusParser.IdentiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#c_identi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_identi(CodexLatinusParser.C_identiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#ll_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLl_func(CodexLatinusParser.Ll_funcContext ctx);
}