package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.User;
import java.util.List;

public interface UserDAO {
	
    public List<User> consultaUsers() throws PersistenceException;
    public User consultaUser(String mail) throws PersistenceException;
    public List<User> searchUsers(String TipoUsuario) throws PersistenceException;
    
}
