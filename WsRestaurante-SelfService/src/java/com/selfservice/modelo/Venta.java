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
public class Venta {

    private int idVenta;
    private DetalleVenta detalleVenta;
    private String codigo;
    private int cantidadProducto;
    private int subtotal;
    private int totalVenta;

    public Venta() {
        this.idVenta = 0;
        this.detalleVenta = null;
        this.codigo = "";
        this.cantidadProducto = 0;
        this.subtotal = 0;
        this.totalVenta = 0;
    }

    public Venta(int idVenta) {
        this.idVenta = idVenta;
        this.detalleVenta = null;
        this.codigo = "";
        this.cantidadProducto = 0;
        this.subtotal = 0;
        this.totalVenta = 0;
    }

    public Venta(DetalleVenta detalleVenta, String codigo, int cantidadProducto, int subtotal, int totalVenta) {
        this.idVenta = 0;
        this.detalleVenta = detalleVenta;
        this.codigo = codigo;
        this.cantidadProducto = cantidadProducto;
        this.subtotal = subtotal;
        this.totalVenta = totalVenta;
    }

    public Venta(int idVenta, DetalleVenta detalleVenta, String codigo, int cantidadProducto, int subtotal, int totalVenta) {
        this.idVenta = idVenta;
        this.detalleVenta = detalleVenta;
        this.codigo = codigo;
        this.cantidadProducto = cantidadProducto;
        this.subtotal = subtotal;
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + getIdVenta() + ", detalleVenta=" + getDetalleVenta() + ", codigo=" + getCodigo() + ", cantidadProducto=" + getCantidadProducto() + ", subtotal=" + getSubtotal() + ", totalVenta=" + getTotalVenta() + '}';
    }

    /**
     * @return the idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * @param idVenta the idVenta to set
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * @return the detalleVenta
     */
    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    /**
     * @param detalleVenta the detalleVenta to set
     */
    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
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
     * @return the cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * @param cantidadProducto the cantidadProducto to set
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    /**
     * @return the subtotal
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the totalVenta
     */
    public int getTotalVenta() {
        return totalVenta;
    }

    /**
     * @param totalVenta the totalVenta to set
     */
    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

}
