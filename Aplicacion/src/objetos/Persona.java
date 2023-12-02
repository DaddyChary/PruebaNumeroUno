/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author DaddyChary
 */
public class Persona {
    
    //Atributos
    private String run;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String genero;
    private String fechaNacimiento;

    //Constuctores

    public Persona(String run, String nombres, String apellidoPaterno, String apellidoMaterno, String genero, String fechaNacimiento) {
        this.run = run;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
        this.run = "";
        this.nombres = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.genero = "";
        this.fechaNacimiento = "";
    }
    
    //Getters & Setters

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodo Para Imprimir

    @Override
    public String toString() {
        return "Persona{" + "run=" + run + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public void imprimir (){
     
        System.out.println("\nDatos Personales");
        System.out.println("\nRun: " + run);
        System.out.println("\nNombres: " + nombres);
        System.out.println("\nApellido Paterno: " + apellidoPaterno);
        System.out.println("\nApellido Materno: " + apellidoMaterno);
        System.out.println("\nGenero: " + genero);
        System.out.println("\nFecha De Nacimiento: " + fechaNacimiento);

    }

}
