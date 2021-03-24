/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selfservice.servicioweb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author abarrime
 */
@WebService(serviceName = "WsRestauranteSelfService")
public class WsEmpleadoRestauranteSelfService {

    public WsEmpleadoRestauranteSelfService() {

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "cedula") String cedula, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "correoElectronico") String correoElectronico, @WebParam(name = "edad") String edad, @WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "genero") String genero) {
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
