package edu.eci.pdsw.services.impl;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.IntentionDAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.util.List;

public class InitiativeBankServicesImpl implements InitiativeBankServices {

    @Inject
    private UserDAO userDAO;
    
    @Inject
    private IntentionDAO intentionDAO;

    @Override
    public List<User> consultarUsuarios() throws InitiativeBankException{
        try {
            return userDAO.consultaUsers();
        } catch (PersistenceException ex) {
            throw new InitiativeBankException(ex.getMessage());
        }
    }
    
    
    @Override
    public User consultarUsuario(String mail) throws InitiativeBankException{
        try {
            return userDAO.consultaUser(mail);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException(ex.getMessage());
        }
    }

    @Override
    public List<Intention> consultaIntencion() throws InitiativeBankException {
        try {
            return intentionDAO.consultaAll();
        } catch (PersistenceException e) {
            throw new InitiativeBankException(e.getMessage(), e);
        }        
    }

    @Override
    public List<Intention> consultaIntencion(String palabra) throws InitiativeBankException {
        try {
            return intentionDAO.searchIntention(palabra);
        } catch (PersistenceException e) {
            throw new InitiativeBankException(e.getMessage(), e);
        } 
    }

    @Override
    public void crearIntencion(int  idUser, String state, String content, String title) throws InitiativeBankException {
        try {
            
            intentionDAO.crearIntencion(idUser, state, content, title);
        } catch (PersistenceException e) {
            throw new InitiativeBankException(e.getMessage(), e);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<User> consultaUsuarios(String TipoUsuario) throws InitiativeBankException {
        try {
            return userDAO.searchUsers(TipoUsuario);
        } catch (PersistenceException e) {
            throw new InitiativeBankException(e.getMessage(), e);
        } 
    }
    
    
}

