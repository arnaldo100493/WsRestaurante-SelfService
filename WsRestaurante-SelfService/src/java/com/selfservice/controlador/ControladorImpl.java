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
        for (int i = 0; i < listadoElementos.size(); i++) {

        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(E entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(E entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
