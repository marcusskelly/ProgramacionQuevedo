package ejerciciosArrays1;

import java.util.Arrays;

public class Ej01 {
    public static void main(String[] args) {
        /*Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y
        posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su
        cubo.*/

        int[] array = new int[10]; // posiciones (índices) 0 a 9

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        // comprobamos que se ha rellenado con valores aleatorios de 1 a 10
        //String cadena = Arrays.toString(array);
        //System.out.println(cadena);

        for (int num: array) {
            System.out.println("Elemento: " + num + "\t\t Cuadrado: " + (num * num) + "\t\t Cubo: " + (num * num * num));
        }

    }
}
