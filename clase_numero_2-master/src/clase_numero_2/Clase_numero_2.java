/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_numero_2;

import java.time.LocalDate;
import java.time.Period;
import model.Persona;

/**
 *
 * @author morag
 */
public class Clase_numero_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona objetoPersona = new Persona("maximiliano", LocalDate.of(1994, 1, 25));
        
        Period edad = objetoPersona.getEdad();
        
        System.out.println("Tu edad es  : "+ edad.getYears()+ " años");
        System.out.println(" meses      : " + edad.getMonths());
        System.out.println(" dias       : " + edad.getDays());
    }
}
