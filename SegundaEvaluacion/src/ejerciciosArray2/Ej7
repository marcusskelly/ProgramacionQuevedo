public class Ej7Clase {
    /* 7. Leer por teclado una serie de 10 números enteros. --> los meto a capón
    La aplicación debe indicarnos si los
números están ordenados de forma creciente, decreciente,
o si están desordenados. */ // Orden estricto

    public static void main(String[] args) {
        // para probar
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // ascendente
        int[] B = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // descendente
        int[] C = {0, 1, 2, 3, 6, 5, 7, 8, 9, 0}; // desordenado

        int orden = 0; // ascendente 1  descendente -1  desordenado 0
        if (A[0] < A[1]) {
            // si pasa esto es que es ascendente o desord.
            for (int i = 1; i < A.length -1; i++) {
                if (A[i] < A[i+1]) {
                    orden = 1; // si se va cumpliendo es ascendente
                    continue;
                } else {
                    orden = 0; // con una vez que entre ya está desordenado
                    break;
                }
            }
        } else { // si A[0] > A[1] --> ¿orden descendente?
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i] > A[i+1]) {
                    orden = -1;
                    continue; // redundante
                } else {
                    orden = 0;
                    break;
                }
            }
        }

        if (orden == 1)
            System.out.println("El array está en orden ascendente");
        else if (orden == -1)
            System.out.println("El array está en orden descendente");
        else
            System.out.println("El array está desordenado");


    }
}
