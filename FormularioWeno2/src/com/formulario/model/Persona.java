/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.formulario.model;

import java.time.LocalDate;
import javax.print.DocFlavor;

/**
 *
 * @author Laboratorio 2023
 */
public class Persona {
    
    private String rut;
    private LocalDate fechanacimiento;
    private String nombre;

    public Persona() {
    }

    public Persona(String rut, LocalDate fechanacimiento, String nombre) {
        this.rut = rut;
        this.fechanacimiento = fechanacimiento;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", fechanacimiento=" + fechanacimiento + ", nombre=" + nombre + '}';
    }
    
    
}
