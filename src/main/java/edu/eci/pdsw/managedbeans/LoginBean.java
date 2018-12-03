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
        FacesContext context = FacesContext.getCurrentInstance();
        User usuarioTemp = new User();
        try {
            //System.out.println("entro: ");
            usuarioTemp = initiativeBankServices.consultarUsuario(mail);
            //System.out.println(usuarioTemp.toString());
            if(usuarioTemp.getTipoUsuario().equals("Administrador")){
                if (password.equals(usuarioTemp.getContrasenia())) {
                    context.getExternalContext().getSessionMap().put("user", usuarioTemp.getTipoUsuario());
                    context.getExternalContext().redirect("admin.xhtml");
                    
                    System.out.println(FacesContext.getCurrentInstance().getClass());
                } else {
                    context.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Contraseña incorrecta o usuario incorrecto"));                    
                }
            }else{
                if (password.equals(usuarioTemp.getContrasenia())) {
                    context.getExternalContext().redirect("intencion.xhtml");
                } else {
                    context.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Contraseña incorrecta o usuario incorrecto"));                  
                }
            }
            
        }catch (InitiativeBankException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, ex.getMessage(), "Cree un usuario."));            
        }
    }

    
    public void logout() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
     	context.getExternalContext().invalidateSession();
        try {
            context.getExternalContext().redirect("login.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }  
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
