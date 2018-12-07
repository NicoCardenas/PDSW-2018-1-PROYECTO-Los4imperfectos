package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Intention;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionDAO {
    
    public List<Intention> consultaAll() throws PersistenceException;
    public List<Intention> searchIntention(@Param("palabra") String palabra) throws PersistenceException;
    public void crearIntencion(@Param("idUser") int idUser, @Param("state") String state, @Param("content") String content, @Param("title") String title) throws PersistenceException;
    //public void crearIntencionTags(@Param ("tagId") int tagId, @Param ("tagId") int intencionId) throws PersistenceException;
    public List<String> getTags() throws PersistenceException;
    public int consultarUltimaIntencion(@Param("idUsuario") int idUsuario, @Param("titulo") String titulo) throws PersistenceException;
    public int consultarIdPalabra(@Param("palabraClave") String palabraClave) throws PersistenceException;
    public void crearIntencionPalabra(@Param("idIntencion") int idIntencion, @Param("idPalabra") int idPalabra) throws PersistenceException;
}

