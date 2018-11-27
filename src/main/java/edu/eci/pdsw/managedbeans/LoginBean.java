package edu.eci.pdsw.managedbeans;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@SuppressWarnings("deprecation")
@ManagedBean(name = "loginBean")
@SessionScoped  
public class LoginBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;

    private String mail;
    private String password;
    private User usuario;

    public LoginBean() {
        mail = null;
        password = null;
    }
    
    public void autenticacion() throws IOException, InitiativeBankException {
        User usuarioTemp = new User();
        try {
            //System.out.println("entro: ");
            usuarioTemp = initiativeBankServices.consultarUsuario(mail);
            //System.out.println(usuarioTemp.toString());
            setUsuario(usuarioTemp);
            if(usuarioTemp.getTipoUsuario().equals("Administrador")){
                if (password.equals(usuarioTemp.getContrasenia())) {
                    FacesContext.getCurrentInstance().getExternalContext().redirect("admin.xhtml");
                } else {
                    FacesContext.getCurrentInstance().addMessage(mail, new  FacesMessage(FacesMessage.SEVERITY_ERROR, mail, mail));
                    //FacesContext.getCurrentInstance().addMessage("Contraseña incorrecta", new FacesMessage("Contraseña incorrecta o usuario incorrecto"));
                    //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Contraseña incorrecto.", "Ingrese la contraseña de nuevo."));
                }
            }else{
                if (password.equals(usuarioTemp.getContrasenia())) {
                    FacesContext.getCurrentInstance().getExternalContext().redirect("intencion.xhtml?login="+usuario.getId());
                } else {
                    FacesContext.getCurrentInstance().addMessage(mail, new  FacesMessage(FacesMessage.SEVERITY_ERROR, mail, mail));
                    //FacesContext.getCurrentInstance().addMessage("Contraseña incorrecta", new FacesMessage("Contraseña incorrecta o usuario incorrecto"));
                    //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Contraseña incorrecto.", "Ingrese la contraseña de nuevo."));
                }
            }
            
        }catch (InitiativeBankException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, ex.getMessage(), "Cree un usuario."));            
        }
    }
    
    public void logout() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        
    }
    
    public void print(){
        System.out.println("mail ingresado: "+mail);
        System.out.println("contraseña ingresado: "+password);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        System.out.println(mail);
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }        
     
}
