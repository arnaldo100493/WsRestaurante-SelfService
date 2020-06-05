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
public class Inventario {

    private int idInventario;
    private String codigo;
    private int cantidadInicialProducto;
    private int cantidadDisponibleProducto;

    public Inventario() {
        this.idInventario = 0;
        this.codigo = "";
        this.cantidadInicialProducto = 0;
        this.cantidadDisponibleProducto = 0;
    }

    public Inventario(int idInventario) {
        this.idInventario = idInventario;
        this.codigo = "";
        this.cantidadInicialProducto = 0;
        this.cantidadDisponibleProducto = 0;
    }

    public Inventario(int idInventario, String codigo, int cantidadInicialProducto, int cantidadDisponibleProducto) {
        this.idInventario = idInventario;
        this.codigo = codigo;
        this.cantidadInicialProducto = cantidadInicialProducto;
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + getIdInventario() + ", codigo=" + getCodigo() + ", cantidadInicialProducto=" + getCantidadInicialProducto() + ", cantidadDisponibleProducto=" + getCantidadDisponibleProducto() + '}';
    }

    /**
     * @return the idInventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario the idInventario to set
     */
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
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
     * @return the cantidadInicialProducto
     */
    public int getCantidadInicialProducto() {
        return cantidadInicialProducto;
    }

    /**
     * @param cantidadInicialProducto the cantidadInicialProducto to set
     */
    public void setCantidadInicialProducto(int cantidadInicialProducto) {
        this.cantidadInicialProducto = cantidadInicialProducto;
    }

    /**
     * @return the cantidadDisponibleProducto
     */
    public int getCantidadDisponibleProducto() {
        return cantidadDisponibleProducto;
    }

    /**
     * @param cantidadDisponibleProducto the cantidadDisponibleProducto to set
     */
    public void setCantidadDisponibleProducto(int cantidadDisponibleProducto) {
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
    }

}
