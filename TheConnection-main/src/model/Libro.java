
package model;

import java.time.LocalDate;

public class Libro {
    private String nombre;
    private String autor;
    private LocalDate fechaPublicacion;
    private String genero;
    private String numeroDePaginas;

    public Libro() {
    }

    public Libro(String nombre, String autor, LocalDate fechaPublicacion, String genero, String numeroDePaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", genero=" + genero + ", numeroDePaginas=" + numeroDePaginas + '}';
    }

    
}
