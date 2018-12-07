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
            return intentionMapper.consultarAll();
            
        } catch (Exception e) {
            throw new PersistenceException("No existen intenciones", e);
        }              
    }

    @Override
    public List<Intention> searchIntention(String palabra) throws PersistenceException {
        try {            
            return intentionMapper.searchIntention("%"+palabra+"%");
        } catch (PersistenceException e) {
            throw new PersistenceException("No existe una intencion con "+ palabra +" como palabra clave", e);
        }
    }

    @Override
    public void crearIntencion(int idUser, String state, String content, String title) throws PersistenceException {
        try {
            System.out.println("Entro mybatis");
            intentionMapper.crearIntencion(idUser, state, content, title);
        } catch (PersistenceException e) {
            throw new PersistenceException("No existe una intencion con como palabra clave", e);
        }
    }

    @Override
    public List<String> getTags() throws PersistenceException{
        try {
            return intentionMapper.getTags();
        } catch (PersistenceException e) {
            throw new PersistenceException("No existe una intencion con como palabra clave", e);
        }
    }

    @Override
    public int consultarUltimaIntencion(int idUsuario, String titulo) throws PersistenceException {
        try {
            return intentionMapper.consultarUltimaIntencion(idUsuario, "%"+titulo+"%");
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage(), e);
        }
    }

    @Override
    public int consultarIdPalabra(String palabraClave) throws PersistenceException {
        try {
            return intentionMapper.consultarIdPalabra("%"+palabraClave+"%");
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage(), e);
        }
    }
    @Override
    public void crearIntencionPalabra(int idIntencion, int idPalabra) throws PersistenceException {
        try {
            intentionMapper.crearIntencionPalabra(idIntencion, idPalabra);
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage(), e);
        }
    }
}
