
import java.util.Random;

public class Main {

    public static int[] num = new int[1500000];

    public static void main(String[] args) {

        Random rnd = new Random();
        int flag;

        for (int i = 0; i < 1500000; i++) {
            flag = rnd.nextInt(2);
            if (flag == 0) {
                num[i] = rnd.nextInt(1500000) * (-1);
            } else {
                num[i] = rnd.nextInt(1500000);
            }
        }

//        System.out.println("Array");
//        for (int i = 0; i < 15; i++) {
//            System.out.print("| "+num[i] + " |" );
//        }
//        
//        System.out.println("");

        Dividir div = new Dividir();
        long startTime = System.currentTimeMillis();
        
        div.divideyVenceras(num, 0, num.length);
        int numemenor = div.nummenor;
        String posiciones = div.resultado;

        System.out.println("\nEl numero menor es " + numemenor + " en las posiciones: " + posiciones + " |");
        
        long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su for
        System.out.println("Tiempo ejecución: "+endTime+" milisegundos");
    }

}
