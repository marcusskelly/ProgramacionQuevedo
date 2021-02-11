package arrays;

import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
                /* 13. Leer 10 enteros. */
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array1: " + Arrays.toString(array1));

       /* Guardar en otra tabla los elementos pares de la primera, */
        int[] array2 = new int[10];
        int pos2 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[pos2] = array1[i];
                pos2++;
            }
        }
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Posición última en array2: " + pos2);

        /*y a
        continuación los elementos impares. */
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array2[pos2] = array1[i];
                pos2++;
            }
        }
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Posición última en array2: " + pos2);

        /* Realizar dos versiones: una trabajando con los valores
        y otra trabajando con los índices: 0, 1, 2, 3, ....9 */
        int[] array3 = new int[10];
        int pos3 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 0) {
                array3[pos3] = i;
                pos3++;
            }
        }
        System.out.println(pos3);
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 1) {
                array3[pos3] = i;
                pos3++;
            }
        }
        System.out.println("Array3: " + Arrays.toString(array3));
    }
}
