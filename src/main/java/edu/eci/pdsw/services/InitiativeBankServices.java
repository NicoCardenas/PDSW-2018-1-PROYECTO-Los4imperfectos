package edu.eci.pdsw.services;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InitiativeBankServices {
    public void crearIntencion(int idUser, String state, String content, String title, String[] tags) throws InitiativeBankException;
    public List<User> consultarUsuarios() throws InitiativeBankException;
    public User consultarUsuario(String mail) throws InitiativeBankException;
    public List<Intention> consultaIntencion() throws InitiativeBankException;
    public List<Intention> consultaIntencion(@Param("palabra") String palabra) throws InitiativeBankException;
    public List<User> consultaUsuarios(@Param("TipoUsuario") String TipoUsuario) throws InitiativeBankException;
    public List<String> consultTags() throws InitiativeBankException;
}

