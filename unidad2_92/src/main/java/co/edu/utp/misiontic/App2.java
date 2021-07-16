package co.edu.utp.misiontic;

public class App2 {
    public static void main (String args []){
        Gato gatico = new Gato("Manuel",7, 16,"Diurno");
        System.out.println(gatico.getDueño());
        System.out.println(gatico.getNumero_vidas());
        System.out.println(gatico.getHoras_sueño());
        gatico.cazar();
    }
}
