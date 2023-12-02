/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author DaddyChary
 */
public class ConsoleUtil {
    
    /**
     * Limpiar Pantalla 
     */
    
    public static void limpiarPantalla() throws AWTException{
        
        try{
            
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
            robot.delay(500);
                
        }catch(AWTException ex){
            
            System.out.println(ex.getMessage());    
        }
            
    }
    
}
