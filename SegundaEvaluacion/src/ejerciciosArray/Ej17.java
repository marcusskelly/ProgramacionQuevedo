package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        /* Crear un programa que añada números a una lista hasta que introducimos un número
        negativo. A continuación debe crear una nueva lista igual que la anterior pero eliminando los
        números duplicados. Muestra esta segunda lista para comprobar que hemos eliminados los
        duplicados. */
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Tamaño del array:");
            n = sc.nextInt();
        } while (n <= 0);

        int[] lista = new int[n];

        int i = 0, num;
        do {
            System.out.println("Introducir número: ");
            num = sc.nextInt();
            if (num >= 0)
                lista[i] = num;
            i++;
        } while (num >= 0 && i < lista.length);

        System.out.println(Arrays.toString(lista));

        Arrays.sort(lista);

        int aux = lista[0], tamaño = 0; // contador va a darnos el tamaño del array de únicos (no duplicados)
        for (int j = 0; j < lista.length; j++) {
            if (lista[j] == aux) {
                tamaño++;
            } else {
                aux = lista[j];
            }
        }

        System.out.println(tamaño);

        int[] únicos = new int[tamaño];
        int único = lista[0];
        únicos[0] = lista[0]; // el primer número va a ser el mismo en ambas listas
        int posÚnicos = 1;
        for (int j = 1; j < lista.length; j++) {
            if (lista[j] != único){ // recorremos el array lista e insertamos en el array únicos los que van siendo diferentes
               únicos[posÚnicos] = lista[j];
               posÚnicos++;
                único = lista[j];
            }
        }
        System.out.println(Arrays.toString(únicos));
    }
}
