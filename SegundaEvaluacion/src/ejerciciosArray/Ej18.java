package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        /* Escriba un programa que permita crear una lista de palabras y que, a continuación dé tres
        opciones:
• Contar: Me pide una cadena, y me dice cuantas veces aparece en la lista
• Modificar: Me pide una cadena, y otra cadena a modificar, y modifica todas las
        apariciones de la primera por la segunda en la lista.
• Eliminar: Me pide una cadena, y la elimina de la lista.
• Mostrar: Muestra la lista de cadenas
• Terminar */
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Tamaño del array:");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); // para liberar el scanner y que funcione después

        String[] cadena = new String[n];

        // Rellenamos el array
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Introduce cadena:");
            cadena[i] = sc.nextLine();
        }

        int opcion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Contar");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            System.out.println("4. Mostrar");
            System.out.println("5. Terminar");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 5);

        switch (opcion) {
            case 1: // Contar: Me pide una cadena, y me dice cuantas veces aparece en la lista
                System.out.println("Cadena a buscar: ");
                sc.nextLine(); // para liberar el scanner y que funcione después
                String cad = sc.nextLine();
                int contador = 0;
                for (int i = 0; i < cadena.length; i++) {
                    if (cadena[i].equals(cad)) {
                        contador++;
                    }
                }
                System.out.println("La cadena " + cad + " aparece " + contador + " veces.");
                break;
            case 2: /* Modificar. Me pide una cadena, y otra cadena a modificar, y modifica todas las
                apariciones de la primera por la segunda en la lista.*/
                System.out.println("Cadena a insertar: ");
                sc.nextLine(); // para liberar el scanner y que funcione después
                String cad1 = sc.nextLine();
                System.out.println("Cadena a reemplazar: ");
                String cad2 = sc.nextLine();
                for (int i = 0; i < cadena.length; i++) {
                    if (cadena[i].equals(cad2)) {
                        cadena[i] = cad1;
                    }
                }
                System.out.println("Resultado: ");
                System.out.println(Arrays.toString(cadena));
                break;
            case 3: // Eliminar. Eliminar: Me pide una cadena, y la elimina de la lista.
                System.out.println("Cadena a eliminar: ");
                String eliminar = sc.nextLine();
                for (int i = 0; i < cadena.length; i++) {
                    if (cadena[i].equals(eliminar)) {
                        cadena[i] = "";
                    }
                }
                break;
            case 4: // Mostrar. Muestra la lista de cadenas
                System.out.println("Las cadenas guardadas son:");
                for (int i = 0; i < cadena.length; i++) {
                    System.out.println(cadena[i]);
                }
                break;
            case 5: // Terminar
                break;
        }
    }
}
