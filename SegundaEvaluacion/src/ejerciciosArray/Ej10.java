package ejerciciosArrays1;

import java.util.Arrays;

public class Ej10 {
    public static void main(String[] args) {
       /* Diseñar el algoritmo correspondiente a un programa, que:
• Crea una tabla (lista con dos dimensiones) de 5x5 enteros.
• Carga la tabla con valores numéricos enteros.
• Suma todos los elementos de cada fila y todos los elementos de cada columna
        visualizando los resultados en pantalla. */

        // creamos la tabla con un array bidimensional de 5 filas y 5 columnas
        int[][] tabla = new int[5][5];

        // la rellenamos con números enteros
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = (int) (Math.random() * 10);
            }
        }

        // la visualizamos
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i])); // imprimimos la tabla imprimiendo todas las filas
        }

        // sumamos los elementos de cada fila
        int[] sumaFilas = new int[5]; // almacenaremos la suma de cada fila en una posición

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                sumaFilas[i] += tabla[i][j] ;
            }
        }

        // visualizamos la suma de cada fila
        System.out.println("Sumas de cada fila: ");
        System.out.println(Arrays.toString(sumaFilas));

        // Ahora creamos otro array para recoger las cinco sumas de cada columna
        int[] sumaColumnas = new int[5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                sumaColumnas[i] += tabla[j][i] ;
            }
        }

        System.out.println("Sumas de cada columna: ");
        System.out.println(Arrays.toString(sumaColumnas));



    }
}
