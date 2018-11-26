package edu.eci.pdsw.persistence.mybatisimpl;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.UserMapper;
import java.util.List;


public class MyBatisUserDAO implements UserDAO {

    @Inject
    UserMapper userMapper;

    @Override
    public List<User> consultaUsers() throws PersistenceException{
        try {
            List<User> temp = userMapper.consultarUsuarios();
            if (temp == null){
                throw new PersistenceException("No existe ningun usuario");
            }
            return temp;                
        } catch (Exception e) {
            throw new PersistenceException("No existe ningun usuario", e);

        }
    }
    
    
    @Override
    public User consultaUser(String mail) throws PersistenceException{
        try {
            System.out.println("llego a dao");
            User temp = userMapper.consultarUsuario(mail);
            System.out.println(temp);
            if (temp == null){
                throw new PersistenceException("No existe ningun usuario con el correo: " + mail);
            }
            return temp;                
        } catch (Exception e) {
            throw new PersistenceException("No existe ningun usuario con el correo: " + mail, e);

        }
    }
}
