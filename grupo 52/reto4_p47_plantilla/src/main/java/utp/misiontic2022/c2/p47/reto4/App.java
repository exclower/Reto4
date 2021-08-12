package utp.misiontic2022.c2.p47.reto4;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.vista.ModeloDatos;
import utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void main( String[] args )
    {
        /*System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();*/

        /*System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();*/
        ModeloDatos modelo = new ModeloDatos();
        try {
            ArrayList <Compras> lista = controlador.consultarRequerimiento1();
            Object matriz[][] =  new Object [lista.size()][2];
            for(int i = 0 ; i < lista.size();i++){
                matriz[i][0] = lista.get(i).getID_Compra();
                matriz[i][1] = lista.get(i).getProveedor();
            }
            modelo.datos = matriz;
            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
