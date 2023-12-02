package com.pedidos.model.tm;

import com.pedidos.model.Order;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author morag
 */
public class TMOrder extends AbstractTableModel{
    private List<Order> orderList;

    public TMOrder(ArrayList list) {
        orderList = list;
    }
    
    @Override
    public int getRowCount() {
        return orderList.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 1 -> {
                return "Sabor";
            }
            case 2 -> {
                return "Tamaño";
            }
            case 3 -> {
                return "Topping";
            }
            case 4 -> {
                return "Formato";
            }
            case 5 -> {
                return "Fecha";
            }
            case 6 -> {
                return "Estado";
            }
            case 7 -> {
                return "Rut";
            }
            default -> {
                return "";
            }
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Order order = orderList.get(rowIndex);
        switch (columnIndex) {
            case 1 -> {
                return order.getFlavor();
            }
            case 2 -> {
                return order.getSize();
            }
            case 3 -> {
                return order.getTopping();
            }
            case 4 -> {
                return order.getFormat();
            }
            case 5 -> {
                return order.getDateOfOrder();
            }
            case 6 -> {
                return order.getState();
            }
            case 7 -> {
                return order.getPerson().getRut();
            }
            default -> {
                return "";
            }
        }
    }
}
