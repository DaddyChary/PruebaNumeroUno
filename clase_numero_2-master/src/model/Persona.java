/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author morag
 */
public class Persona {
    
    private String name;
    private LocalDate birthday;

    public Persona() {
    }

    public Persona(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        
        String persona = 
            "+----------+---------------------+\n"+
            "|  Nombre  | Fecha de nacimiento |\n"+
            "+----------+---------------------+\n"+
            "+ "+this.name+"+"+this.birthday+"|\n"+
            "+--------------------------------+\n";
        
        return persona;
    }
    
    public Period getEdad(){
        /* 
            2023 08 21
            2023 07 31
            1994 01 25
        _______________
              29  6  6 
        */
        
        /*LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = this.birthday;
        Period edad = Period.between(nacimiento, hoy);
        return edad;*/
        
        return Period.between(this.birthday, LocalDate.now());
        
    }
}
