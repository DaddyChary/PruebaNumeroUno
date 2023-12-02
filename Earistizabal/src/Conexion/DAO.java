/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Model.Asistencia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAO {

    private Conexion oConexion;


    /*
     constructor de DAO
     Genera la conexion entregando los datos
     */
    ArrayList<Asistencia> listaAsistencia;

    public DAO() throws SQLException {
        oConexion = new Conexion(
                "localhost",
                "poo_evaluacion_3",
                "root",
                ""//pass
        );
    }

    public void crearAsistencia(Asistencia asistencia) throws SQLException {
        String sql = "INSERT INTO asistencia VALUES('" + asistencia.getRut() + "', '" + asistencia.getFecha() + "', '" + asistencia.getSala() + "')";
        oConexion.ejecutar(sql);
    }

    public List<Asistencia> getAsistencia() throws SQLException {
        listaAsistencia = new ArrayList<>();
        String sql = "SELECT * FROM asistencia;";
        oConexion.oResulset = oConexion.ejecutarSelect(sql);
        Asistencia datos;
        while (oConexion.oResulset.next()) {
            datos = new Asistencia();
            datos.setRut(oConexion.oResulset.getString("rut_estudiante"));
            datos.setFecha(oConexion.oResulset.getString("fecha_asistencia"));
            datos.setSala(oConexion.oResulset.getString("sala_asistida"));
            listaAsistencia.add(datos);
        }
        oConexion.oResulset.close();
        return listaAsistencia;
    }
        public List<Asistencia> getAsistenciaFiltro(String filtro) throws SQLException {
        listaAsistencia = new ArrayList<>();
        String sql = "SELECT * FROM asistencia WHERE rut_estudiante LIKE '%"+filtro+"%' OR fecha_asistencia LIKE '%"+filtro+"%' OR sala_asistida LIKE '%"+filtro+"%';";
        oConexion.oResulset = oConexion.ejecutarSelect(sql);
        Asistencia datos;
        while (oConexion.oResulset.next()) {
            datos = new Asistencia();
            datos.setRut(oConexion.oResulset.getString("rut_estudiante"));
            datos.setFecha(oConexion.oResulset.getString("fecha_asistencia"));
            datos.setSala(oConexion.oResulset.getString("sala_asistida"));
            listaAsistencia.add(datos);
        }
        oConexion.oResulset.close();
        return listaAsistencia;
    }
}
