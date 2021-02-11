package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        /*Queremos guardar los nombres y las edades de los alumnos de un curso. Realiza un
        programa que introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*)
        Al finalizar se mostrará los siguientes datos:
•	Todos lo alumnos mayores de edad.
•	Los alumnos mayores (los que tienen más edad) */

        // Si tenemos que utilizar un array debemos saber antes cuántos elementos. Lo preguntamos
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Número máximo de alumnos: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); // liberamos el scanner para que funcione nextLine()

        //Creamos dos arrays, uno para los nombres y otro para las edades
        String[] nombre = new String[n];
        int[] edad = new int[n];

        String nom;
        for (int i = 0; i < nombre.length ; i++) {
            System.out.println("Nombre (* para finalizar)");
            nom = sc.nextLine();
            if (!nom.equals("*")) { // para comparar cadenas de Strings utilizamos el método equals() en vez del comparador ==
                nombre[i] = nom;
                System.out.println("Edad: ");
                edad[i] = sc.nextInt();
                sc.nextLine(); // liberamos el scanner
            } else {
                break;
            }
        }

        // Mostramos los alumnos mayores de edad
        System.out.println("Mayores de edad: ");
        for (int i = 0; i < edad.length; i++) {
            if (edad[i] >= 18) {
                System.out.println(nombre[i] + " (" + edad[i] + ")");
            }
        }

        // Para sacar los alumnos que tienen más edad cogemos la edad máxima
        int máximo = edad[0];
        for (int i = 0; i < edad.length; i++) {
            if (máximo < edad[i]) {
                máximo = edad[i];
            }
        }

        // Alumnos con la edad máxima
        System.out.println("Alumnos de mayor edad: ");
        for (int i = 0; i < edad.length; i++) {
            if (edad[i] == máximo) {
                System.out.println(nombre[i] + " (" + edad[i] + ")");
            }
        }


        // Imprimimos lo que tenemos para comprobar
        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(edad));
    }
}
