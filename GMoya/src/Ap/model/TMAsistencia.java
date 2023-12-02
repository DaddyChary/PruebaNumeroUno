/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ap.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DaddyChary
 */
public class TMAsistencia extends AbstractTableModel {

    private List<Asistencia> asistencialista;

    public TMAsistencia(List<Asistencia> asistencialista) {
        this.asistencialista = asistencialista;
    }

    @Override
    public int getRowCount() {
        return asistencialista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Asistencia asistencia = asistencialista.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                asistencia.getRut();
            case 1 ->
                asistencia.getFecha();
            case 2 ->
                asistencia.getSala();
            //case 2 -> producto.getFechaElaboracion().toString();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "Rut";
            case 1 ->
                "Fecha";
            case 2 ->
                "Sala";
            default ->
                " ";
        };
    }
    
}
