/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedidos.db.mysql;

import com.pedidos.db.Conexion;
import java.sql.SQLException;

/**
 *
 * @author morag
 */
public class Manager {
    
    private Conexion conn = null;
    
    private DAOFlavor dFlavor = null;
//    private DAOSize dSize = null
    
    public Manager() throws SQLException {
        this.conn = new Conexion("example_pedido");
        this.dFlavor = new DAOFlavor(conn);
//        this.dSize = new DAOSize(conn);
    }
    
    public DAOFlavor getDAOFlavor(){
        if(dFlavor == null){
            dFlavor = new DAOFlavor(conn);
        }
        return dFlavor;
    }
    
//    public DAOSize getDAOSize(){
//        if(dSize == null){
//            dSize = new DAOSize(conn);
//        }
//        return dSize;
//    }
    
    
}
