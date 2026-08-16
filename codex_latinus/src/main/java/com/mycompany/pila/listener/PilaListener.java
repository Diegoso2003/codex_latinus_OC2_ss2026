/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pila.listener;

import java.util.ArrayDeque;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.mycompany.antlr4.CodexLatinusBaseListener;
import com.mycompany.antlr4.CodexLatinusParser.AndContext;
import com.mycompany.antlr4.CodexLatinusParser.ArregloContext;
import com.mycompany.antlr4.CodexLatinusParser.AsignContext;
import com.mycompany.antlr4.CodexLatinusParser.AtribContext;
import com.mycompany.antlr4.CodexLatinusParser.Atrib_pcomaContext;
import com.mycompany.antlr4.CodexLatinusParser.LAtribComaContext;
import com.mycompany.antlr4.CodexLatinusParser.LAtribPcomaContext;
import com.mycompany.antlr4.CodexLatinusParser.BloqueContext;
import com.mycompany.antlr4.CodexLatinusParser.C_identiContext;
import com.mycompany.antlr4.CodexLatinusParser.C_metContext;
import com.mycompany.antlr4.CodexLatinusParser.CicloDContext;
import com.mycompany.antlr4.CodexLatinusParser.CicloPContext;
import com.mycompany.antlr4.CodexLatinusParser.CicloSContext;
import com.mycompany.antlr4.CodexLatinusParser.CompleContext;
import com.mycompany.antlr4.CodexLatinusParser.CondiContext;
import com.mycompany.antlr4.CodexLatinusParser.DeclContext;
import com.mycompany.antlr4.CodexLatinusParser.DeclStruContext;
import com.mycompany.antlr4.CodexLatinusParser.DefaultContext;
import com.mycompany.antlr4.CodexLatinusParser.ExprContext;
import com.mycompany.antlr4.CodexLatinusParser.FuncionContext;
import com.mycompany.antlr4.CodexLatinusParser.FunctsContext;
import com.mycompany.antlr4.CodexLatinusParser.IdentiContext;
import com.mycompany.antlr4.CodexLatinusParser.IguDifContext;
import com.mycompany.antlr4.CodexLatinusParser.ImpriContext;
import com.mycompany.antlr4.CodexLatinusParser.InstContext;
import com.mycompany.antlr4.CodexLatinusParser.L_declContext;
import com.mycompany.antlr4.CodexLatinusParser.L_expContext;
import com.mycompany.antlr4.CodexLatinusParser.L_impriContext;
import com.mycompany.antlr4.CodexLatinusParser.L_instContext;
import com.mycompany.antlr4.CodexLatinusParser.L_metContext;
import com.mycompany.antlr4.CodexLatinusParser.L_valContext;
import com.mycompany.antlr4.CodexLatinusParser.LecturaContext;
import com.mycompany.antlr4.CodexLatinusParser.ListaContext;
import com.mycompany.antlr4.CodexLatinusParser.Ll_funcContext;
import com.mycompany.antlr4.CodexLatinusParser.MainContext;
import com.mycompany.antlr4.CodexLatinusParser.MenMayContext;
import com.mycompany.antlr4.CodexLatinusParser.MetContext;
import com.mycompany.antlr4.CodexLatinusParser.MetodoContext;
import com.mycompany.antlr4.CodexLatinusParser.MulDivContext;
import com.mycompany.antlr4.CodexLatinusParser.PrimitivoContext;
import com.mycompany.antlr4.CodexLatinusParser.ProgContext;
import com.mycompany.antlr4.CodexLatinusParser.SinoContext;
import com.mycompany.antlr4.CodexLatinusParser.StructContext;
import com.mycompany.antlr4.CodexLatinusParser.SumResContext;
import com.mycompany.antlr4.CodexLatinusParser.TermContext;
import com.mycompany.antlr4.CodexLatinusParser.TipoContext;
import com.mycompany.antlr4.CodexLatinusParser.UnarioContext;
import com.mycompany.antlr4.CodexLatinusParser.ValContext;
import com.mycompany.antlr4.CodexLatinusParser.ValorContext;
import com.mycompany.antlr4.CodexLatinusParser.Var_gloContext;
import com.mycompany.antlr4.CodexLatinusParser.VariablesContext;
import com.mycompany.constantes.NoTerminales;
import com.mycompany.pila.AcceptPila;
import com.mycompany.pila.AccionPila;
import com.mycompany.pila.Elemento;
import com.mycompany.pila.ReducePila;
import com.mycompany.pila.ShiftPila;

import lombok.Getter;

/**
 *
 * @author rafael-cayax
 */
public class PilaListener extends CodexLatinusBaseListener {
    @Getter
    private final ArrayDeque<AccionPila> pila = new ArrayDeque<>();
    private boolean primeraDecl = true;
    private boolean primerMet = true;
    private ArrayDeque<Boolean> primerInst = new ArrayDeque<>();
    private boolean enListaExp = false;
    private boolean primerExp = true;
    private boolean primerAtrib = true;
    private boolean lAtribPcoma = false;
    private boolean primerVal = true;
    private boolean primerImpri = true;

