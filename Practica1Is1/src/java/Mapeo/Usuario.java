package Mapeo;
// Generated 8/03/2016 05:51:11 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String app;
     private String mail;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String app, String mail) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.app = app;
       this.mail = mail;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApp() {
        return this.app;
    }
    
    public void setApp(String app) {
        this.app = app;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }




}


