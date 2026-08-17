
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbol_ast;

import java.io.BufferedWriter;
import java.io.IOException;

import com.mycompany.exceptions.AstException;

/**
 *
 * @author rafael-cayax
 */
public class Graphviz {
    private int nodoActual;
    private final BufferedWriter out;

    public Graphviz(BufferedWriter out) {
        this.out = out;
        try {
            out.write("graph AST {\n");
            out.write("    rankdir=TB;\n");
            out.write("    ranksep=1;\n");
        } catch (IOException e) {
            throw new AstException();
        }
    }

    public void terminar() {
        try {
            out.write("}\n");
        } catch (IOException e) {
            throw new AstException();
        }
    }

    /**
     * metodo para agregar un nuevo nodo
     * 
     * @param nodo
     */
    public int agregarNodo(String nodo) {
        try {
            out.write("    n" + nodoActual + "[label=\"" + nodo + "\"];\n");
        } catch (IOException e) {
            throw new AstException();
        }
        return nodoActual++;
    }

    public void agregarRelacion(int padre, int hijo) {
        try {
            out.write("    n" + padre + " -- n" + hijo + ";\n");
        } catch (IOException e) {
            throw new AstException();
        }
    }

}
