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
    
    
}
