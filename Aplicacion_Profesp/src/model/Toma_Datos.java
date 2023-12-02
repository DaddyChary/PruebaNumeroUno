/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author DaddyChary
 * 
 */

//Datos definidos

public class Toma_Datos {
   
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int run;
    private LocalDate fechaNacimiento;
    private boolean estadoPaciente;
    
    //Contructor Vacio 
    
    public Toma_Datos() {
    }

    //Constructor con todas las opciones seleccionadas
    
    public Toma_Datos(String nombre, String apellidoPaterno, String apellidoMaterno, int run, LocalDate fechaNacimiento, boolean estadoPaciente) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.run = run;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoPaciente = estadoPaciente;
    }

    //Getters and Setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(boolean estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }
    
    //ToStrings
    
    @Override
    public String toString() {
        return String.format("|"+nombre +"         "+ apellidoPaterno +" "+ apellidoMaterno +"           "+ run +"       "+ fechaNacimiento +"            "+ estadoPaciente);
    }  
}
