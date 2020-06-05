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
public class Pago {

    private int idPago;
    private Venta venta;
    private String codigo;
    private String medioPago;
    private Date fechaPago;

    public Pago() {
        this.idPago = 0;
        this.venta = null;
        this.codigo = "";
        this.medioPago = "";
        this.fechaPago = null;
    }

    public Pago(int pago) {
        this.idPago = pago;
        this.venta = null;
        this.codigo = "";
        this.medioPago = "";
        this.fechaPago = null;
    }

    public Pago(Venta venta, String codigo, String medioPago, Date fechaPago) {
        this.idPago = 0;
        this.venta = venta;
        this.codigo = codigo;
        this.medioPago = medioPago;
        this.fechaPago = fechaPago;
    }

    public Pago(int idPago, Venta venta, String codigo, String medioPago, Date fechaPago) {
        this.idPago = idPago;
        this.venta = venta;
        this.codigo = codigo;
        this.medioPago = medioPago;
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + getIdPago() + ", venta=" + getVenta() + ", codigo=" + getCodigo() + ", medioPago=" + getMedioPago() + ", fechaPago=" + getFechaPago() + '}';
    }

    /**
     * @return the idPago
     */
    public int getIdPago() {
        return idPago;
    }

    /**
     * @param idPago the idPago to set
     */
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the venta
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
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
     * @return the medioPago
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * @param medioPago the medioPago to set
     */
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    /**
     * @return the fechaPago
     */
    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

}
