package ejerciciosArrays1;

import java.util.Arrays;

public class Ej12 {
    public static void main(String[] args) {
       /* Diseñar el algoritmo correspondiente a un programa, que:
• Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
• Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
        posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
        que el resto de los elementos contendrán el valor 0.
        111111111111111
        100000000000001
        100000000000001
        100000000000001
        111111111111111
• Visualiza el contenido de la matriz en pantalla. */

        int[][] tabla = new int[5][15];

        // la primera y última fila, y la primera y última columna son unos; el resto, ceros
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == tabla.length -1 || j == 0 || j == tabla[0].length -1)
                    tabla[i][j] = 1;
                else
                    tabla[i][j] = 0;
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}
