<<<<<<< HEAD
package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "intentionBean")
@SessionScoped

public class IntentionBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;
    
    private String valSearch;

    public IntentionBean() {
        
    }       
    
    public List<Intention> getConsultAll() throws InitiativeBankException{
        try {
            return initiativeBankServices.consultaIntencion();
        } catch (InitiativeBankException e) {
            throw e;
        }
    }
        
    public List<Intention> getFinds() throws InitiativeBankException {
        try {
            return initiativeBankServices.consultaIntencion(valSearch);
        } catch (InitiativeBankException e) {
            throw e;
        }
    }

    public String getValSearch() {
        return valSearch;
    }

    public void setValSearch(String valSearch) {
        System.out.println(valSearch);
        this.valSearch = valSearch;
    }
    
    
}
=======
package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "intentionBean")
@SessionScoped

public class IntentionBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;
    
    private String searchVal;

    public IntentionBean() {
        
    }       
    
    public List<Intention> getConsultAll() throws InitiativeBankException{
        try {
            return initiativeBankServices.consultaIntencion();
        } catch (InitiativeBankException e) {
            throw e;
        }
    }
    
    public Intention getSearch() throws InitiativeBankException {
        try {
            return initiativeBankServices.consultaIntencion(searchVal);
        } catch (InitiativeBankException e) {
            throw e;
        }
    }

    public String getSearchVal() {
        return searchVal;
    }

    public void setSearchVal(String searchVal) {
        System.out.println("Palabra a buscar: "+searchVal);
        this.searchVal = searchVal;
    }        
}
>>>>>>> 10903e5af9319301ce85c168c8e9c5efa2ad3ee7
