package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuariosBean")
@SessionScoped

public class UsuariosBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;
    
    private String valSearch;

    public UsuariosBean() {
        
    }       
    
    public List<User> getConsultAll() throws InitiativeBankException{
        try {
            return initiativeBankServices.consultarUsuarios();
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