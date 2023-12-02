/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author DaddyChary
 */
public class Paciente extends Persona{
    private String estadoPaciente;
    private boolean gravedadPaciente;
    private LocalTime horaIngreso;

    public Paciente() {
    }

    public Paciente(String estadoPaciente, boolean gravedadPaciente, LocalTime horaIngreso, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaDeNacimiento, String rut, String numeroTelefono) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaDeNacimiento, rut, numeroTelefono);
        this.estadoPaciente = estadoPaciente;
        this.gravedadPaciente = gravedadPaciente;
        this.horaIngreso = horaIngreso;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public boolean isGravedadPaciente() {
        return gravedadPaciente;
    }

    public void setGravedadPaciente(boolean gravedadPaciente) {
        this.gravedadPaciente = gravedadPaciente;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
    
    @Override
public String toString() {
    return "Nombre: " + getNombre() + "\n" +
           "Apellido Paterno: " + getApellidoPaterno() + "\n" +
           "Apellido Materno: " + getApellidoMaterno() + "\n" +
           "Fecha de Nacimiento: " + getFechaDeNacimiento() + "\n" +
           "RUT: " + getRut() + "\n" +
           "Número de Teléfono: " + getNumeroTelefono() + "\n" +
           "Estado del Paciente: " + estadoPaciente + "\n" +
           "Gravedad del Paciente: " + (gravedadPaciente ? "Grave" : "No Grave") + "\n" +
           "Hora de Ingreso: " + horaIngreso;
    }   
}
