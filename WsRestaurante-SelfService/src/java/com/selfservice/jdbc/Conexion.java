/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abarrime
 */
public class Conexion {

    private static transient Connection conexion;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/restaurante?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String user = "root";
    private static final String password = "Cobiscorp2020*";

    public Conexion() {
        conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public static Connection conectar() {
        conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {

        }

        return conexion;
    }

    public static Connection getConexion() {
        return conexion;
    }

}
