package Mapeo;
// Generated 15/03/2016 04:46:09 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String apellidos;
     private String correo;
     private Date FNacimiento;
     private Set logins = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Usuario(int idUsuario, String nombre, String apellidos, String correo, Date FNacimiento, Set logins) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.correo = correo;
       this.FNacimiento = FNacimiento;
       this.logins = logins;
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
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFNacimiento() {
        return this.FNacimiento;
    }
    
    public void setFNacimiento(Date FNacimiento) {
        this.FNacimiento = FNacimiento;
    }
    public Set getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set logins) {
        this.logins = logins;
    }




}


