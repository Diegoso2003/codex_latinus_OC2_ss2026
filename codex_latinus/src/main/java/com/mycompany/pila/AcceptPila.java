package com.mycompany.pila;

import com.mycompany.frontend.PilaFrontend;

public class AcceptPila extends AccionPila {

    public AcceptPila() {
        super(null);
    }

    @Override
    public void apilar(PilaFrontend pila) {
        String texto = "accept";
        this.longitudLog = texto.length() + 4;
        pila.agregarPila(this, false);
        pila.agregarAlLog(texto);
    }

    @Override
    public void desapilar(PilaFrontend pila) {
        pila.eliminarDelLog(longitudLog);
        pila.desApilarAccept();
    }

}
