package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Proyectos;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {    

    public ArrayList<Proyectos> requerimiento1() throws SQLException {
        ArrayList<Proyectos> respuesta = new ArrayList<>();
        Statement stmt = JDBCUtilities.getConnection().createStatement();
        String sql = "select ID_Proyecto, Constructora from Proyecto where Porcentaje_Cuota_Inicial>=0.2 and Ciudad='Manizales'";
        ResultSet resultados = stmt.executeQuery(sql);
        while(resultados.next()){
            int id_proyecto = resultados.getInt("ID_Proyecto");
            String constructora = resultados.getString("Constructora");
            Proyectos proyecto = new Proyectos(id_proyecto,constructora);
            respuesta.add(proyecto);
        }
        return respuesta;
    }
}