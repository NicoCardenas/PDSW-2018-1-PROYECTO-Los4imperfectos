package edu.eci.pdsw.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Intention implements Serializable{
    
    private int id;
    private String estado;
    private String titulo;
    private String descripcion;
    private Date fechaCreacion;
    private User autor;
    private ArrayList<String> palabrasClave;
    private ArrayList<Comment> comments;
    private String area; 

    public Intention(int id, String estado, String titulo, String descripcion, Date fechaCreacion, ArrayList<Comment> comentarios, ArrayList<String> palabrasClave, User autor,String area) {
        this.id = id;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.palabrasClave = palabrasClave;
        this.comments = comentarios;
        this.autor = autor;
        this.area = area;        
    }

    public Intention() {
        comments = new ArrayList<>();
        palabrasClave = new ArrayList<>();
    }
    
    
    public int getId(){
        return id;
    }
    
   
    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }     

    public User getUsuario_documento() {
        return autor;
    }

    public void setUsuario_documento(User autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        System.out.println("entro una palabra clave");
        this.palabrasClave = palabrasClave;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
            
    public ArrayList<Comment> getComentarios(){
    	return comments;
    }
    public void setComentarios(ArrayList<Comment> comentarios) {
    	this.comments = comentarios;
    }
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Item{" + " id= " + id + ", estado=" + estado + ", titulo=" + titulo + ",descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", palabrasclave=" + palabrasClave+", autor="+autor+",area="+area+"}";
    }
}