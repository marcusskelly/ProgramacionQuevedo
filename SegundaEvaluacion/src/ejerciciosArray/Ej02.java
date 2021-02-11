package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        /* Crea una lista e inicializala con 5 cadenas de caracteres leídas por teclado. Copia los
        elementos de la lista en otra lista pero en orden inverso, y muestra sus elementos por la
        pantalla. */
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {    // array.length = 10
            System.out.println("Introduce el número en la posición: " + i);
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int[] inverso = new int[5];
        for (int i = 0; i < inverso.length; i++) {
            inverso[i] = array[inverso.length - 1 - i]; // inverso.length - 1 = 9, que es la última posición del array
        }

        System.out.println(Arrays.toString(inverso));
    }
}
