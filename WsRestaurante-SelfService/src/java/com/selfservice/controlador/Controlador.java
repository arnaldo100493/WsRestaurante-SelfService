/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.controlador;

import java.util.List;

/**
 *
 * @author abarrime
 * @param <E>
 */
public interface Controlador<E> {

    public boolean add(E entity);

    public E findById(int id);

    public List<E> list();

    public boolean edit(E entity);

    public E delete(int id);

    public boolean delete(E entity);

}
