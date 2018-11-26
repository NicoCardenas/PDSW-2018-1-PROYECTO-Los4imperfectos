package edu.eci.pdsw.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;

import edu.eci.pdsw.persistence.IntentionDAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.IntentionMapper;
import java.util.List;


public class MyBatisIntentionDAO implements IntentionDAO{

    @Inject
    IntentionMapper intentionMapper;
	

    @Override
    public List<Intention> consultaAll() throws PersistenceException {
        try {
            List<Intention> listaPrueba = intentionMapper.consultarAll();
            System.out.println(listaPrueba);
            return intentionMapper.consultarAll();
            
        } catch (Exception e) {
            throw new PersistenceException("No existen intenciones", e);
        }              
    }

    @Override
    public List<Intention> searchIntention(String palabra) throws PersistenceException {
        try {
            return intentionMapper.searchIntention(palabra);
        } catch (Exception e) {
            throw new PersistenceException("No existe una intencion con "+ palabra +" como palabra clave", e);
        }
    }
}
