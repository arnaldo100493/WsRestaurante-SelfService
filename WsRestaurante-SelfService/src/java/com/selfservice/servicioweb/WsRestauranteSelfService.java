/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.servicioweb;

import com.selfservice.controlador.ControladorImpl;
import com.selfservice.dao.ClienteDao;
import com.selfservice.impldao.ClienteDaoImpl;
import com.selfservice.modelo.Cliente;
import java.sql.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author abarrime
 */
@WebService(serviceName = "WsRestauranteSelfService")
public class WsRestauranteSelfService {

    public WsRestauranteSelfService() {

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "cedula") String cedula, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido) {
        //TODO write your implementation code here:
        return "Agregado";
    }

    /**
     * This is a sample web service operation
     */
    /*@WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/
    /**
     * Web service operation
     *
     * @return
     */
   
}
