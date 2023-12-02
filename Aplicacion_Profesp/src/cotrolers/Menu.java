/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotrolers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;
import model.Opcion;
import model.Toma_Datos;

/**
 *
 * @author DaddyChary
 */
public class Menu {

    private ArrayList<Opcion> listaDeOpciones;

    public Menu() {
        listaDeOpciones = new ArrayList<>();
    }

    public void addOpcion(Opcion opcion) {
        listaDeOpciones.add(opcion);
    }
    
    public Opcion getOpcion(int op) {
        return listaDeOpciones.get(op - 1);
    }

    public void imprimirMenu() {
        System.out.println("|======================================|");
        System.out.println("|-               *Menu*               -|");
        System.out.println("|======================================|");
        for (Opcion opcion : listaDeOpciones) {
            System.out.println("|"+opcion.getId()+"-. " + opcion.getText() + "*                  |");
        }
        System.out.println("|======================================|");
    }

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

    

}
