/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ap.model;

import java.time.LocalDate;

/**
 *
 * @author DaddyChary
 */
public class Asistencia {
    
    private String Rut;
    private LocalDate fecha;
    private String sala;

    public Asistencia() {
    }

    public Asistencia(String Rut, LocalDate fecha, String sala) {
        this.Rut = Rut;
        this.fecha = fecha;
        this.sala = sala;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Rut=" + Rut + ", fecha=" + fecha + ", sala=" + sala + '}';
    }
    
    
    
    
}