    @Override
    public void visitTerminal(TerminalNode node) {
        pila.add(new ShiftPila(
                new Elemento(node.getText(), true)));
    }

    @Override
    public void exitTerm(TermContext ctx) {
        agregarALaPila(NoTerminales.TERM, ctx.getChildCount());
    }

    @Override
    public void exitUnario(UnarioContext ctx) {
        agregarALaPila(NoTerminales.UNARIO, ctx.getChildCount());
    }

    @Override
    public void exitMulDiv(MulDivContext ctx) {
        agregarALaPila(NoTerminales.FACTOR, ctx.getChildCount());
    }

    @Override
    public void exitSumRes(SumResContext ctx) {
        agregarALaPila(NoTerminales.ARITME, ctx.getChildCount());
    }

    @Override
    public void exitMenMay(MenMayContext ctx) {
        agregarALaPila(NoTerminales.RELACION, ctx.getChildCount());
    }

    @Override
    public void exitIguDif(IguDifContext ctx) {
        agregarALaPila(NoTerminales.IGUDIF, ctx.getChildCount());
    }

    @Override
    public void exitAnd(AndContext ctx) {
        agregarALaPila(NoTerminales.AND, ctx.getChildCount());
    }

    @Override
    public void exitExpr(ExprContext ctx) {
        agregarALaPila(NoTerminales.EXPR, ctx.getChildCount());
        if (enListaExp) {
            int hijos = primerExp ? 1 : 3;
            primerExp = false;
            agregarALaPila(NoTerminales.L_EXPR, hijos);
        }
    }

    @Override
    public void exitTipo(TipoContext ctx) {
        agregarALaPila(NoTerminales.TIPO, ctx.getChildCount());
    }

    @Override
    public void exitIdenti(IdentiContext ctx) {
        agregarALaPila(NoTerminales.IDENTI, ctx.getChildCount());
    }

    @Override
    public void exitProg(ProgContext ctx) {
        agregarALaPila(NoTerminales.PROG, ctx.getChildCount());
        pila.add(new ShiftPila(new Elemento("EOF", true)));
        pila.add(new AcceptPila());
    }

    @Override
    public void exitVar_glo(Var_gloContext ctx) {
        agregarALaPila(NoTerminales.V_GLOBAL, ctx.getChildCount());
    }

    @Override
    public void exitFuncts(FunctsContext ctx) {
        agregarALaPila(NoTerminales.FUNCTS, ctx.getChildCount());
    }

    @Override
    public void exitMain(MainContext ctx) {
        agregarALaPila(NoTerminales.MAIN, ctx.getChildCount());
    }

    @Override
    public void exitCondi(CondiContext ctx) {
        agregarALaPila(NoTerminales.CONDI, ctx.getChildCount());
    }

    @Override
    public void exitDefault(DefaultContext ctx) {
        agregarALaPila(NoTerminales.DEFAULT, ctx.getChildCount());
    }

    @Override
    public void exitSino(SinoContext ctx) {
        agregarALaPila(NoTerminales.SINO, ctx.getChildCount());
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        agregarALaPila(NoTerminales.BLOQUE, ctx.getChildCount());
    }

    @Override
    public void exitCicloD(CicloDContext ctx) {
        agregarALaPila(NoTerminales.CICLO_D, ctx.getChildCount());
    }

    @Override
    public void exitCicloP(CicloPContext ctx) {
        agregarALaPila(NoTerminales.CICLO_P, ctx.getChildCount());
    }

    @Override
    public void exitCicloS(CicloSContext ctx) {
        agregarALaPila(NoTerminales.CICLO_S, ctx.getChildCount());
    }

    @Override
    public void enterL_inst(L_instContext ctx) {
        primerInst.add(Boolean.TRUE);
    }

    @Override
    public void exitL_inst(L_instContext ctx) {
        primerInst.removeLast();
    }

    @Override
    public void exitInst(InstContext ctx) {
        agregarALaPila(NoTerminales.INST, ctx.getChildCount());
        int hijos = 2;
        if (primerInst.getLast()) {
            hijos = 1;
            primerInst.removeLast();
            primerInst.add(Boolean.FALSE);
        }
        agregarALaPila(NoTerminales.L_INST, hijos);
    }

    @Override
    public void exitAsign(AsignContext ctx) {
        agregarALaPila(NoTerminales.ASIGN, ctx.getChildCount());
    }

    @Override
    public void exitLectura(LecturaContext ctx) {
        agregarALaPila(NoTerminales.LECT, ctx.getChildCount());
    }

    @Override
    public void exitFuncion(FuncionContext ctx) {
        agregarALaPila(NoTerminales.FUNC, ctx.getChildCount());
    }

