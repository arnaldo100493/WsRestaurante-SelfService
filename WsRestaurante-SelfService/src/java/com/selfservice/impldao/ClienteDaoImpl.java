/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.impldao;

import com.selfservice.controlador.ControladorImpl;
import com.selfservice.dao.ClienteDao;
import com.selfservice.jdbc.Conexion;
import com.selfservice.modelo.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abarrime
 */
public class ClienteDaoImpl extends ControladorImpl<Cliente> implements ClienteDao {

    public ClienteDaoImpl() {

    }

    public boolean agregar(Cliente cliente) {
        String sql = "insert into clente(id_cliente, cedula, nombre, apellido, direccion, telefono, correo_electronico, edad, fecha_nacimiento, genero, fecha_registro, fecha_modificacion) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int filasAfectadas = 0;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, cliente.getIdCliente());
            statement.setString(2, cliente.getCedula());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getApellido());
            statement.setString(5, cliente.getDireccion());
            statement.setString(6, cliente.getTelefono());
            statement.setString(7, cliente.getCorreoElectronico());
            statement.setInt(8, cliente.getEdad());
            statement.setDate(9, cliente.getFechaNacimiento());
            statement.setString(10, cliente.getGenero());
            statement.setDate(11, cliente.getFechaRegistro());
            statement.setDate(12, cliente.getFechaModificacion());
            filasAfectadas = statement.executeUpdate();
            if (filasAfectadas == 0) {
                filasAfectadas = 1;
            } else {
                filasAfectadas = 0;
            }
        } catch (SQLException ex) {

        }
        return this.add(cliente);
    }

    public Cliente buscarPorIdCliente(int idCliente) {
        Cliente cliente = null;
        String sql = "select * from cliente where id_cliente = ?";
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idCliente);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String cedula = resultSet.getString(2);
                String nombre = resultSet.getString(3);
                String apellido = resultSet.getString(4);
                String direccion = resultSet.getString(5);
                String telefono = resultSet.getString(6);
                String correoElectronico = resultSet.getString(7);
                int edad = resultSet.getInt(8);
                Date fechaNacimiento = resultSet.getDate(9);
                String genero = resultSet.getString(10);
                Date fechaRegistro = resultSet.getDate(11);
                Date fechaModificacion = resultSet.getDate(12);
                cliente = new Cliente(idCliente, cedula, nombre, apellido, direccion, telefono, correoElectronico, edad, fechaNacimiento, genero, fechaRegistro, fechaModificacion);
            }
        } catch (SQLException ex) {

        }
        return this.findById(idCliente);
    }

    public List<Cliente> listar() {
        List<Cliente> listadoClientes = new ArrayList<>();
        String sql = "select * from cliente";
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idCliente = resultSet.getInt(1);
                String cedula = resultSet.getString(2);
                String nombre = resultSet.getString(3);
                String apellido = resultSet.getString(4);
                String direccion = resultSet.getString(5);
                String telefono = resultSet.getString(6);
                String correoElectronico = resultSet.getString(7);
                int edad = resultSet.getInt(8);
                Date fechaNacimiento = resultSet.getDate(9);
                String genero = resultSet.getString(10);
                Date fechaRegistro = resultSet.getDate(11);
                Date fechaModificacion = resultSet.getDate(12);
                Cliente cliente = new Cliente(idCliente, cedula, nombre, apellido, direccion, telefono, correoElectronico, edad, fechaNacimiento, genero, fechaRegistro, fechaModificacion);
                listadoClientes.add(cliente);
            }
        } catch (SQLException ex) {

        }
        return this.list();
    }

    public boolean editar(Cliente cliente) {
        String sql = "update clente set (cedula, nombre, apellido, direccion, telefono, correo_electronico, edad, fecha_nacimiento, genero, fecha_registro, fecha_modificacion) where id_cliente = ?";
        int filasAfectadas = 0;
        Connection conexion = Conexion.conectar();
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, cliente.getIdCliente());
            statement.setString(2, cliente.getCedula());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getApellido());
            statement.setString(5, cliente.getDireccion());
            statement.setString(6, cliente.getTelefono());
            statement.setString(7, cliente.getCorreoElectronico());
            statement.setInt(8, cliente.getEdad());
            statement.setDate(9, cliente.getFechaNacimiento());
            statement.setString(10, cliente.getGenero());
            statement.setDate(11, cliente.getFechaRegistro());
            statement.setDate(12, cliente.getFechaModificacion());
            filasAfectadas = statement.executeUpdate();
            if (filasAfectadas == 0) {
                filasAfectadas = 1;
            } else {
                filasAfectadas = 0;
            }
        } catch (SQLException ex) {

        }
        return this.edit(cliente);
    }

}
