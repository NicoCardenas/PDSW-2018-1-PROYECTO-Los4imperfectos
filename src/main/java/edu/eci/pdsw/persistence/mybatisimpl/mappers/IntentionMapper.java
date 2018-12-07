package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.persistence.PersistenceException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntentionMapper {

    public List<Intention> consultarAll();
    public void crearIntencion(@Param("idUser") int idUser, @Param("state") String state, @Param("content") String content, @Param("title") String title) throws PersistenceException;
    public List<Intention> searchIntention(@Param("palabra") String palabra) throws PersistenceException;
    public List<String> getTags() throws PersistenceException;
    public int consultarUltimaIntencion(@Param("idUsuario") int idUsuario, @Param("titulo") String titulo) throws PersistenceException;
    public int consultarIdPalabra(@Param("palabraClave") String palabraClave) throws PersistenceException;
    public void crearIntencionPalabra(@Param("idIntencion") int idIntencion, @Param("idPalabra") int idPalabra) throws PersistenceException;
}
