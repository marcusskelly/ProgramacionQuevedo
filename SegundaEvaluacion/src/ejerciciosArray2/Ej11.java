package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /* 11. Leer 10 elementos numéricos que
        se introducirán ordenados de forma creciente. Éstos
      los guardaremos en un array de tamaño 10.
      Leer un número N, e insertarlo en el lugar
      adecuado para que la tabla continúe ordenada.
      */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 2;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Número a insertar: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Ver en qué posición hay que insertar N
        int pos = 0;
        //int i = 0;
        while (pos < array.length && array[pos] < N) {
            pos++;
            //i++;
        }
        System.out.println(pos);

        // Desplazar desde pos en adelante una posición a la derecha
        int[] copia = array.clone();
        for (int i = pos; i < array.length -1; i++) {
            array[i+1] = copia[i];
        }


        // Insertar el elemento en la posición correspondiente
        array[pos] = N;
        System.out.println(Arrays.toString(array));
    }
}
