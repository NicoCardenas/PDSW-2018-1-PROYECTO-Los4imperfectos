<<<<<<< HEAD
package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Intention;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionDAO {
    
    public List<Intention> consultaAll() throws PersistenceException;
    public List<Intention> search(@Param("palabra") String palabra) throws PersistenceException;
}
=======
package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Intention;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionDAO {
    
    public List<Intention> consultaAll() throws PersistenceException;
    public Intention search(@Param("palabra") String palabra) throws PersistenceException;
}
>>>>>>> 10903e5af9319301ce85c168c8e9c5efa2ad3ee7
