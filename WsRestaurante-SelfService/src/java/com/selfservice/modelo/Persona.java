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
public abstract class Persona {

    private int idPersona;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private int edad;
    private Date fechaNacimiento;
    private String genero;
    private Date fechaRegistro;
    private Date fechaModificacion;

    public Persona() {
        this.idPersona = 0;
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.edad = 0;
        this.fechaNacimiento = null;
        this.fechaRegistro = null;
        this.fechaModificacion = null;

    }

    public Persona(int idPersona) {
        this.idPersona = idPersona;
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.edad = 0;
        this.fechaNacimiento = null;
        this.fechaRegistro = null;
        this.fechaModificacion = null;

    }

    public Persona(String cedula, String nombre, String apellido, String direccion, String telefono, String correoElectronico, int edad, Date fechaNacimiento, String genero, Date fechaRegistro, Date fechaModificacion) {
        this.idPersona = 0;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    
    public Persona(String cedula, String nombre, String apellido, String direccion, String telefono, String correoElectronico, int edad, Date fechaNacimiento, String genero){
        this.idPersona = 0;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.fechaRegistro = null;
        this.fechaModificacion = null;
    }

    public Persona(int idPersona, String cedula, String nombre, String apellido, String direccion, String telefono, String correoElectronico, int edad, Date fechaNacimiento, String genero, Date fechaRegistro, Date fechaModificacion) {
        this.idPersona = idPersona;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + getIdPersona() + ", cedula=" + getCedula() + ", nombre=" + getNombre() + ", apellido=" + getApellido() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", correoElectronico=" + getCorreoElectronico() + ", edad=" + getEdad() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", fechaRegistro=" + getFechaRegistro() + ", fechaModificacion=" + getFechaModificacion() + '}';
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the fechaModificacion
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * @param fechaModificacion the fechaModificacion to set
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
