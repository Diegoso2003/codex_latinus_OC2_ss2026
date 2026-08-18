/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend.color;

import com.mycompany.antlr4.CodexLatinusLexer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author rafael-cayax
 */
public class Coloreador {

    private final JTextPane editor;
    private final StyledDocument doc;
    private final Timer timer;
    private final SimpleAttributeSet defecto;
    private final Map<Integer, AttributeSet> estilos;

    public Coloreador(JTextPane editor) {
        this.editor = editor;
        this.doc = editor.getStyledDocument();
        defecto = new SimpleAttributeSet();
        estilos = new HashMap<>();
        StyleConstants.setForeground(defecto, editor.getForeground());
        crearEstilos();
        timer = new Timer(150, this::colorear);
        doc.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                timer.restart();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                timer.restart();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    private void colorear(ActionEvent e) {
        String texto = editor.getText();
        var lexer = new CodexLatinusLexer(CharStreams.fromString(texto));
        lexer.removeErrorListeners();
        SwingUtilities.invokeLater(() -> {
            doc.setCharacterAttributes(0, texto.length(),
                    defecto, true);
            Token token;
            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                AttributeSet style = estilos.get(token.getType());
                if (style == null)
                    continue;
                int start = token.getStartIndex();
                int lenght = token.getText().length();
                doc.setCharacterAttributes(start, lenght, style, true);
            }
        });
    }

    private void crearEstilos() {
        var palabraReservada = new SimpleAttributeSet();
        StyleConstants.setForeground(palabraReservada, new Color(255, 121, 198));
        estilos.put(CodexLatinusLexer.VERUM, palabraReservada);
        estilos.put(CodexLatinusLexer.FALSUS, palabraReservada);
        estilos.put(CodexLatinusLexer.PR, palabraReservada);
        estilos.put(CodexLatinusLexer.IT, palabraReservada);
        estilos.put(CodexLatinusLexer.ES, palabraReservada);
        estilos.put(CodexLatinusLexer.SR, palabraReservada);
        estilos.put(CodexLatinusLexer.FC, palabraReservada);
        estilos.put(CodexLatinusLexer.DUM, palabraReservada);
        estilos.put(CodexLatinusLexer.PR, palabraReservada);
        estilos.put(CodexLatinusLexer.AT, palabraReservada);
        estilos.put(CodexLatinusLexer.SI, palabraReservada);
        estilos.put(CodexLatinusLexer.FN, palabraReservada);
        estilos.put(CodexLatinusLexer.RT, palabraReservada);
        estilos.put(CodexLatinusLexer.RD, palabraReservada);
        estilos.put(CodexLatinusLexer.ST, palabraReservada);
        estilos.put(CodexLatinusLexer.AC, palabraReservada);
        estilos.put(CodexLatinusLexer.VAR, palabraReservada);
        estilos.put(CodexLatinusLexer.FNS, palabraReservada);
        estilos.put(CodexLatinusLexer.MUN, palabraReservada);
        estilos.put(CodexLatinusLexer.MAI, palabraReservada);
        
        var tipo = new SimpleAttributeSet();
        StyleConstants.setForeground(tipo, new Color(80, 250, 123));
        estilos.put(CodexLatinusLexer.BOOL, tipo);
        estilos.put(CodexLatinusLexer.DECI, tipo);
        estilos.put(CodexLatinusLexer.NUME, tipo);
        estilos.put(CodexLatinusLexer.LITT, tipo);
        estilos.put(CodexLatinusLexer.TXT, tipo);

        var identificador = new SimpleAttributeSet();
        StyleConstants.setForeground(identificador, new Color(139, 233, 253));
        estilos.put(CodexLatinusLexer.ID, identificador);

        var separador = new SimpleAttributeSet();
        StyleConstants.setForeground(separador, Color.LIGHT_GRAY);
        estilos.put(CodexLatinusLexer.PAA, separador);
        estilos.put(CodexLatinusLexer.PAC, separador);
        estilos.put(CodexLatinusLexer.LLAA, separador);
        estilos.put(CodexLatinusLexer.LLAC, separador);
        estilos.put(CodexLatinusLexer.PCO, separador);
        estilos.put(CodexLatinusLexer.COM, separador);
        estilos.put(CodexLatinusLexer.PUN, separador);

        var cadena = new SimpleAttributeSet();
        StyleConstants.setForeground(cadena, new Color(241, 250, 140));
        estilos.put(CodexLatinusLexer.TEXT, cadena);
        estilos.put(CodexLatinusLexer.CHAR, cadena);
        estilos.put(CodexLatinusLexer.CORA, cadena);
        estilos.put(CodexLatinusLexer.CORC, cadena);
        estilos.put(CodexLatinusLexer.DPUN, cadena);

        var numero = new SimpleAttributeSet();
        StyleConstants.setForeground(numero, new Color(189, 147, 249));
        estilos.put(CodexLatinusLexer.INT, numero);
        estilos.put(CodexLatinusLexer.DEC, numero);

        var operador = new SimpleAttributeSet();
        StyleConstants.setForeground(operador, new Color(255, 184, 108));
        estilos.put(CodexLatinusLexer.MAY, operador);
        estilos.put(CodexLatinusLexer.MAYI, operador);
        estilos.put(CodexLatinusLexer.MEN, operador);
        estilos.put(CodexLatinusLexer.MENI, operador);
        estilos.put(CodexLatinusLexer.MAS, operador);
        estilos.put(CodexLatinusLexer.MENOS, operador);
        estilos.put(CodexLatinusLexer.POR, operador);
        estilos.put(CodexLatinusLexer.DIV, operador);
        estilos.put(CodexLatinusLexer.INCRE, operador);
        estilos.put(CodexLatinusLexer.DECRE, operador);
        estilos.put(CodexLatinusLexer.AND, operador);
        estilos.put(CodexLatinusLexer.OR, operador);
        estilos.put(CodexLatinusLexer.DIF, operador);
        estilos.put(CodexLatinusLexer.IGU, operador);
        estilos.put(CodexLatinusLexer.NON, operador);
        estilos.put(CodexLatinusLexer.LEER, operador);
        estilos.put(CodexLatinusLexer.IMPRI, operador);
        estilos.put(CodexLatinusLexer.ASIG, operador);
    }

}
