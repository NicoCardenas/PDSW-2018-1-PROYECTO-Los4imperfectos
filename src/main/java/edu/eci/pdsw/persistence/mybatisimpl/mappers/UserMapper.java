package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.pdsw.entities.User;

public interface UserMapper {

    public List<User> consultarUsuarios();
    public User consultarUsuario(@Param("mail") String mail);
    public List<User> consultarUsuariosTU(@Param("TipoUsuario") String TipoUsuario);
}
