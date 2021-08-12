package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.ComprasDAO;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    
    ComprasDAO dao = new ComprasDAO();
    
    public ArrayList<Compras> consultarRequerimiento1() throws SQLException {
        return dao.comprasPagadas();
    }

    /*public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
    }*/
}
