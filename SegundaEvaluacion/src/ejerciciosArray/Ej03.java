package ejerciciosArrays1;

import java.util.Arrays;

public class Ej03 {
    public static void main(String[] args) {
        /* Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
        (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la
        nota más alta que ha sacado y la menor. */

        // en vez de leer por teclado vamos a meter 5 números aleatoriamente entre 0 y 10
        double[] notas = new double[5]; // creamos el array con números decimales porque la media seguramente tendrá decimales
        for (int i = 0; i < notas.length; i++) {    // notas.length = 5
            notas[i] = (Math.random() * 10);
        }

        // imprimimos las notas
        System.out.print("Notas:\t");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%.2f \t",notas[i]);
        }
        System.out.println();

        // calculamos la nota media: suma de las notas / nº de notas
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.printf("Nota media: %.2f \t", media);
        System.out.println();

        // nota más alta
        double máximo = notas[0]; // empezamos suponiendo que la primera nota es la más alta y a partir de ahí comparamos
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > máximo)  // si encontramos una nota en el array mayor que el máximo provisional, reemplazamos la variable máximo con la nota encontrada
                máximo = notas[i];
        }
        System.out.printf("Nota más alta: %.2f \t", máximo);
        System.out.println();

        // nota más baja
        double mínimo = notas[0]; // empezamos suponiendo que la primera nota es la más baja y a partir de ahi comparamos
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < mínimo)
                mínimo = notas[i];
        }
        System.out.printf("Nota más baja: %.2f \t", mínimo);



    }
}
