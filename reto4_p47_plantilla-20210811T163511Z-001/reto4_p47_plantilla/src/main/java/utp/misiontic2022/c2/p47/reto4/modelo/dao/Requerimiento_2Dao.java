package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    Connection conexion;

    public Requerimiento_2Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> lista = new ArrayList<>();
        String sql = "select LOWER(SUBSTR(Nombre,1,1)) ||" +
        " UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) 'nombreInvert' from Lider l";
        Statement stm = conexion.createStatement();
        ResultSet resultados = stm.executeQuery(sql);
        while(resultados.next()){
            Requerimiento_2 listaInvert = new Requerimiento_2();
            listaInvert.setNombreInvert(resultados.getString("nombreInvert"));
            lista.add(listaInvert);
        }
        stm.close();
        resultados.close();
        return lista;
    }
}
