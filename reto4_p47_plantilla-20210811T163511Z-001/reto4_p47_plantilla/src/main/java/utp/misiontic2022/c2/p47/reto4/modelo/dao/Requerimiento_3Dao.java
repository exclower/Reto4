package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    Connection conexion;

    public Requerimiento_3Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> lista = new ArrayList<>();
        /*String sql = "select Ciudad_Residencia, sum(Salario) 'sum' "+ 
        "from Lider l " +
        " group by Ciudad_Residencia ";*/
        String sql = "select cargo, avg(Salario) 'sum' from Lider l group"+
        " by Cargo having avg(salario)>500000 order by Cargo; ";
        Statement stm = conexion.createStatement();
        ResultSet resultados = stm.executeQuery(sql);
        while(resultados.next()){
            Requerimiento_3 sumaSalarios = new Requerimiento_3();
            sumaSalarios.setCargo(resultados.getString("cargo"));
            sumaSalarios.setSumaSalarios(resultados.getDouble("sum"));
            lista.add(sumaSalarios);
        }
        stm.close();
        resultados.close();
        return lista;
    }
}
