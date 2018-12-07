package edu.eci.pdsw.entities;

public class User {
    private int id;
    private String full_name;
    private String email;
    private String areaDepartment;
    private Intention intencion;
    private String contrasenia;
    private String tipoUsuario;
    
    public User(int id,String full_name, String email, String areaDepartment, Intention intencion, String contrasenia, String tipoUsuarios) {
        this.id = id;
        this.full_name = full_name;
        this.email = email;
        this.areaDepartment = areaDepartment;
        this.intencion = intencion;
        this.contrasenia=  contrasenia;
        this.tipoUsuario = tipoUsuarios;
    }

    public User() {
    }        

    public int getId(){
        return id;
    }
    
    public void setId(int id1){
        this.id = id1;
    }
    
    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaDepartment() {
        return areaDepartment;
    }

    public void setAreaDepartment(String areaDepartment) {
        this.areaDepartment = areaDepartment;
    }

    public Intention getIntencion() {
        return intencion;
    }

    public void setIntencion(Intention intencion) {
        this.intencion = intencion;
    }
    
        public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String TipoUs) {
        this.tipoUsuario = TipoUs;
    }
    
    public String toString() {
        return "Nombre: " + full_name + ", Correo: " + email + ", Tipo Usuario: " +  tipoUsuario;
    }
}
