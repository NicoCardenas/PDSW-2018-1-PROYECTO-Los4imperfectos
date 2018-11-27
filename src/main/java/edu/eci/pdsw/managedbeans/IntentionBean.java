package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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
    
    public void entrar() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("intencion.xhtml");
    }
    
    public void salir() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("admin.xhtml");
    }

    public String getValSearch() {
        return valSearch;
    }

    public void setValSearch(String valSearch) {
        System.out.println(valSearch);
        this.valSearch = valSearch;
    }
    
    
}