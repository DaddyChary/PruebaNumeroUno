/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ap.db;

import Ap.model.Asistencia;
import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaddyChary
 */
public class Data {

    private Conexion conn;
    private java.sql.Statement sen;

    public Data() throws SQLException {
        this.conn = new Conexion("poo_evaluacion_3");
    }

    public void agregarAsistencia(Asistencia asistencia) throws SQLException {
        String sql = "INSERT INTO asistencia VALUES ('" + asistencia.getRut() + "', '" + asistencia.getFecha().toString() + "', '" + asistencia.getSala() + "')";
        conn.execute(sql);
    }

    public void updateAsistencia(Asistencia asistencia) throws SQLException {
        String sql = "UPDATE asistencia SET rut_estudiante='" + asistencia.getRut() + "', fecha_asistencia='" + asistencia.getFecha() + "', sala_asistida='" + asistencia.getSala() + "' WHERE rut_estudiante='" + asistencia.getRut() + "'";
        conn.execute(sql);
    }

    public void deleteAsistencia(Asistencia asistencia) throws SQLException {
        String sql = "DELETE FROM asistencia WHERE rut_estudiante='" + asistencia.getRut() + "'";
        conn.execute(sql);
    }

    public List<Asistencia> getOne(String filter) throws SQLException {
        String query = "SELECT * FROM asistencia WHERE rut_estudiante ='" + filter + "';";
        ResultSet rs = conn.execute(query);
        List<Asistencia> asistencialista = new ArrayList<>();
        if (rs.next()) {
            Asistencia asistencia = new Asistencia();
            asistencia.setRut(rs.getString("rut_estudiante"));
            asistencia.setFecha(LocalDate.parse(rs.getDate("fecha_asistencia").toString()));
            asistencia.setSala(rs.getString("sala_asistida"));
            asistencialista.add(asistencia);
        }
        conn.close();
        return asistencialista;
    }

    public List<Asistencia> getAll() throws SQLException {
        String query = "SELECT * FROM asistencia;";
        ResultSet rs = conn.execute(query);
        List<Asistencia> asistencialista = new ArrayList<>();
        while (rs.next()) {
            Asistencia asistencia = new Asistencia();
            asistencia.setRut(rs.getString("rut_estudiante"));
            asistencia.setFecha(LocalDate.parse(rs.getDate("fecha_asistencia").toString()));
            asistencia.setSala(rs.getString("sala_asistida"));
            asistencialista.add(asistencia);
        }
        conn.close();
        return asistencialista;
    }

}