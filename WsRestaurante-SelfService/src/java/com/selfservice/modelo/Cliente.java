/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.modelo;

import java.sql.Date;

/**
 *
 * @author abarrime
 */
public class Cliente extends Persona {

    private int idCliente;

    public Cliente() {
        super();
        this.idCliente = 0;
    }

    public Cliente(int idCliente) {
        super();
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, int idPersona) {
        super(idPersona);
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono, String correo, Date fechaNacimiento, String genero, Date fechaRegistro, Date fechaModificacion) {
        super(cedula, nombre, apellido, direccion, telefono, correo, fechaNacimiento, genero, fechaRegistro, fechaModificacion);
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, int idPersona, String cedula, String nombre, String apellido, String direccion, String telefono, String correo, Date fechaNacimiento, String genero, Date fechaRegistro, Date fechaModificacion) {
        super(idPersona, cedula, nombre, apellido, direccion, telefono, correo, fechaNacimiento, genero, fechaRegistro, fechaModificacion);
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + getIdCliente() + '}';
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}
