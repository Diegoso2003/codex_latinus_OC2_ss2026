package com.mycompany.arbol_ast;

import org.antlr.v4.runtime.ParserRuleContext;
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
import com.mycompany.antlr4.CodexLatinusParser.Valor_dContext;
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
        return agregarNodo(ctx, NoTerminales.PROG);
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
        return agregarNodo(ctx, NoTerminales.DECLA);
    }

    @Override
    public Integer visitFuncts(FunctsContext ctx) {
        return agregarNodo(ctx, NoTerminales.FUNCTS);
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
        return agregarNodo(ctx, NoTerminales.SUB_RUTINA);
    }

    @Override
    public Integer visitMain(MainContext ctx) {
        return agregarNodo(ctx, NoTerminales.MAIN);
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
        return agregarNodo(ctx, NoTerminales.DECLA_S);
    }

    @Override
    public Integer visitArreglo(ArregloContext ctx) {
        return agregarNodo(ctx, NoTerminales.DECLA_A);
    }

    @Override
    public Integer visitCondi(CondiContext ctx) {
        return agregarNodo(ctx, NoTerminales.CONDI);
    }

    @Override
    public Integer visitSino(SinoContext ctx) {
        return agregarNodo(ctx, NoTerminales.SINO);
    }

    @Override
    public Integer visitDefault(DefaultContext ctx) {
        return agregarNodo(ctx, NoTerminales.DEFAULT);
    }

    @Override
    public Integer visitCicloS(CicloSContext ctx) {
        return agregarNodo(ctx, NoTerminales.CICLO_S);
    }

    @Override
    public Integer visitParen_expr(Paren_exprContext ctx) {
        return agregarNodo(ctx, NoTerminales.PAREN_EXPR);
    }

    @Override
    public Integer visitBloque(BloqueContext ctx) {
        return agregarNodo(ctx, NoTerminales.BLOQUE);
    }

    @Override
    public Integer visitCicloD(CicloDContext ctx) {
        return agregarNodo(ctx, NoTerminales.CICLO_D);
    }

    @Override
    public Integer visitCicloP(CicloPContext ctx) {
        return agregarNodo(ctx, NoTerminales.CICLO_P);
    }

    @Override
    public Integer visitComple(CompleContext ctx) {
        return agregarNodo(ctx, NoTerminales.COM_VALOR);
    }

    @Override
    public Integer visitInst(InstContext ctx) {
        return agregarNodo(ctx, NoTerminales.INST);
    }

    @Override
    public Integer visitImpri(ImpriContext ctx) {
        return agregarNodo(ctx, NoTerminales.IMPRI);
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
        return agregarNodo(ctx, NoTerminales.LECT);
    }

    @Override
    public Integer visitAsign(AsignContext ctx) {
        return agregarNodo(ctx, NoTerminales.ASIGN);
    }

    @Override
    public Integer visitMetodo(MetodoContext ctx) {
        return agregarNodo(ctx, NoTerminales.METODO);
    }

    @Override
    public Integer visitFuncion(FuncionContext ctx) {
        return agregarNodo(ctx, NoTerminales.FUNC);
    }

    @Override
    public Integer visitValor(ValorContext ctx) {
        return agregarNodo(ctx, NoTerminales.VALOR);
    }

    @Override
    public Integer visitC_met(C_metContext ctx) {
        return agregarNodo(ctx, NoTerminales.C_METOD);
    }

    @Override
    public Integer visitVariables(VariablesContext ctx) {
        return agregarNodo(ctx, NoTerminales.VARIABLES);
    }

    @Override
    public Integer visitDeclStru(DeclStruContext ctx) {
        return agregarNodo(ctx, NoTerminales.STRUCT_V);
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
        return agregarNodo(ctx, NoTerminales.VALOR_S);
    }

    @Override
    public Integer visitStruct(StructContext ctx) {
        return agregarNodo(ctx, NoTerminales.STRUCT);
    }

    @Override
    public Integer visitAtrib(AtribContext ctx) {
        return agregarNodo(ctx, NoTerminales.ATRIB);
    }

    @Override
    public Integer visitAtrib_pcoma(Atrib_pcomaContext ctx) {
        return agregarNodo(ctx, NoTerminales.ATRIB);
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
        return agregarNodo(ctx, NoTerminales.ARREGLO);
    }

    @Override
    public Integer visitExpr(ExprContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitTipo(TipoContext ctx) {
        return agregarNodo(ctx, NoTerminales.TIPO);
    }

    @Override
    public Integer visitAnd(AndContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitIguDif(IguDifContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitMenMay(MenMayContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitSumRes(SumResContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitMulDiv(MulDivContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitTerm(TermContext ctx) {
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitUnario(UnarioContext ctx) {
        if (ctx.getChildCount() == 1) {
            return ctx.getChild(0).accept(this);
        }
        return agregarNodo(ctx, NoTerminales.EXPR);
    }

    @Override
    public Integer visitAccess_a(Access_aContext ctx) {
        return agregarNodo(ctx, NoTerminales.ACCESS_A);
    }

    @Override
    public Integer visitC_identi(C_identiContext ctx) {
        return agregarNodo(ctx, NoTerminales.C_IDENTI);
    }

    @Override
    public Integer visitIdenti(IdentiContext ctx) {
        return agregarNodo(ctx, NoTerminales.IDENTI);
    }

    @Override
    public Integer visitLl_func(Ll_funcContext ctx) {
        return agregarNodo(ctx, NoTerminales.LLAMETOD);
    }

    @Override
    public Integer visitValor_d(Valor_dContext ctx) {
        return agregarNodo(ctx, NoTerminales.VALOR_D);
    }

    private Integer agregarNodo(ParserRuleContext ctx, String nombre) {
        int nodo = g.agregarNodo(nombre);
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
