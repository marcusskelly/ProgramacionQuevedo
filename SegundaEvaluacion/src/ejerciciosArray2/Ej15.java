package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /* 15. Leer 10 enteros ordenados crecientemente. */
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        /*Leer N */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número a buscar: ");
        int N = sc.nextInt();

        /* y buscarlo en la tabla. Se debe mostrar la posición
        en que se encuentra. Si no está, indicarlo con un mensaje.
         */
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                encontrado = true;
                System.out.println("El número " + N + " se encuentra en la posición " + (i+1));
                break;
            }
        }
        if (encontrado == false)
            System.out.println("El elemento " + N + " no se encuentra en el array.");
    }
}
