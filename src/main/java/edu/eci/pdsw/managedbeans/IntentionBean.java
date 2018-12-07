package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import edu.eci.pdsw.services.util.LoginSession;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

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
    private String[] options;
    private List<String> selected;
    private HttpSession httpSession;

    public IntentionBean() throws IOException {
        httpSession = LoginSession.getSession();
        User tempUser = (User) httpSession.getAttribute("usuario");
        if (tempUser == null) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        }
    }
    
    public User getUser() throws IOException{
        httpSession = LoginSession.getSession();
        User tempUser = (User) httpSession.getAttribute("usuario");
        if (tempUser == null) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        }
        return tempUser;
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
            httpSession = LoginSession.getSession();
            User tempUser = (User) httpSession.getAttribute("usuario");            
            int idUser = tempUser.getId();
            initiativeBankServices.crearIntencion(idUser, "En espera de revisión", content, title, options);
        } catch (InitiativeBankException e) {
            System.out.println(e);
        }
    }
    
    public List<String> AllTags(){
        try {
            return initiativeBankServices.consultTags();            
        } catch (InitiativeBankException e) {
            System.out.println(e);
            return null;
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
        HttpSession sesion = LoginSession.getSession();
        User tempUser = (User)sesion.getAttribute("usuario");
        if(tempUser.getTipoUsuario().equals("Administrador")){
           FacesContext.getCurrentInstance().getExternalContext().redirect("admin.xhtml"); 
        }else{
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        }
        sesion.invalidate();
        sesion.removeAttribute("usuario");
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

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public List<String> getSelected() {
        selected = AllTags();
        return selected;
    }

    public void setSelected(List<String> selected) {
        this.selected = selected;
    }
    
    
    
}