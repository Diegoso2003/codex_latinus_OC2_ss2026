package com.mycompany.arbol_ast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.mycompany.antlr4.CodexLatinusParser.ProgContext;
import com.mycompany.exceptions.AstException;
import com.mycompany.util.Archivos;

public class ArbolAst {
    public static final String CARPETA = "reportes";
    private static final String ARCHIVO_DOT = "arbol_ast.dot";
    private static final String ARCHIVO_SVG = "arbol_ast.svg";

    public void crearArbol(ProgContext ctx) {
        File carpeta = new File(CARPETA);
        if (!carpeta.exists() || !carpeta.isDirectory()) {
            carpeta.mkdir();
        }
        try (BufferedWriter bf = Files.newBufferedWriter(
                Path.of(CARPETA, ARCHIVO_DOT))) {
            var graph = new Graphviz(bf);
            var visitor = new ArbolAstGrVisitor(graph);
            visitor.visit(ctx);
            graph.terminar();
        } catch (Exception e) {
            throw new AstException();
        }
        crearSvg();
    }

    private void crearSvg() {
        try {
            File archivoDot = new File(CARPETA, ARCHIVO_DOT);
            File archivoSvg = new File(CARPETA, ARCHIVO_SVG);
            ProcessBuilder pb = new ProcessBuilder("dot", "-Tsvg", archivoDot.getAbsolutePath(), "-o",
                    archivoSvg.getAbsolutePath());
            Process process;
            process = pb.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                Archivos.abrirArchivo(archivoSvg);
            } else {
                throw new AstException();
            }
        } catch (IOException | InterruptedException e) {
            throw new AstException();
        }
    }
}
