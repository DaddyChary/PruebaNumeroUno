/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicasantosalud;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Persona;
import java.util.Scanner;

/**
 *
 * @author DaddyChary
 */
public class ClinicaSantoSalud {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Persona> datosPersonales = new ArrayList<>();
        
        Persona persona = TomaDatosPersonales();
        datosPersonales.add(persona);
    }

    public static Persona TomaDatosPersonales() {
        Persona persona = new Persona();
        System.out.println("|======================================|");
        System.out.print("|Ingrese el Nombre: ");
        persona.setNombre(input.next());

        System.out.print("|Ingrese el Apellido Paterno: ");
        persona.setApellidoPaterno(input.next());

        System.out.print("|Ingrese el Apellido Materno: ");
        persona.setApellidoMaterno(input.next());

        System.out.print("|Ingrese el Rut: ");
        persona.setRut(input.next());

        System.out.println("|======================================|");
        System.out.println("|Ingrese la Fecha De Nacimiento");
        System.out.print("|Ingrese el año: ");
        int year = Integer.parseInt(input.next());
        System.out.print("|Ingrese el mes: ");
        int month = Integer.parseInt(input.next());
        System.out.print("|Ingrese el dia del mes: ");
        int day = Integer.parseInt(input.next());
        persona.setFechaDeNacimiento(LocalDate.of(year, month, day));

        System.out.print("|Ingrese el Numero de telefono: ");
        persona.setNumeroTelefono(input.next());
        
        return persona;
    }
    
    
}
