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
public class Doctor extends Persona {

    private String especialidadDoctor;
    private String sexo;

    public Doctor() {
    }

    public Doctor(String especialidadDoctor, String sexo, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaDeNacimiento, String rut, String numeroTelefono) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaDeNacimiento, rut, numeroTelefono);
        this.especialidadDoctor = especialidadDoctor;
        this.sexo = sexo;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n"
                + "Apellido Paterno: " + getApellidoPaterno() + "\n"
                + "Apellido Materno: " + getApellidoMaterno() + "\n"
                + "Fecha de Nacimiento: " + getFechaDeNacimiento() + "\n"
                + "RUT: " + getRut() + "\n"
                + "Número de Teléfono: " + getNumeroTelefono() + "\n"
                + "Especialidad Doctor: " + especialidadDoctor + "\n"
                + "Sexo: " + sexo;
    }
}
