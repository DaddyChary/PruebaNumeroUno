/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.formulario.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Laboratorio 2023
 */
public class TMPersona extends AbstractTableModel{
    
    private ArrayList<Persona> lista;
    
    public TMPersona(ArrayList<Persona> personas){
        lista = personas; 
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return persona.getRut();
            case 1:
                return persona.getNombre();
            case 2: 
                return persona.getFechanacimiento().toString();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "RUT";
            case 1:
                return "Nombre";
            case 2:
                return "Fecha";
            default:
                return "";
        }
    }
}
     