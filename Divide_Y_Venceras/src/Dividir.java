
public class Dividir {

    public String resultado1 = "";
    public String resultado2 = "";
    public String resultado = "";
    public int nummenor = 0;
    public int nummenor2 = 0;

    public void divideyVenceras(int[] numeros, int inicio, int fin) {
        nummenor = numeros[inicio];
        nummenor2 = numeros[fin / 2];
        int medio = (inicio + fin) / 2;

        if (inicio != fin - 1) {
//            System.out.println("\n__________________________________________________________________\n");
            //primera mitad
//            System.out.println("\nDivision ------1111-----");
//            System.out.println("Inicio: " + inicio);
//            System.out.println("Fin: " + fin);

            for (int i = inicio; i < medio; i++) {
                if (numeros[i] == nummenor) {
                    nummenor = numeros[i];
                    resultado1 = resultado1 + i + " |";
                }

                if (numeros[i] < nummenor) {
                    nummenor = numeros[i];
                    resultado1 = "| ";
                    resultado1 = resultado1 + i + " |";
                }
//                System.out.print("|" + numeros[i] + " |");
            }
//            System.out.println("\nNumero menor: " + nummenor);
//            System.out.println("");

            //Segunda mitad
//            System.out.println("\nDivision ------2222-------");
//            System.out.println("Inicio: " + inicio);
//            System.out.println("Fin: " + fin);

            for (int i = medio; i < fin; i++) {
                if (numeros[i] == nummenor2) {
                    nummenor2 = numeros[i];
                    resultado2 = resultado2 + i + " |";
                }

                if (numeros[i] < nummenor2) {
                    nummenor2 = numeros[i];
                    resultado2 = "| ";
                    resultado2 = resultado2 + i + " |";
                }
//                System.out.print("|" + numeros[i] + " |");
            }
//            System.out.println("\nNumero menor: " + nummenor2);
//            System.out.println("");

            if (nummenor < nummenor2) {
                divideyVenceras(numeros, inicio, medio);
            } else {
                if (nummenor == nummenor2) {
                    divideyVenceras(numeros, inicio, medio);
                    divideyVenceras(numeros, medio, fin);     
                } else {
                        divideyVenceras(numeros, medio, fin);  
                }
            }
        } else {
            resultado = resultado + " | " + (inicio);
        }
    }
}

//t(n) = 2t(n/2)+n
/*
a= 2
b= 2

O(n lg n)



*/