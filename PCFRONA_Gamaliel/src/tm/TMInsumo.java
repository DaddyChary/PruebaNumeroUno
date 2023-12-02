/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm;

import com.pcfrona.model.Insumo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Laboratorio 2023
 */
public class TMInsumo extends AbstractTableModel {

    private ArrayList<Insumo> lista;

    public TMInsumo(ArrayList<Insumo> insumos) {
        lista = insumos;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Insumo insumo = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return insumo.getTarjetaGrafica();
            case 1:
                return insumo.getProcesador();
            case 2:
                return insumo.getRam();
            case 3:
                return insumo.getDiscoDuro();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TarjetaGrafica";
            case 1:
                return "Procesador";
            case 2:
                return "Ram";
            case 3:
                return "DiscoDuros";
            default:
                return "";
        }
    }
}
