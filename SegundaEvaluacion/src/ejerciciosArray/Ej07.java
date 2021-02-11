package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        /* Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida
valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.*/
        Scanner sc = new Scanner(System.in);

        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[5];

        // rellenamos los dos primeros arrays
        System.out.println("Introduce cinco valores para el primer array: ");
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = sc.nextInt();
        }

        System.out.println("Introduce cinco valores para el segundo array: ");
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = sc.nextInt();
        }

        // Rellenamos el tercer array con la suma de los elementos de los otros dos
        for (int i = 0; i < lista3.length; i++) {
            lista3[i] = lista1[i] + lista2[i];
        }

        // Imprimimos los tres arrays como comprobación
        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));
    }
}
