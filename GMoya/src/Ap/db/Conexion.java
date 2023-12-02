/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ap.db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author DaddyChary
 */


public class Conexion {

    private Connection conn;
    private Statement sen;

    public Conexion(String db) throws SQLException {
        String url = "jdbc:mysql://localhost/" + db + "?user=root&password=";
        conn = DriverManager.getConnection(url);
    }

    public ResultSet execute(String query) throws SQLException {
        sen = conn.createStatement();
        if (query.toLowerCase().startsWith("insert")
                || query.toLowerCase().startsWith("update") 
                || query.toLowerCase().startsWith("delete")){
            sen.executeUpdate(query);
            close();
            return null;
        } else {
            ResultSet rs = sen.executeQuery(query);
            return rs;
        }
    }
        
    public void close() throws SQLException {
        sen.close();
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

