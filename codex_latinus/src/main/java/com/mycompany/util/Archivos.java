package com.mycompany.util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import com.mycompany.exceptions.DesktopException;

/**
 * abrirArchivo
 */
public class Archivos {

    public static void abrirArchivo(File archivo) {
        if (!Desktop.isDesktopSupported()) {
            return;
        }
        Desktop desktop = Desktop.getDesktop();

        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            return;
        }

        URI uriDelArchivo = archivo.toURI();
        try {
            desktop.browse(uriDelArchivo);
        } catch (IOException e) {
            throw new DesktopException(
                    "error al abrir el archivo, archivo generado en: "
                            + archivo.getPath());
        }
    }
}
