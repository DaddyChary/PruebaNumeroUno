
package db;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.Estudiante;


public class Data {
    
    private Conexion conn;

    public Data(String db) throws SQLException {
        conn = new Conexion(db);
    }
    
    public void agregarEstudiante(Estudiante estudiante) throws SQLException{
        String sql = "INSERT INTO asistencia VALUES(null,'"+estudiante.getRut()+"','"+estudiante.getFechaAsistencia()+"','"+estudiante.getSala()+"');";
        conn.ejecutarQuery(sql);
                
    }
    
    public ArrayList<Estudiante> obtenerListaDeEstudiantes() throws SQLException{
        String sql = "SELECT rut_estudiante, fecha_asistencia, sala_asistida FROM asistencia;";
        ResultSet rs = conn.ejecutarSelect(sql);
        ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();
        
        while(rs.next()){
            Estudiante estudiante = new Estudiante(); 
            estudiante.setRut(rs.getString("rut"));
            estudiante.setFechaAsistencia(rs.getString("fecha"));
            estudiante.setSala(rs.getString("sala"));
            //estudiante.setFechaPublicacion(LocalDate.parse(rs.getDate("fecha").toString()));
            listaDeEstudiantes.add(estudiante);
        }
        
        conn.CLOSE();
        return listaDeEstudiantes;
    }

}
