package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.io.IOException;
import java.sql.Date;
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
    private String state;
    private String content;
    private Date date_of_creation;
    private String title;
    private LoginBean loginBean;    

    public IntentionBean() {
        
    }       
    
    public List<Intention> getConsultAll() throws InitiativeBankException{
        try {
            return initiativeBankServices.consultaIntencion();
        } catch (InitiativeBankException e) {
            throw e;
        }
    }
        
    
    public void crearIntencion(){
        try {
            System.out.println("entro insert");
            User tempUser = loginBean.getUsuario();
            System.out.println("usuario: " + tempUser);
            int idUser = tempUser.getId();
            System.out.println("usuario: " + tempUser);
            initiativeBankServices.crearIntencion(idUser, state, content, title);
        } catch (InitiativeBankException e) {
             //realizar envio de error o algo 
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
    
    public void redirectS() throws IOException{
        System.out.println("entro search");
        FacesContext.getCurrentInstance().getExternalContext().redirect("search.xhtml");
    }
    
    public void redirectIn() throws IOException{
        System.out.println("entro insert");
        FacesContext.getCurrentInstance().getExternalContext().redirect("insert.xhtml");
    }

    public String getValSearch() {
        return valSearch;
    }

    public void setValSearch(String valSearch) {
        //System.out.println(valSearch);
        this.valSearch = valSearch;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
          
    public Date getDate_of_creation() {
        return date_of_creation;
    }

    public void setDate_of_creation(Date date_of_creation) {
        this.date_of_creation = date_of_creation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}