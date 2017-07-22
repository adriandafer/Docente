/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.docente.ejb.controladores;

import ec.edu.uisrael.docente.ejb.entidades.Usuario;
import ec.edu.uisrael.docente.ejb.interfaces.AdministradorLogin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author casa
 */

@Stateless
public class AdministradoLoginBean implements AdministradorLogin{
    
    @PersistenceContext(unitName = "docente-ejbPU")
    private EntityManager em;
    
    
    @Override
    public Usuario validarUsuario(String username, String password) throws Exception{
        try{
            String sql = "Select T from Usuario T where T.username = :var1 and T.password = :var2";
            Object obj = em.createQuery(sql).setParameter("var1", username).setParameter("var2", password).getSingleResult();
            Usuario usr = (Usuario) obj;
            return usr;      
        } catch (Exception e){
            throw e;
        }   
    }
}

