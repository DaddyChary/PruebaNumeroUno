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
public class Persona {
    
    private String name;
    private LocalDate fecha_nacimiento;

    public Persona() {
    }

    public Persona(String name, LocalDate fecha_nacimiento) {
        this.name = name;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
    
}
