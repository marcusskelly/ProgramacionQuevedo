package ejerciciosArrays1;

import java.util.Arrays;

public class Ej11 {
    public static void main(String[] args) {
       /* Diseñar el algoritmo correspondiente a un programa, que:
• Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
• Carga la tabla de forma que los componentes pertenecientes a la diagonal de la
        matriz tomen el valor 1 y el resto el valor 0.
• Muestra el contenido de la tabla en pantalla. */
    int[][] tabla = new int[5][5];

    // los elementos de la diagonal son los de índice 00, 11, 22...
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j)
                    tabla[i][j] = 1;
                else
                    tabla[i][j] = 0;
            }
        }

    // imprimimos la tabla para ver cómo ha quedado
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}