    @Override
    public void exitMetodo(MetodoContext ctx) {
        agregarALaPila(NoTerminales.METODO, ctx.getChildCount());
    }

    @Override
    public void exitPrimitivo(PrimitivoContext ctx) {
        agregarALaPila(NoTerminales.DECLA_S, ctx.getChildCount());
    }

    @Override
    public void exitAtrib(AtribContext ctx) {
        agregarALaPila(NoTerminales.ATRIB, ctx.getChildCount());
        if (!lAtribPcoma) {
            int hijos = primerAtrib ? 1 : 3;
            primerAtrib = false;
            agregarALaPila(NoTerminales.L_ATRIB, hijos);
        }
    }

    @Override
    public void exitAtrib_pcoma(Atrib_pcomaContext ctx) {
        int hijos = primerAtrib ? 2 : 3;
        primerAtrib = false;
        agregarALaPila(NoTerminales.L_ATRIB, hijos);
    }

    @Override
    public void exitArreglo(ArregloContext ctx) {
        agregarALaPila(NoTerminales.DECLA_A, ctx.getChildCount());
    }

    @Override
    public void enterLAtribComa(LAtribComaContext ctx) {
        lAtribPcoma = false;
        primerAtrib = true;
    }

    @Override
    public void enterLAtribPcoma(LAtribPcomaContext ctx) {
        lAtribPcoma = true;
        primerAtrib = true;
    }

    @Override
    public void exitC_identi(C_identiContext ctx) {
        agregarALaPila(NoTerminales.C_IDENTI, ctx.getChildCount());
    }

    @Override
    public void exitC_met(C_metContext ctx) {
        agregarALaPila(NoTerminales.C_METOD, ctx.getChildCount());
    }

    @Override
    public void exitComple(CompleContext ctx) {
        agregarALaPila(NoTerminales.COM_VALOR, ctx.getChildCount());
    }

    @Override
    public void exitDeclStru(DeclStruContext ctx) {
        agregarALaPila(NoTerminales.STRUCT_V, ctx.getChildCount());
    }

    @Override
    public void exitImpri(ImpriContext ctx) {
        agregarALaPila(NoTerminales.IMPRI, ctx.getChildCount());
        int hijos = primerImpri ? 1 : 2;
        primerImpri = false;
        agregarALaPila(NoTerminales.L_IMPRI, hijos);
    }

    @Override
    public void exitL_exp(L_expContext ctx) {
        enListaExp = false;
    }

    @Override
    public void enterL_exp(L_expContext ctx) {
        enListaExp = true;
        primerExp = true;
    }

    @Override
    public void enterL_impri(L_impriContext ctx) {
        primerImpri = true;
    }

    @Override
    public void enterL_val(L_valContext ctx) {
        primerVal = true;
    }

    @Override
    public void exitLista(ListaContext ctx) {
        agregarALaPila(NoTerminales.ARREGLO, ctx.getChildCount());
    }

    @Override
    public void enterL_decl(L_declContext ctx) {
        this.primeraDecl = true;
    }

    @Override
    public void exitDecl(DeclContext ctx) {
        agregarALaPila(NoTerminales.DECLA, ctx.getChildCount());
        int hijos = primeraDecl ? 1 : 2;
        primeraDecl = false;
        agregarALaPila(NoTerminales.L_DECLA, hijos);
    }

    @Override
    public void enterL_met(L_metContext ctx) {
        primerMet = true;
    }

    @Override
    public void exitMet(MetContext ctx) {
        agregarALaPila(NoTerminales.SUB_RUTINA, ctx.getChildCount());
        int hijos = primerMet ? 1 : 2;
        primerMet = false;
        agregarALaPila(NoTerminales.L_METODOS, hijos);
    }

    @Override
    public void exitLl_func(Ll_funcContext ctx) {
        agregarALaPila(NoTerminales.LLAMETOD, ctx.getChildCount());
    }

    @Override
    public void exitStruct(StructContext ctx) {
        agregarALaPila(NoTerminales.STRUCT, ctx.getChildCount());
    }

    @Override
    public void exitValor(ValorContext ctx) {
        agregarALaPila(NoTerminales.VALOR, ctx.getChildCount());
    }

    @Override
    public void exitVariables(VariablesContext ctx) {
        agregarALaPila(NoTerminales.VARIABLES, ctx.getChildCount());
    }

    @Override
    public void exitVal(ValContext ctx) {
        agregarALaPila(NoTerminales.VALOR_S, ctx.getChildCount());
        int hijos = primerVal ? 1 : 3;
        primerVal = false;
        agregarALaPila(NoTerminales.L_VAL, hijos);
    }

    private void agregarALaPila(String simbolo, int hijos) {
        pila.add(new ReducePila(new Elemento(simbolo, false), hijos));
    }

}
