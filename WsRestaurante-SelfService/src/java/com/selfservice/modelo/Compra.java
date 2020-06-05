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
public class Compra {

    private int idCompra;
    private String codigo;
    private String numeroFactura;
    private Date fechaCompra;

    public Compra() {
        this.idCompra = 0;
        this.codigo = "";
        this.numeroFactura = "";
        this.fechaCompra = null;
    }

    public Compra(int idCompra) {
        this.idCompra = idCompra;
        this.codigo = "";
        this.numeroFactura = "";
        this.fechaCompra = null;
    }

    public Compra(String codigo, String numeroFactura, Date fechaCompra) {
        this.idCompra = 0;
        this.codigo = codigo;
        this.numeroFactura = numeroFactura;
        this.fechaCompra = fechaCompra;
    }

    public Compra(int idCompra, String codigo, String numeroFactura, Date fechaCompra) {
        this.idCompra = idCompra;
        this.codigo = codigo;
        this.numeroFactura = numeroFactura;
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + getIdCompra() + ", codigo=" + getCodigo() + ", numeroFactura=" + getNumeroFactura() + ", fechaCompra=" + getFechaCompra() + '}';
    }

    /**
     * @return the idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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
     * @return the numeroFactura
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the fechaCompra
     */
    public Date getFechaCompra() {
        return fechaCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
