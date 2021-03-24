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
public class Empleado extends Persona {

    private int idEmpleado;
    private String numeroEmpleado;
    private String factorRh;
    private String cargo;
    private int salario;

    public Empleado() {
        super();
        this.idEmpleado = 0;
        this.numeroEmpleado = "";
        this.factorRh = "";
        this.cargo = "";
        this.salario = 0;
    }

    public Empleado(int idEmpleado) {
        super(idEmpleado);
        this.idEmpleado = 0;
        this.numeroEmpleado = "";
        this.factorRh = "";
        this.cargo = "";
        this.salario = 0;
    }

    public Empleado(int idEmpleado, String numeroEmpleado, String factorRh, String cargo, int salario) {
        super();
        this.idEmpleado = idEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.factorRh = factorRh;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(int idEmpleado, String numeroEmpleado, String rh, String cargo, int salario, int idPersona) {
        super(idPersona);
        this.idEmpleado = idEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.factorRh = rh;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(int idEmpleado, String numeroEmpleado, String factorRh, String cargo, int salario, String cedula, String nombre, String apellido, String direccion, String telefono, String correoElectronico, int edad, Date fechaNacimiento, String genero, Date fechaRegistro, Date fechaModificacion) {
        super(cedula, nombre, apellido, direccion, telefono, correoElectronico, edad, fechaNacimiento, genero, fechaRegistro, fechaModificacion);
        this.idEmpleado = idEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.factorRh = factorRh;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(int idEmpleado, String numeroEmpleado, String rh, String cargo, int salario, int idPersona, String cedula, String nombre, String apellido, String direccion, String telefono, String correoElectronico, int edad, Date fechaNacimiento, String genero, Date fechaRegistro, Date fechaModificacion) {
        super(idPersona, cedula, nombre, apellido, direccion, telefono, correoElectronico, edad, fechaNacimiento, genero, fechaRegistro, fechaModificacion);
        this.idEmpleado = idEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.factorRh = rh;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + getIdEmpleado() + ", numeroEmpleado=" + getNumeroEmpleado() + ", FactorRh=" + getFactorRh() + ", cargo=" + getCargo() + ", salario=" + getSalario() + '}';
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the numeroEmpleado
     */
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the factorRh
     */
    public String getFactorRh() {
        return factorRh;
    }

    /**
     * @param factorRh the factorRh to set
     */
    public void setFactorRh(String factorRh) {
        this.factorRh = factorRh;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

}
