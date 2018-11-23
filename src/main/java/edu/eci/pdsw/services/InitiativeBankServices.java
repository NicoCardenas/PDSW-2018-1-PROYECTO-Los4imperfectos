<<<<<<< HEAD
package edu.eci.pdsw.services;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InitiativeBankServices {
    public User consultarUsuario(String mail) throws InitiativeBankException;
    public List<Intention> consultaIntencion() throws InitiativeBankException;
    public List<Intention> consultaIntencion(@Param("palabra") String palabra) throws InitiativeBankException;
}
=======
package edu.eci.pdsw.services;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InitiativeBankServices {
    public User consultarUsuario(String mail) throws InitiativeBankException;
    public List<Intention> consultaIntencion() throws InitiativeBankException;
    public Intention consultaIntencion(@Param("palabra") String palabra) throws InitiativeBankException;
}
>>>>>>> 10903e5af9319301ce85c168c8e9c5efa2ad3ee7
