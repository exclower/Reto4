package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        
        try {
            System.out.println("Conocer el id y el proveedor de las compras que si estén pagadas");
            ArrayList<Compras> resultado = controlador.consultarRequerimiento1();
            System.out.println("ID_Compra Proveedor");
            for (Compras compras:resultado){
                System.out.print(compras.getID_Compra()+" ");
                System.out.println(compras.getProveedor());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*public static void requerimiento2(){
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
    }*/
    
}
