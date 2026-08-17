package com.mycompany.arbol_ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.mycompany.antlr4.CodexLatinusBaseVisitor;
import com.mycompany.antlr4.CodexLatinusParser.ArregloContext;
import com.mycompany.antlr4.CodexLatinusParser.DeclContext;
import com.mycompany.antlr4.CodexLatinusParser.FunctsContext;
import com.mycompany.antlr4.CodexLatinusParser.L_declContext;
import com.mycompany.antlr4.CodexLatinusParser.L_instContext;
import com.mycompany.antlr4.CodexLatinusParser.L_metContext;
import com.mycompany.antlr4.CodexLatinusParser.MainContext;
import com.mycompany.antlr4.CodexLatinusParser.MetContext;
import com.mycompany.antlr4.CodexLatinusParser.PrimitivoContext;
import com.mycompany.antlr4.CodexLatinusParser.ProgContext;
import com.mycompany.antlr4.CodexLatinusParser.Var_gloContext;
import com.mycompany.constantes.NoTerminales;

public class ArbolAstGrVisitor extends CodexLatinusBaseVisitor<Integer> {
    private final Graphviz g;

    public ArbolAstGrVisitor(Graphviz g) {
        this.g = g;
    }

    @Override
    public Integer visitProg(ProgContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.PROG);
        if (ctx.var_glo() != null) {
            g.agregarRelacion(nodo, visitVar_glo(ctx.var_glo()));
        }
        if (ctx.functs() != null) {
            g.agregarRelacion(nodo, visitFuncts(ctx.functs()));
        }
        g.agregarRelacion(nodo, visitMain(ctx.main()));
        g.agregarRelacion(nodo, visitTerminal(ctx.FNS()));
        g.agregarRelacion(nodo, visitTerminal(ctx.PCO()));
        return nodo;
    }

    @Override
    public Integer visitVar_glo(Var_gloContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.V_GLOBAL);
        g.agregarRelacion(nodo, visitTerminal(ctx.VAR()));
        g.agregarRelacion(nodo, visitTerminal(ctx.MAY()));
        g.agregarRelacion(nodo, visitL_decl(ctx.l_decl()));
        return nodo;
    }

    @Override
    public Integer visitL_decl(L_declContext ctx) {
        int nodo = 0;
        for (var decla : ctx.decl()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_DECLA);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
            } else
                nodo = g.agregarNodo(NoTerminales.L_DECLA);
            g.agregarRelacion(nodo, visitDecl(decla));
        }
        return nodo;
    }

    @Override
    public Integer visitDecl(DeclContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.DECLA);
        if (ctx.declS() != null) {
            g.agregarRelacion(nodo, ctx.declS().accept(this));
        } else {
            g.agregarRelacion(nodo, visitStruct(ctx.struct()));
        }
        return nodo;
    }

    @Override
    public Integer visitFuncts(FunctsContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.FUNCTS);
        g.agregarRelacion(nodo, visitTerminal(ctx.MUN()));
        g.agregarRelacion(nodo, visitTerminal(ctx.MAY()));
        g.agregarRelacion(nodo, visitL_met(ctx.l_met()));
        return nodo;
    }

    @Override
    public Integer visitL_met(L_metContext ctx) {
        int nodo = 0;
        for (var metodos : ctx.met()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_METODOS);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
            } else
                nodo = g.agregarNodo(NoTerminales.L_METODOS);
            g.agregarRelacion(nodo, visitMet(metodos));
        }
        return nodo;
    }

    @Override
    public Integer visitMet(MetContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.SUB_RUTINA);
        if (ctx.metodo() != null)
            g.agregarRelacion(nodo, visitMetodo(ctx.metodo()));
        else
            g.agregarRelacion(nodo, visitFuncion(ctx.funcion()));
        return nodo;
    }

    @Override
    public Integer visitMain(MainContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.MAIN);
        g.agregarRelacion(nodo, visitTerminal(ctx.MAI()));
        g.agregarRelacion(nodo, visitTerminal(ctx.MAY()));
        g.agregarRelacion(nodo, visitL_inst(ctx.l_inst()));
        return nodo;
    }

    @Override
    public Integer visitL_inst(L_instContext ctx) {
        int nodo = 0;
        for (var inst : ctx.inst()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_INST);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
            } else
                nodo = g.agregarNodo(NoTerminales.L_INST);
            g.agregarRelacion(nodo, visitInst(inst));
        }
        return nodo;
    }

    @Override
    public Integer visitPrimitivo(PrimitivoContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.DECLA);
        g.agregarRelacion(nodo, visitTerminal(ctx.ES()));
        g.agregarRelacion(nodo, visitTerminal(ctx.ID()));
        g.agregarRelacion(nodo, visitTerminal(ctx.DPUN()));
        g.agregarRelacion(nodo, visitTipo(ctx.tipo()));
        if (ctx.comple() != null)
            g.agregarRelacion(nodo, visitComple(ctx.comple()));
        return nodo;
    }

    @Override
    public Integer visitArreglo(ArregloContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.DECLA);
        g.agregarRelacion(nodo, visitTerminal(ctx.SR()));
        g.agregarRelacion(nodo, visitTerminal(ctx.ID()));
        g.agregarRelacion(nodo, visitAccess_a(ctx.access_a()));
        g.agregarRelacion(nodo, visitTerminal(ctx.DPUN()));
        g.agregarRelacion(nodo, visitTipo(ctx.tipo()));
        g.agregarRelacion(nodo, visitLista(ctx.lista()));
        g.agregarRelacion(nodo, visitTerminal(ctx.PCO()));
        return nodo;
    }

    @Override
    public Integer visitTerminal(TerminalNode node) {
        return g.agregarNodo(node.getText());
    }
}
