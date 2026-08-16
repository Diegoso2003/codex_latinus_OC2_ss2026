/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pila;

import com.mycompany.frontend.PilaFrontend;

/**
 *
 * @author rafael-cayax
 */
public class ReducePila extends AccionPila {
    private final int hijos;
    private final AccionPila[] elementos;

    public ReducePila(Elemento eleApilar, int hijos) {
        super(eleApilar);
        this.hijos = hijos;
        elementos = new AccionPila[hijos];
    }

    @Override
    public void apilar(PilaFrontend pila) {
        String log[] = new String[hijos];
        for (int i = hijos - 1; i >= 0; i--) {
            elementos[i] = pila.desApilar();
            log[i] = elementos[i].eleApilar.getSimbolo();
        }
        String logInfo = "reduce " + eleApilar.getSimbolo() +
                " -> " + String.join(" ", log);
        longitudLog = logInfo.length() + 4;
        pila.agregarPila(this);
        pila.agregarAlLog(logInfo);
    }

    @Override
    public void desapilar(PilaFrontend pila) {
        pila.desApilar();
        pila.eliminarDelLog(longitudLog);
        for (AccionPila elemento : elementos) {
            pila.agregarPila(elemento);
        }
    }

}
