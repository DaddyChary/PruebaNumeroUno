/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author morag
 */
public class Paciente {
    public enum Demarcacion{PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO}
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int run;
    private LocalDate fechaNacimiento;
    private boolean estadoPaciente;

    public Paciente() {
    }

    public Paciente(String nombre, String apellidoPaterno, String apellidoMaterno, int run, LocalDate fechaNacimiento, boolean estadoPaciente) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.run = run;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoPaciente = estadoPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getRun() {
        return run;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isEstadoPaciente() {
        return estadoPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setRun(int run){
        
        //calidacion del rut
        this.run = run;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstadoPaciente(boolean estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", run=" + run + ", fechaNacimiento=" + fechaNacimiento + ", estadoPaciente=" + estadoPaciente + '}';
    }
    
    

}
