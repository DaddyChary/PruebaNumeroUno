/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Persona;

/**
 *
 * @author morag
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
        
        while (true) {
            int op = menuPrincipal();
            
            switch (op) {
                case 1:
                    Persona persona = crearPersona();
                    listaDePersonas.add(persona);
                    System.out.println("La persona creada es:");
                    System.out.println(persona);
                    break;
                case 2:
                    System.out.println("2- Eliminar persona de la lista");
                    break;
                case 3:
                    System.out.println("3- Modificar persona de la lista");
                    break;
                case 4:
                    for (int i = 0; i < listaDePersonas.size(); i++) {
                        System.out.println(listaDePersonas.get(i));
                    }
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }
        }

    }

    private static int menuPrincipal() {
        System.out.println("Menu");
        System.out.println("1- Crear Persona");
        System.out.println("2- Eliminar persona de la lista");
        System.out.println("3- Modificar persona de la lista");
        System.out.println("4- Ver lista de personas");
        System.out.println("0- Salir");
        Scanner input = new Scanner(System.in);
        System.out.println("[*] Ingrese opcion");
        return Integer.parseInt(input.next());
    }

    public static Persona crearPersona() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese su nombre: ");
        String nombre = lectura.next();
        System.out.println("Fecha de nacimiento: ");
        System.out.println("Ingrese el año: ");
        int year = Integer.parseInt(lectura.next());
        System.out.println("Ingrese el mes: ");
        int month = Integer.parseInt(lectura.next());
        System.out.println("Ingrese el dia del mes: ");
        int day = Integer.parseInt(lectura.next());

        Persona persona = new Persona(nombre, LocalDate.of(year, month, day));
        return persona;
    }
}
