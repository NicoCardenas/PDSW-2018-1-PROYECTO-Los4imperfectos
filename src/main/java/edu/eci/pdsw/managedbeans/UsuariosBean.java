package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import edu.eci.pdsw.services.util.LoginSession;
import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuariosBean")
@SessionScoped

public class UsuariosBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;
    
    private String valSearch;
    private HttpSession httpSession;

    public UsuariosBean() {
        
    }  
    
    public User getUser() throws IOException{
        httpSession = LoginSession.getSession();
        User tempUser = (User) httpSession.getAttribute("usuario");
        if (tempUser == null) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        }
        return tempUser;
    }
    
    public List<User> getConsultAll() throws InitiativeBankException{
        try {
            return initiativeBankServices.consultarUsuarios();
        } catch (InitiativeBankException e) {
            throw e;
        }
    }
    
    public void entrar() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("ListaUsuarios.xhtml");
    }
    
      public void redirectS() throws IOException{
        System.out.println("entro search");
        FacesContext.getCurrentInstance().getExternalContext().redirect("SearchUser.xhtml");
    }
    
    public void salir() throws IOException{
        httpSession = LoginSession.getSession();
        User tempUser = (User)httpSession.getAttribute("usuario");
        if(tempUser.getTipoUsuario().equals("Administrador")){
           FacesContext.getCurrentInstance().getExternalContext().redirect("admin.xhtml"); 
        }else{
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }  
    }
        
    public List<User> getFinds() throws InitiativeBankException {
        try {
            return initiativeBankServices.consultaUsuarios(valSearch);
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