package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.persistence.PersistenceException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntentionMapper {

    public List<Intention> consultarAll();
    public Intention searchIntention() throws PersistenceException;

}
