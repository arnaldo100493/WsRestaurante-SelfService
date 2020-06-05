/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.modelo;

/**
 *
 * @author abarrime
 */
public class Proveedor {

    private int idProveedor;
    private String nit;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;

    public Proveedor() {
        this.idProveedor = 0;
        this.nit = "";
        this.nombre = "";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
    }

    public Proveedor(int idProveedor) {
        this.idProveedor = idProveedor;
        this.nit = "";
        this.nombre = "";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
    }

    public Proveedor(String nit, String nombre, String ciudad, String direccion, String telefono, String correo) {
        this.idProveedor = 0;
        this.nit = nit;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Proveedor(int idProveedor, String nit, String nombre, String ciudad, String direccion, String telefono, String correo) {
        this.idProveedor = idProveedor;
        this.nit = nit;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + getIdProveedor() + ", nit=" + getNit() + ", nombre=" + getNombre() + ", ciudad=" + getCiudad() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", correo=" + getCorreo() + '}';
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
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
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
