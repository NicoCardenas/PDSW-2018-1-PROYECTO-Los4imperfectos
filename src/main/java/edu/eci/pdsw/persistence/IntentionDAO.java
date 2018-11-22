package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Intention;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionDAO {
    
    public List<Intention> consultaAll() throws PersistenceException;
    public Intention search(@Param("palabra") String palabra) throws PersistenceException;
}
