package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        /* Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de
        la siguiente información:

• La temperatura media de cada día
• Los días con menos temperatura
• Se lee una temperatura por teclado y se muestran los días cuya temperatura
        máxima coincide con ella. si no existe ningún día se muestra un mensaje de
        información. */
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Número de días a introducir: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); // para liberar el scanner y poder utilizar nextLine

        int[] temperatura = new int[n];
        // rellenamos el array aleatoriamente con temperaturas entre -15 y 50
        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = (int) (Math.random() * 50 - 15);
        }

        System.out.println(Arrays.toString(temperatura));

        // mostrar los días con una temperatura concreta
        int t;
        do {
            System.out.println("Temperatura a buscar (-15 - 50): ");
            t = sc.nextInt();
        } while (t < -15 || t > 50);

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] == t) {
                System.out.println("Día " + (i + 1));
            }
        }



    }
}
