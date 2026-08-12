package com.mycompany;

import com.mycompany.frontend.LatinusIDE;

/**
 * Hello world!
 *
 */
public class CodexLatinus {

    public static void main(String[] args) {
        var ide = new LatinusIDE();
        ide.setLocationRelativeTo(null);
        ide.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        ide.setVisible(true);
    }
}
