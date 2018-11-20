package edu.eci.pdsw.entities;

public class Comment {
    private int id;
    private String content;
    private User usuario;
    private Intention intencion;

    public Comment(String content, User usuario, Intention intencion) {
        this.content = content;
        this.usuario = usuario;
        this.intencion = intencion;
    }

    public Comment() {
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Intention getIntencion() {
        return intencion;
    }

    public void setIntencion(Intention intencion) {
        this.intencion = intencion;
    }
    
    
}
