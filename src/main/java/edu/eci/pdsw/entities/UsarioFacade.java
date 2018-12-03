package edu.eci.pdsw.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UsarioFacade implements Serializable{
    
    @PersistenceContext (unitName = "primePU")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public User iniciarSesion(User us){
        System.out.println("erro ---------------------------------------------------------------------------------------------------");
        User usuario = null;
        String consulta;
        try{
            System.out.println("entro sesion");
            consulta = "FROM User u WHERE u.email = ?1 and u.contrasenia = ?2";
            System.out.println("entro antes query");
            Query query = em.createQuery(consulta);
            query.setParameter(1,us.getEmail());
            query.setParameter(2,us.getContrasenia());
            
            List<User> lista =  query.getResultList();
            
            if(!lista.isEmpty()){
                usuario = lista.get(0);
            }
        }catch(Exception e){
            throw e;
        }
        return usuario;
    }
    
      
    
}
