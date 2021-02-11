package ejerciciosArrays1;

import java.util.Arrays;

public class Ej05 {
    public static void main(String[] args) {
        /* Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y
        posterior ordene los elementos de menor a mayor. */

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);
        }
        System.out.println(Arrays.toString(array));


        // La API de java para la clase Arrays tiene un método sort() que hacer precisamente esto
        Arrays.sort(array);

        // Imprimimos el array con un for, para variar
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
