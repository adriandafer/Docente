/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.docente.ejb.controladores;

import ec.edu.uisrael.docente.ejb.entidades.Producto;
import ec.edu.uisrael.docente.ejb.interfaces.AdministradorProducto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author casa
 */

@Stateless
public class AdministradorProductoBean implements AdministradorProducto{
    
    @PersistenceContext(unitName = "docente-ejbPU")
    private EntityManager em;

    @Override
    public List<Producto> listarProductos() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
            String sql = "Select T from Producto T ";
            List<Producto> lista = em.createQuery(sql).getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
        
    } 
}
