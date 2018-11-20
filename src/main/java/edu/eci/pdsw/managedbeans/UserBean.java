package edu.eci.pdsw.managedbeans;

import edu.eci.pdsw.services.InitiativeBankException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.services.InitiativeBankServices;

@SuppressWarnings("deprecation")
@SessionScoped
@ManagedBean(name = "userBean")

public class UserBean extends BasePageBean {	
    
    private String mail;
    private String password;
    
    @Inject
    private InitiativeBankServices initiativeBankServices;

    public UserBean() {
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
    
}
