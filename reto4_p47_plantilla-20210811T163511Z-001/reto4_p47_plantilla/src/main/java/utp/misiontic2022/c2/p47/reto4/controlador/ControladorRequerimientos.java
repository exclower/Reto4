package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.ResourceBundle.Control;

//import utp.misiontic2022.c2.p47.reto4.ControladorRequerimientosReto4;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.LiderDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    
    private LiderDao dao = new LiderDao();
    private Requerimiento_2Dao dao2 = new Requerimiento_2Dao();
    private Requerimiento_3Dao dao3 = new Requerimiento_3Dao();
    
    public ControladorRequerimientos(){
        this.dao = new LiderDao();
    }
    
    public ArrayList<Lider> consultarRequerimiento1() throws SQLException {
        return dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return dao2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return dao3.requerimiento3();
    }
}
