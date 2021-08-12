package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class ComprasDAO {

    Connection conexion;

    public ComprasDAO(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public ArrayList<Compras> comprasPagadas() throws SQLException {
        ArrayList <Compras> lista = new ArrayList<Compras>();
        String sql = "select ID_Compra, Proveedor from Compra where Pagado='Si'";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while(resultado.next()){
            Compras compra = new Compras();
            compra.setID_Compra(resultado.getInt(1));
            compra.setProveedor(resultado.getString(2));
            lista.add(compra);
        }
        return lista;
    }
}