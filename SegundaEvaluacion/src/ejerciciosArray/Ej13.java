package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
      /*  De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y
        los kilómetros que conducen cada día de la semana.
                Para guardar esta información se van a utilizar dos arreglos:
• Nombre: Lista para guardar los nombres de los conductores.
• kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
        Se quiere generar una nueva lista (“total_kms”) con los kilómetros totales que realiza cada
        conductor.
                Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha
        realizado. */

        //Como no sabemos el tamaño que tiene que tener, lo preguntamos
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Número máximo de conductores: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); // ponemos esto aquí para liberar el objeto Scanner después de haber metido un int

        // Creamos los dos arrays

        String[] nombre = new String[n]; // unidimensional para los conductores
        int[][] kms = new int[n][5]; // suponemos que trabajan de L a V
        // es bidimensional: los conductores en las filas, los kms diarios en las columnas

        // Rellenamos los arrays
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre del conductor: ");
            nombre[i] = sc.nextLine();
        }

        // Comprobamos que se ha rellenado bien el array
        System.out.println(Arrays.toString(nombre));

        for (int i = 0; i < kms.length; i++) {
            System.out.println("Kms que realiza el conductor " + nombre[i] + ": ");
            for (int j = 0; j < kms[0].length; j++) {
                kms[i][j] = sc.nextInt(); // rellenamos los kms para el L, M, X, J y V
            }
        }
            // Comprobamos que se ha rellenado bien el array bidimensional
        System.out.println("Tabla kms");
        System.out.println("=========");
        System.out.println("          L\tM\tX\tJ\tV");
        for (int i = 0; i < kms.length; i++) {
            System.out.print("Conductor " + (i+1) + ":\t\t");
            for (int j = 0; j < kms[0].length; j++) {
                System.out.print(kms[i][j] + "\t");
            }
            System.out.println();
        }

        // Para sacar el total de kms semanales para cada conductor, creamos un array con n posiciones
        int[] totalSemanal = new int[n];

        // Y vamos recorriendo la tabla sumando los valores de cada fila
        for (int i = 0; i < kms.length; i++) {
            for (int j = 0; j < kms[0].length; j++) {
                totalSemanal[i] += kms[i][j];
            }
        }

        // Finalmente, mostramos el nombre de cada conductor junto con el total de kilometros que ha hecho cada semana
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i] + ": " + totalSemanal[i] + " kms.");
        }
    }
}
