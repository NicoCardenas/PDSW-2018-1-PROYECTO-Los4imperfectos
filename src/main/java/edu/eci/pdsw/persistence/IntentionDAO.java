package edu.eci.pdsw.persistence;

import edu.eci.pdsw.entities.Intention;
import java.util.List;

public interface IntentionDAO {
    
    public List<Intention> consultaAll() throws PersistenceException;
    public Intention search() throws PersistenceException;
}
