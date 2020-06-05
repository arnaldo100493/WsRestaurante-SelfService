/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.modelo;

import java.util.List;

/**
 *
 * @author abarrime
 */
public class DetalleVenta {

    private int idDetalleVenta;
    private List<Pedido> pedidos;
    private String codigo;
    private int cantidadProducto;
    private int total;

    public DetalleVenta() {
        this.idDetalleVenta = 0;
        this.pedidos = null;
        this.codigo = "";
        this.cantidadProducto = 0;
        this.total = 0;
    }

    public DetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.pedidos = null;
        this.codigo = "";
        this.cantidadProducto = 0;
        this.total = 0;
    }

    public DetalleVenta(List<Pedido> pedidos, String codigo, int cantidadProducto, int total) {
        this.idDetalleVenta = 0;
        this.pedidos = pedidos;
        this.codigo = codigo;
        this.cantidadProducto = cantidadProducto;
        this.total = total;
    }

    public DetalleVenta(int idDetalleVenta, List<Pedido> pedidos, String codigo, int cantidadProducto, int total) {
        this.idDetalleVenta = idDetalleVenta;
        this.pedidos = pedidos;
        this.codigo = codigo;
        this.cantidadProducto = cantidadProducto;
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + getIdDetalleVenta() + ", pedidos=" + getPedidos() + ", codigo=" + getCodigo() + ", cantidadProducto=" + getCantidadProducto() + ", total=" + getTotal() + '}';
    }

    /**
     * @return the idDetalleVenta
     */
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     * @param idDetalleVenta the idDetalleVenta to set
     */
    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    /**
     * @return the pedido
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos
     */
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
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
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

}
