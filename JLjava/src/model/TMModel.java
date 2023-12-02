// CREACIÓN TABLE MODEL
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TMModel extends AbstractTableModel{
    
    // Creación de ArrayList
    private ArrayList<Estudiante> lista;

    public TMModel(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    
    // Método para obtener número de Filas
    @Override
    public int getRowCount() {
        return lista.size();
    }

    // Método para obtener número de columnas
    @Override
    public int getColumnCount() {
        return 3;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiante estudiante = lista.get(rowIndex);
        
        return switch (columnIndex) {
            case 0 -> estudiante.getRut();
            case 1 -> estudiante.getFechaAsistencia();
            case 2 -> estudiante.getSala();
            //case 2 -> producto.getFechaElaboracion().toString();
            default -> "";
        };
    }
    
    // Método para obtener el nombre de las columnas
    @Override
    public String getColumnName(int column){
        return switch (column){
            case 0 -> "Rut";
            case 1 -> "Fecha";
            case 2 -> "Sala";
            default -> "";
        };
    }
    
}
