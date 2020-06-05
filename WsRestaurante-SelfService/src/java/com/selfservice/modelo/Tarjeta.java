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
public class Tarjeta {

    private int idTarjeta;
    private String codigo;
    private String tipoTarjeta;
    private String franquicia;
    private int numeroCuotas;

    public Tarjeta() {
        this.idTarjeta = 0;
        this.codigo = "";
        this.tipoTarjeta = "";
        this.franquicia = "";
        this.numeroCuotas = 0;
    }

    public Tarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
        this.codigo = "";
        this.tipoTarjeta = "";
        this.franquicia = "";
        this.numeroCuotas = 0;
    }

    public Tarjeta(String codigo, String tipoTarjeta, String franquicia, int numeroCuotas) {
        this.idTarjeta = 0;
        this.codigo = codigo;
        this.tipoTarjeta = tipoTarjeta;
        this.franquicia = franquicia;
        this.numeroCuotas = numeroCuotas;
    }

    public Tarjeta(int idTarjeta, String codigo, String tipoTarjeta, String franquicia, int numeroCuotas) {
        this.idTarjeta = idTarjeta;
        this.codigo = codigo;
        this.tipoTarjeta = tipoTarjeta;
        this.franquicia = franquicia;
        this.numeroCuotas = numeroCuotas;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "idTarjeta=" + getIdTarjeta() + ", codigo=" + getCodigo() + ", tipoTarjeta=" + getTipoTarjeta() + ", franquicia=" + getFranquicia() + ", numeroCuotas=" + getNumeroCuotas() + '}';
    }

    /**
     * @return the idTarjeta
     */
    public int getIdTarjeta() {
        return idTarjeta;
    }

    /**
     * @param idTarjeta the idTarjeta to set
     */
    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
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
     * @return the tipoTarjeta
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * @param tipoTarjeta the tipoTarjeta to set
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * @return the franquicia
     */
    public String getFranquicia() {
        return franquicia;
    }

    /**
     * @param franquicia the franquicia to set
     */
    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    /**
     * @return the numeroCuotas
     */
    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    /**
     * @param numeroCuotas the numeroCuotas to set
     */
    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

}
