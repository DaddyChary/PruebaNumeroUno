/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author DaddyChary
 */
public class ConsoleUtil {
    
    /**
     * Limpiar Pantalla 
     */
    
    public static void limpiarPantallaDelay() throws AWTException{
        
        try{
            
            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);

        }catch(AWTException ex){
            
            System.out.println(ex.getMessage());    
        }
    }
   
    public static void limpiarPantallaTecla() throws AWTException{
        
        try{
            
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
                
        }catch(AWTException ex){
            
            System.out.println(ex.getMessage());    
        }
    }

}

