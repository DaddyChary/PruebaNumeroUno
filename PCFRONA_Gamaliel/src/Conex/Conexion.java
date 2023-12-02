/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conex;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author DaddyChary
 */
public class Conexion {

    Connection con;
    private String url;
    private String root;
    private String pass;
    
    
    public Conexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,root,pass);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
    
    
}
