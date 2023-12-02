/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion_profe;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Toma_Datos;
import java.time.LocalDate;
import utilidad.ConsoleUtil;

/**
 *
 * @author DaddyChary
 */
public class Aplicacion_Profe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here

        ArrayList<Toma_Datos> listaDeDatos = new ArrayList<Toma_Datos>();
        
        //Bucle para las opciones de menu
        
        while (true) {
            int op = menuPrincipal();

            switch (op) {
                case 1:
                    ConsoleUtil.limpiarPantallaDelay();
                    Toma_Datos toma_Datos = crearPaciente();
                    listaDeDatos.add(toma_Datos);
                    ConsoleUtil.limpiarPantallaTecla();
                    break;
                case 2:
                    ConsoleUtil.limpiarPantallaDelay();
                    menuOpcionDos(listaDeDatos);
                    ConsoleUtil.limpiarPantallaTecla();
                    break;
                case 3:
                    ConsoleUtil.limpiarPantallaDelay();
                    menuOpcionTres(listaDeDatos);
                    ConsoleUtil.limpiarPantallaTecla();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("La opcion no es valida");           
            }
        }
    }

    //Menu para que lo vea el usuario y eliga una opcion
    
    public static int menuPrincipal() throws AWTException {
        System.out.println("|======================================|");
        System.out.println("|-               *Menu*               -|");
        System.out.println("|======================================|");
        System.out.println("|1-. *Crear Paciente*                  |");
        System.out.println("|2-. *Eliminar Paciente*               |");
        System.out.println("|3-. *Ver Lista De Pacientes*          |");
        System.out.println("|4-. *Salir*                           |");
        System.out.println("|======================================|");
        Scanner input = new Scanner(System.in);
        System.out.print("[*] Ingrese Una Opcion: ");
        return Integer.parseInt(input.next());
    }
    
    //Menu para eliminar pacientes
    
    public static void menuOpcionDos(ArrayList<Toma_Datos> listaDeDatos) {
        System.out.println("|==========================================================|");
        System.out.println("|-                  Eliminar Paciente                     -|");
        System.out.println("|==========================================================|");
        System.out.print("| Ingrese el rut del paciente que desea eliminar: ");
        Scanner lector = new Scanner(System.in);
        int run = Integer.parseInt(lector.next());
        boolean encontrado = false;
        for (int contador = 0; contador < listaDeDatos.size(); contador++) {
            if (listaDeDatos.get(contador).getRun() == run) {  
                encontrado = true;
                listaDeDatos.remove(contador);
                System.out.println("|==========================================================|");
                System.out.println("|- El Paciente " + run + " fue eliminado con exito         -|");
                System.out.println("|==========================================================|");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("|==========================================================|");
            System.out.println("|- No se ha encontrado el rut del paciente " + run + "     -|");
            System.out.println("|==========================================================|");
        }
    }

    //Pide los datos para guardar los pacientes
    
    public static Toma_Datos crearPaciente() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("|======================================|");
        System.out.print("|Ingrese el Nombre: ");
        String nombre = lectura.next();
        System.out.print("|Ingrese el Apellido Paterno: ");
        String apellidoPaterno = lectura.next();
        System.out.print("|Ingrese el Apellido Materno: ");
        String apellidoMaterno = lectura.next();
        System.out.print("|Ingrese el Rut: ");
        int run = Integer.parseInt(lectura.next());
        System.out.println("|======================================|");
        System.out.println("|Ingrese la Fecha De Nacimiento");
        System.out.print("|Ingrese el año: ");
        int year = Integer.parseInt(lectura.next());
        System.out.print("|Ingrese el mes: ");
        int month = Integer.parseInt(lectura.next());
        System.out.print("|Ingrese el dia del mes: ");
        int day = Integer.parseInt(lectura.next());
        System.out.println("|======================================|");
        System.out.println("|Cual es el estado del paciente        |");
        System.out.println("|1-. Grave                             |");
        System.out.println("|2-. Normal                            |");
        System.out.println("|======================================|");
        System.out.print("[*] Ingrese Una Opcion: ");
        int estadoPaciente = Integer.parseInt(lectura.next());
        boolean estado = validarEstado(estadoPaciente);
        System.out.println("El paciente fue agendado con exito ");
        Toma_Datos toma_Datos = new Toma_Datos(nombre, apellidoPaterno, apellidoMaterno, run, LocalDate.of(year, month, day), estado);

        return toma_Datos;
    }

    //Interfaz para visualizar mejor la lista de pacientes 
    
    public static void menuOpcionTres(ArrayList<Toma_Datos> listaDeDatos) {
        System.out.println("|============================================================================================|");
        System.out.println("|- Nombre    -|- Apellidos           -|- Rut     -|- Fecha de Nacimiento -|- Paciente Grave -|");
        System.out.println("|============================================================================================|");
        for  (int i  = 0; i < listaDeDatos.size(); i++){
        System.out.println(listaDeDatos.get(i));
        }
    }    
    
    //Validar estado
    
    public static boolean validarEstado(int status) {
        boolean resultado;
        if (status == 1) {
            resultado = true;
        } else {
            resultado = false;
            
        }
        return resultado;
    }
}   

