
package db;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Libro;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;

// CLASE DATA:
public class Data {
    
    // Creación de ArrayList:
    private Conexion conn;

    // Creación de Constructor:
    public Data(String db) throws SQLException {
        conn = new Conexion(db);
    }
    
    // Creación de Métodos: 
    public void agregarLibro(Libro libro) throws SQLException{
        String sql = "INSERT INTO libros VALUES(null, '"+libro.getNombre()+"', '"+libro.getAutor()+"', '"+libro.getFechaPublicacion().toString()+"', '"+libro.getGenero()+"', '"+libro.getNumeroDePaginas()+"')";
        conn.ejecutarQuery(sql);
    }

    public ArrayList<Libro> getListaDeLibros() throws SQLException {
        String sql = "SELECT nombre, autor, fechaPublicacion AS 'fecha', genero, numeroPaginas FROM libros";
        ResultSet rs = conn.ejecutarSelect(sql);
        ArrayList<Libro> bookList = new ArrayList<>();
        
        while(rs.next()){
            Libro libro = new Libro(); 
            libro.setNombre(rs.getString("nombre"));
            libro.setAutor(rs.getString("autor"));
            libro.setFechaPublicacion(LocalDate.parse(rs.getDate("fecha").toString()));
            libro.setGenero(rs.getString("genero"));
            libro.setNumeroDePaginas("numeroPaginas");
            bookList.add(libro);
        }
        
        conn.CLOSE();
        
        return bookList;
    }
    
    
    
}
