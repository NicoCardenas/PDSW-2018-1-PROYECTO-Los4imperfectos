package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.User;

public interface UserDAO {
	
    public User consultaUser(String mail) throws PersistenceException;
    
}
