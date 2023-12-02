/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion_profe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;
import model.Toma_Datos;
import java.time.LocalDate;
import cotrolers.Menu;
import model.Opcion;
import model.Paciente;

/**
 *
 * @author DaddyChary
 */
public class Aplicacion_Profe {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Inicializacion de variables o componentes o objetos GLOBALES
        // -> inicialidar los objetos que corresponden a ejecucion del codigo
        Menu menu = new Menu();
        ArrayList<Paciente> listaDePacientes = new ArrayList<>();

        // Recopilacion de datos generales
        menu.addOpcion(new Opcion(1, "Crear Paciente"));
        menu.addOpcion(new Opcion(2, "Eliminar Paciente"));
        menu.addOpcion(new Opcion(3, "Ver Paciente"));
        menu.addOpcion(new Opcion(4, "Actualizar Paciente"));
        menu.addOpcion(new Opcion(5, "Lista de Pacientes"));
        menu.addOpcion(new Opcion(6, "Salir"));

        // Funcionalidad del sistema
        //Bucle para las opciones de menu
        while (true) {
            menu.imprimirMenu();
            System.out.print("[*] Ingrese Una Opcion: ");
            int op = Integer.parseInt(input.next());

            switch (op) {
                case 1:
                    System.out.println(menu.getOpcion(op));
                    Paciente paciente = formCreatePaciente();
                    listaDePacientes.add(paciente);
                    break;
                case 2:
                    System.out.println(menu.getOpcion(op));
                    break;
                case 3:
                    System.out.println(menu.getOpcion(op));
                    break;
                case 4:
                    System.out.println(menu.getOpcion(op));
                    break;
                case 5:
                    System.out.println(menu.getOpcion(op));
                    break;
                case 6:
                    System.out.println(menu.getOpcion(op));
                    return;
                default:
                    System.out.println("La opcion no es valida");
            }
        }
    }

    //Menu para eliminar pacientes
    //Pide los datos para guardar los pacientes
    public static Paciente formCreatePaciente() {
        Paciente paciente = new Paciente();

        System.out.println("|======================================|");
        System.out.print("|Ingrese el Nombre: ");
        paciente.setNombre(input.next());

        System.out.print("|Ingrese el Apellido Paterno: ");
        paciente.setApellidoPaterno(input.next());

        System.out.print("|Ingrese el Apellido Materno: ");
        paciente.setApellidoMaterno(input.next());

        System.out.print("|Ingrese el Rut: ");
        paciente.setRun(Integer.parseInt(input.next()));

        System.out.println("|======================================|");
        System.out.println("|Ingrese la Fecha De Nacimiento");
        System.out.print("|Ingrese el año: ");
        int year = Integer.parseInt(input.next());
        System.out.print("|Ingrese el mes: ");
        int month = Integer.parseInt(input.next());
        System.out.print("|Ingrese el dia del mes: ");
        int day = Integer.parseInt(input.next());
        paciente.setFechaNacimiento(LocalDate.of(year, month, day));

        boolean run = true;
        do {
            System.out.println("|======================================|");
            System.out.println("|Cual es el estado del paciente        |");
            System.out.println("|1-. Grave                             |");
            System.out.println("|2-. Normal                            |");
            System.out.println("|======================================|");
            System.out.print("[*] Ingrese Una Opcion: ");
            int estadoPaciente = Integer.parseInt(input.next());
            if (estadoPaciente >= 1 && estadoPaciente <= 2) {
                if (estadoPaciente == 1) {
                    paciente.setEstadoPaciente(true);
                    run = false;
                }
                if (estadoPaciente == 2) {
                    paciente.setEstadoPaciente(false);
                    run = false;
                }
            }
        } while (run);

        System.out.println("El paciente fue agendado con exito ");
        System.out.println(paciente);
        return paciente;
    }

    //Interfaz para visualizar mejor la lista de pacientes 
    public static void menuOpcionTres(ArrayList<Toma_Datos> listaDeDatos) {
        System.out.println("|============================================================================================|");
        System.out.println("|- Nombre    -|- Apellidos           -|- Rut     -|- Fecha de Nacimiento -|- Paciente Grave -|");
        System.out.println("|============================================================================================|");
        for (int i = 0; i < listaDeDatos.size(); i++) {
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

    public static void limpiarPantallaDelay() {
        try {

            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void limpiarPantallaTecla() {
        try {

            Robot robot = new Robot();
            System.out.println("|============================================================================================|");
            System.out.print("|- Ingrese un caracter y presione enter para continuar: ");
            Scanner enter = new Scanner(System.in);
            String apreta = enter.next();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        } catch (AWTException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
