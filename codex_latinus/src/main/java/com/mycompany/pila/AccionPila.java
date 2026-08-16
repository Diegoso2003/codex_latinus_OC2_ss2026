/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pila;

import com.mycompany.frontend.PilaFrontend;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 *
 * @author rafael-cayax
 */
@Getter
@Setter
@RequiredArgsConstructor
public abstract class AccionPila {
    protected final Elemento eleApilar;
    protected int longitudLog;

    public abstract void apilar(PilaFrontend pila);

    public abstract void desapilar(PilaFrontend pila);
}
