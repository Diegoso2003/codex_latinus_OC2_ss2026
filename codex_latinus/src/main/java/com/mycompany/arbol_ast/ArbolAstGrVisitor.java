package com.mycompany.arbol_ast;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.mycompany.antlr4.CodexLatinusBaseVisitor;
import com.mycompany.antlr4.CodexLatinusLexer;
import com.mycompany.antlr4.CodexLatinusParser.Access_aContext;
import com.mycompany.antlr4.CodexLatinusParser.AndContext;
import com.mycompany.antlr4.CodexLatinusParser.ArregloContext;
import com.mycompany.antlr4.CodexLatinusParser.AsignContext;
import com.mycompany.antlr4.CodexLatinusParser.AtribContext;
import com.mycompany.antlr4.CodexLatinusParser.Atrib_pcomaContext;
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
import com.mycompany.antlr4.CodexLatinusParser.LAtribComaContext;
import com.mycompany.antlr4.CodexLatinusParser.LAtribPcomaContext;
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
import com.mycompany.antlr4.CodexLatinusParser.Paren_exprContext;
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

public class ArbolAstGrVisitor extends CodexLatinusBaseVisitor<Integer> {
    private final Graphviz g;

    public ArbolAstGrVisitor(Graphviz g) {
        this.g = g;
    }

    @Override
    public Integer visitProg(ProgContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.PROG);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitVar_glo(Var_gloContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.V_GLOBAL);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
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
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitFuncts(FunctsContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.FUNCTS);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
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
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitMain(MainContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.MAIN);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
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
        int nodo = g.agregarNodo(NoTerminales.DECLA_S);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitArreglo(ArregloContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.DECLA_A);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitCondi(CondiContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.CONDI);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitSino(SinoContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.SINO);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitDefault(DefaultContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.DEFAULT);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitCicloS(CicloSContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.CICLO_S);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitParen_expr(Paren_exprContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.PAREN_EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitBloque(BloqueContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.BLOQUE);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitCicloD(CicloDContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.CICLO_D);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitCicloP(CicloPContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.CICLO_P);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitComple(CompleContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.COM_VALOR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitInst(InstContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.INST);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitImpri(ImpriContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.IMPRI);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitL_impri(L_impriContext ctx) {
        int nodo = 0;
        for (var impri : ctx.impri()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_IMPRI);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
            } else
                nodo = g.agregarNodo(NoTerminales.L_IMPRI);
            g.agregarRelacion(nodo, visitImpri(impri));
        }
        return nodo;
    }

    @Override
    public Integer visitLectura(LecturaContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.LECT);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitAsign(AsignContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.ASIGN);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitMetodo(MetodoContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.METODO);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitFuncion(FuncionContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.FUNC);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitValor(ValorContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.VALOR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitC_met(C_metContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.C_METOD);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitVariables(VariablesContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.VARIABLES);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitDeclStru(DeclStruContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.STRUCT_V);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitL_val(L_valContext ctx) {
        int nodo = 0;
        var iterador = ctx.COM().iterator();
        for (var val : ctx.val()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_VAL);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
                if (iterador.hasNext())
                    g.agregarRelacion(nodo, visitTerminal(iterador.next()));
            } else
                nodo = g.agregarNodo(NoTerminales.L_VAL);
            g.agregarRelacion(nodo, visitVal(val));
        }
        return nodo;
    }

    @Override
    public Integer visitVal(ValContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.VALOR_S);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitStruct(StructContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.STRUCT);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitAtrib(AtribContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.ATRIB);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitAtrib_pcoma(Atrib_pcomaContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.ATRIB);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitLAtribComa(LAtribComaContext ctx) {
        int nodo = 0;
        var iterador = ctx.COM().iterator();
        for (var atrib : ctx.atrib()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_ATRIB);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
                if (iterador.hasNext())
                    g.agregarRelacion(nodo, visitTerminal(iterador.next()));
            } else
                nodo = g.agregarNodo(NoTerminales.L_ATRIB);
            g.agregarRelacion(nodo, visitAtrib(atrib));
        }
        return nodo;
    }

    @Override
    public Integer visitLAtribPcoma(LAtribPcomaContext ctx) {
        int nodo = 0;
        for (var atribPC : ctx.atrib_pcoma()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_VAL);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
            } else
                nodo = g.agregarNodo(NoTerminales.L_VAL);
            g.agregarRelacion(nodo, visitAtrib_pcoma(atribPC));
        }
        return nodo;
    }

    @Override
    public Integer visitL_exp(L_expContext ctx) {
        int nodo = 0;
        var iterador = ctx.COM().iterator();
        for (var expr : ctx.expr()) {
            if (nodo != 0) {
                int alto = g.agregarNodo(NoTerminales.L_EXPR);
                g.agregarRelacion(alto, nodo);
                nodo = alto;
                if (iterador.hasNext())
                    g.agregarRelacion(nodo, visitTerminal(iterador.next()));
            } else
                nodo = g.agregarNodo(NoTerminales.L_EXPR);
            g.agregarRelacion(nodo, visitExpr(expr));
        }
        return nodo;
    }

    @Override
    public Integer visitLista(ListaContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.ARREGLO);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitExpr(ExprContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitTipo(TipoContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.TIPO);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitAnd(AndContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitIguDif(IguDifContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitMenMay(MenMayContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitSumRes(SumResContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitMulDiv(MulDivContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitTerm(TermContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitUnario(UnarioContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        int nodo = g.agregarNodo(NoTerminales.EXPR);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitAccess_a(Access_aContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.ACCESS_A);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitC_identi(C_identiContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.C_IDENTI);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitIdenti(IdentiContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.IDENTI);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitLl_func(Ll_funcContext ctx) {
        int nodo = g.agregarNodo(NoTerminales.LLAMETOD);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            g.agregarRelacion(nodo, ctx.getChild(i).accept(this));
        }
        return nodo;
    }

    @Override
    public Integer visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == CodexLatinusLexer.TEXT) {
            String texto = node.getText();
            return g.agregarNodo("\\\"" +
                    texto.substring(1, texto.length() - 1) + "\\\"");
        }
        return g.agregarNodo(node.getText());
    }
}
