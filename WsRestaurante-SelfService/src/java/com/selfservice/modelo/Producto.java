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
public class Producto {

    private int idProducto;
    private Proveedor proveedor;
    private String codigo;
    private String nombre;
    private String descripcion;
    private int precio;

    public Producto() {
        this.idProducto = 0;
        this.proveedor = null;
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
        this.proveedor = null;
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
    }
    
     public Producto(Proveedor proveedor, String codigo, String nombre, String descripcion, int precio) {
        this.idProducto = 0;
        this.proveedor = proveedor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(int idProducto, Proveedor proveedor, String codigo, String nombre, String descripcion, int precio) {
        this.idProducto = idProducto;
        this.proveedor = proveedor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + getIdProducto() + ", proveedor=" + getProveedor() + ", codigo=" + getCodigo() + ", nombre=" + getNombre() + ", descripcion=" + getDescripcion() + ", precio=" + getPrecio() + '}';
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
