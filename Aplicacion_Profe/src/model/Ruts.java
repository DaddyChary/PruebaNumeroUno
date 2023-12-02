/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author DaddyChary
 */
public class Ruts extends Toma_Datos {

    private String rutVerificado;

    public Ruts() {
    }

    public Ruts(String rutVerificado, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, boolean estadoPaciente) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, estadoPaciente);
        this.rutVerificado = rutVerificado;
    }

    public String getRutVerificado() {
        return rutVerificado;
    }

    public void setRutVerificado(String rutVerificado) {
        this.rutVerificado = rutVerificado;
    }

    @Override
    public String toString() {
        return String.format("|" + this.getNombre() + "         " + this.getApellidoPaterno() + " " + this.getApellidoMaterno() + "           " + rutVerificado + "           " + this.getFechaNacimiento() + "             " + this.isEstadoPaciente());
    }

    public int getRut() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
