package utp.misiontic2022.c2.p47.reto4;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Proyectos {
    private int ID_Proyecto;
    private String Constructora;

    public Proyectos(int ID_Proyecto, String Constructora){
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
    }

    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

}

class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

class Requerimiento_1Dao {    

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

class ControladorRequerimientos {
    
    Requerimiento_1Dao dao = new Requerimiento_1Dao();
    
    public ArrayList<Proyectos> consultarRequerimiento1() throws SQLException {
        return dao.requerimiento1();
    }

    /*public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
    }*/
}

class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Proyectos> lista = controlador.consultarRequerimiento1();
            System.out.println("ID_Proyecto Constructora");
            for(Proyectos proyecto: lista){
                System.out.println(proyecto.getID_Proyecto()+" "+
                proyecto.getConstructora());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

public class Reto4 {
    public static void main( String[] args )
    {
        System.out.println("Conocer el id y la constructora de los proyectos de tipo 1 y acabados en 'Si'");
        VistaRequerimientos.requerimiento1();
    }
}
