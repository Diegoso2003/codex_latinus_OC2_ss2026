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
public class ShiftPila extends AccionPila {

    public ShiftPila(Elemento eleApilar) {
        super(eleApilar);
    }

    @Override
    public void apilar(PilaFrontend pila) {
        pila.agregarPila(this);
        String log = "shift " + eleApilar.getSimbolo();
        longitudLog = log.length() + 4;
        pila.agregarAlLog(log);
    }

    @Override
    public void desapilar(PilaFrontend pila) {
        pila.desApilar();
        pila.eliminarDelLog(longitudLog);
    }

}
