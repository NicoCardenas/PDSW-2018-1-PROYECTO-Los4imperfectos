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

