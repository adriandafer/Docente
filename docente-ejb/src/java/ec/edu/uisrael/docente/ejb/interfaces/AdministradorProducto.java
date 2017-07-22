/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.docente.ejb.interfaces;

import ec.edu.uisrael.docente.ejb.entidades.Producto;
import java.util.List;

/**
 *
 * @author casa
 */
public interface AdministradorProducto {
    
    List<Producto> listarProductos() throws Exception;
    
}
