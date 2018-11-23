<<<<<<< HEAD
package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.persistence.PersistenceException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntentionMapper {

    public List<Intention> consultarAll();
    public List<Intention> searchIntention(@Param("palabra") String palabra) throws PersistenceException;

}
=======
package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.persistence.PersistenceException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntentionMapper {

    public List<Intention> consultarAll();
    public Intention searchIntention(@Param("palabra") String palabra) throws PersistenceException;

}
>>>>>>> 10903e5af9319301ce85c168c8e9c5efa2ad3ee7
