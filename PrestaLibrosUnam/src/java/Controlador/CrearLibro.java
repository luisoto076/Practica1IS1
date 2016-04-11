package Controlador;

import Modelo.Libro;
import Modelo.LibroDAO;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class CrearLibro {
    
    public String nombre;
    public String editorial;
    public String autor;
    public String descripcion;
    public String genero;
    public String pais;
    public String foto;
    public int idLibro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
   
  
    public void crearLibro() {
        LibroDAO ld = new LibroDAO();
        Libro libro = new Libro(this.getNombre(),this.getEditorial(),this.getAutor(),
                    this.descripcion,this.getGenero(),this.getPais(),this.getFoto(),this.getIdLibro());
        ld.save(libro);
    }

}