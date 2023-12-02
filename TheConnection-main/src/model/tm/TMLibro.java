
package model.tm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Libro;


public class TMLibro extends AbstractTableModel{

    private ArrayList<Libro> listaDeLibros;

    public TMLibro(ArrayList<Libro> listaDeLibros) {
        this.listaDeLibros = listaDeLibros;
    }

    @Override
    public int getRowCount() {
        return listaDeLibros.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Libro libro = listaDeLibros.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> libro.getNombre();
            case 1 -> libro.getAutor();
            case 2 -> libro.getFechaPublicacion().toString();
            case 3 -> libro.getNumeroDePaginas();
            default -> libro.getGenero();
        };
        
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Autor";
            case 2 -> "Fecha Publicación";
            case 3 -> "Num. Páginas";
            default -> "Género";
        };
    }
    
}
