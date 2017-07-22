/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.docente.ws;

import ec.edu.uisrael.docente.ejb.entidades.Usuario;
import ec.edu.uisrael.docente.ejb.interfaces.AdministradorLogin;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author casa
 */
@WebService(serviceName = "LoginServices")
public class LoginServices {
    
    @EJB
    AdministradorLogin admin;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "login", action = "loginAction")
    public Usuario login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        try{
            Usuario usr = admin.validarUsuario(username, password);
            return usr;
        }catch (Exception e){
            return null;
        }
    }
}
