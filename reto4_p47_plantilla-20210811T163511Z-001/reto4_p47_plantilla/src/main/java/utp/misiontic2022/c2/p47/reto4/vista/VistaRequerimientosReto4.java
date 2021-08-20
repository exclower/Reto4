package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea 'Ortiz'");
        System.out.println("Nombre Primer_apellido Segundo_apellido Salario");
        try {
            ArrayList<Lider> resultado = controlador.consultarRequerimiento1();
            for (Lider lider:resultado){
                System.out.print(lider.getNombre()+" ");
                System.out.print(lider.getPrimer_Apellido()+" ");
                System.out.println(lider.getSegundo_Apellido());
                System.out.println(lider.getSalario());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        System.out.println("Transformar y obtener el nombre de los lideres donde la"+ 
        " primera letra sea en minúscula y las demás en mayúscula\nNombre");        
        try {
            ArrayList<Requerimiento_2> resultado = controlador.consultarRequerimiento2();
            for (Requerimiento_2 lider:resultado){
                System.out.println(lider.getNombreInvert()+" ");      
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia\n"+
        "Cargo Salario");
        try {
            ArrayList<Requerimiento_3> resultado = controlador.consultarRequerimiento3();
            for (Requerimiento_3 lider:resultado){
                System.out.print(lider.getCargo()+" ");
                System.out.printf("%.6f %n", lider.getSumaSalarios());      
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
