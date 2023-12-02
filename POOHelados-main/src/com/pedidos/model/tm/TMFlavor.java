package com.pedidos.model.tm;

import com.pedidos.model.iceScream.Flavor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author morag
 */
public class TMFlavor extends AbstractTableModel{
    private List<Flavor> flavorList;

    public TMFlavor(List<Flavor> list) {
        flavorList = list;
    }
    
    @Override
    public int getRowCount() {
        return flavorList.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 -> {
                return "ID";
            }
            case 1 -> {
                return "Sabor";
            }
            default -> {
                return "Precio";
            }
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Flavor flavor = flavorList.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return flavor.getId();
            }
            case 1 -> {
                return flavor.getTag();
            }
            default -> {
                return "$ " + flavor.getPrice();
            }
        }
    }
}
