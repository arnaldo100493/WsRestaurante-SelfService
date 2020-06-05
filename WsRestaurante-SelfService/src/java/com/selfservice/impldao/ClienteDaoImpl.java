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
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author abarrime
 */
public class ClienteDaoImpl extends ControladorImpl<Cliente> implements ClienteDao {

    public ClienteDaoImpl() {

    }

    public boolean agregar(Cliente cliente) {
        String sql = "insert into clente(id_cliente, cedula, nombre, apellido, direccion, telefono, correo, fecha_nacimiento, genero, fecha_registro, fecha_modificacion) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            statement.setString(7, cliente.getCorreo());
            statement.setDate(8, cliente.getFechaNacimiento());
            statement.setString(9, cliente.getGenero());
            statement.setDate(10, cliente.getFechaRegistro());
            statement.setDate(11, cliente.getFechaModificacion());
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

}
