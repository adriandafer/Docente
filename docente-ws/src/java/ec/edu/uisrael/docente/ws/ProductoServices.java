/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.docente.ws;

import ec.edu.uisrael.docente.ejb.entidades.Producto;
import ec.edu.uisrael.docente.ejb.interfaces.AdministradorProducto;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author casa
 */
@WebService(serviceName = "ProductoServices")
public class ProductoServices {
    
    @EJB
    AdministradorProducto admin;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "listarProducto", action = "listarProductoAction")
    public List<Producto> listarProducto() {
        try {
            List<Producto> lista = admin.listarProductos();
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
}
