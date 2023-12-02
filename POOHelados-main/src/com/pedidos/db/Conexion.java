package com.pedidos.db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

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
                || query.toLowerCase().startsWith("delete")) {
            sen.executeUpdate(query);
            close();
            return null;
        }
        return sen.executeQuery(query);
    }

    public void close() throws SQLException {
        sen.close();
    }
}
