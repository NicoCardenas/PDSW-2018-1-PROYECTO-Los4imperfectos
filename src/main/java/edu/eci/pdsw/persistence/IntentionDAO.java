package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Intention;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionDAO {
    
    public List<Intention> consultaAll() throws PersistenceException;
    public List<Intention> searchIntention(@Param("palabra") String palabra) throws PersistenceException;
    public void crearIntencion(@Param("idUser") int idUser, @Param("state") String state, @Param("content") String content, @Param("title") String title) throws PersistenceException;
    public List<String> getTags() throws PersistenceException;
}

