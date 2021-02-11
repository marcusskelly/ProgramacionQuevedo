package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        /* Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un
        número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos). */
        Scanner sc = new Scanner(System.in);

        // ponemos el tamaño que queramos, lo pedimos por teclado
        int n;
        do {
            System.out.println("Introduce el tamaño del array: ");
            n = sc.nextInt();
        } while (n <= 0); // mientras no introduzcan un tamaño > 0 seguimos preguntando

        // creamos el array de ese tamaño
        int[] array = new int[n];
        int num; // num es el valor a introducir
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un nº (negativo para terminar)");
            num = sc.nextInt();
            if (num >= 0)   // antes de introducir el número en el array comprobamos si es negativo, en cuyo caso no lo insertamos y salimos del bucle for
                array[i] = num;
            else
                break;
        }
        System.out.println(Arrays.toString(array));
    }
}
