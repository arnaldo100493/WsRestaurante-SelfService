/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abarrime
 * @param <E>
 */
public class ControladorImpl<E> implements Controlador<E> {

    private final List<E> listadoElementos;

    public ControladorImpl() {
        this.listadoElementos = new ArrayList<>();
    }

    @Override
    public boolean add(E entidad) {
        this.listadoElementos.add(entidad);
        return true;
    }

    @Override
    public E findById(int id) {
        return this.listadoElementos.get(id);
    }

    @Override
    public List<E> list() {
        return this.listadoElementos;
    }

    @Override
    public boolean edit(E entidad) {
        for (int i = 0; i < this.listadoElementos.size(); i++) {
            E elemento = this.listadoElementos.get(i);
            this.listadoElementos.remove(elemento);
            this.listadoElementos.add(entidad);
        }
        return true;
    }

    @Override
    public E delete(int id) {
        E elemento = null;
        for (int i = 0; i < this.listadoElementos.size(); i++) {
            elemento = this.listadoElementos.remove(id);
        }
        return elemento;
    }

    @Override
    public boolean delete(E entidad) {
        this.listadoElementos.remove(entidad);
        return true;
    }
}
