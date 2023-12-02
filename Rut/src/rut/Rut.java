/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rut;

import java.util.Scanner;

/**
 *
 * @author morag
 */
public class Rut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--> INICIO");
        boolean runn = true;
        do {   
            Scanner input = new Scanner(System.in);
            System.out.print("Rut:");
            String rut = input.next().strip();
            if (rut.contains("-")) {
                Character c = calcularDigitoVerificador(Integer.parseInt(rut.split("-")[0]));
                if(c.toString().equals(rut.split("-")[1])){
                    System.out.println("Es correcto");
                    break;
                }
                else{
                    System.out.println("->>>>>>>>>>> RETO");
                    // PRIMERO  : QUIERO EL MENSAJE CORRECTO AL USUARIO
                    // SEGUND   : EXPLICAION DE POR QUE CUANDO ENTRA MAS DE 1 "-" NO ES CORRECTO PERO ENTRA
                    // TERCERO  : QUE HARIAS PARA SOLUCIONAR ESTA PROBLEMATICA
                }
            }
            else{
                System.out.println("El run no es correcto");
            }
        } while (runn);
        System.out.println("->> FIN");
    }

    public static char calcularDigitoVerificador(int rut) {

        int suma = 0;
        int multiplicador = 2;

        while (rut != 0) {
            int digito = rut % 10;
            suma += digito * multiplicador;
            rut /= 10;

            multiplicador++;
            if (multiplicador > 7) {
                multiplicador = 2;
            }
        }

        int resto = suma % 11;
        int resultado = 11 - resto;

        if (resultado == 11) {
            return '0';
        } else if (resultado == 10) {
            return 'K';
        } else {
            return (char) ('0' + resultado);
        }
    }

}
