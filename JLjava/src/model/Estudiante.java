// CLASE ESTUDIANTE
package model;

// Definición Atributos
public class Estudiante {
    private String rut;
    private String fechaAsistencia;
    private String sala;

    // Creación de Constructores
    public Estudiante() {
    }

    public Estudiante(String rut, String fechaAsistencia, String sala) {
        this.rut = rut;
        this.fechaAsistencia = fechaAsistencia;
        this.sala = sala;
    }

    public String getRut() {
        return rut;
    }

    public String getFechaAsistencia() {
        return fechaAsistencia;
    }

    public String getSala() {
        return sala;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFechaAsistencia(String fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "rut=" + rut + ", fechaAsistencia=" + fechaAsistencia + ", sala=" + sala + '}';
    }
    
    
}
