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
public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private Empleado empleado;
    private Producto producto;
    private String codigo;

    public Pedido() {
        this.idPedido = 0;
        this.cliente = null;
        this.empleado = null;
        this.producto = null;
        this.codigo = "";
    }

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.cliente = null;
        this.empleado = null;
        this.producto = null;
        this.codigo = "";
    }

    public Pedido(Cliente cliente, Empleado empleado, Producto producto, String codigo) {
        this.idPedido = 0;
        this.cliente = cliente;
        this.empleado = empleado;
        this.producto = producto;
        this.codigo = codigo;
    }

    public Pedido(int idPedido, Cliente cliente, Empleado empleado, Producto producto, String codigo) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.empleado = empleado;
        this.producto = producto;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + getIdPedido() + ", cliente=" + getCliente() + ", empleado=" + getEmpleado() + ", producto=" + getProducto() + ", codigo=" + getCodigo() + '}';
    }

    /**
     * @return the idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
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

}
