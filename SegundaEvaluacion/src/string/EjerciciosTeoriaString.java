package string;

import java.util.Locale;
import java.util.Scanner;

public class EjerciciosTeoríaStrings {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // cuando terminar sea true saldremos del programa
        boolean terminar = false;
        do {
            menu();
            // al finalizar un ejercicio, preguntamos si queremos terminar
            System.out.println("¿Has terminado (S/N)?");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                terminar = true;
            }
        } while (!terminar); // terminar == false

    }

    public static void menu() {
        // Hacer un menú que pregunte qué ejercicio queremos hacer

        System.out.println("EJERCICIOS TEORÍA STRING");
        System.out.println("========================");
        System.out.println("¿Qué ejercicio quieres corregir?" +
                "\n1. Reemplazar caracteres " +
                "\n2. Comprobar si termina con..." +
                "\n3. Comprobar si comienza con... ignorando M y m" +
                "\n4. Comparar cadenas ignorando espacios en blanco" +
                "\n5. Extraer una subcadena");

        // variable opción
        int opción;
        do {
            opción = sc.nextInt();
            sc.nextLine();
            if (opción < 1 || opción > 5) System.out.println("Error. Introduce opción entre 1 y 5");
        } while (opción < 1 || opción > 5);
        // switch opción
        switch (opción) {
            // si ejercicio 1
            case 1: reemplazarCaracteres(); break;
            case 2: comprobarTermina(); break;
            case 3: comprobarComienza(); break;
            case 4: compararCadenas(); break;
            case 5: extraerSubcadena();
        }

    }

    public static void reemplazarCaracteres() {
        // resolver aquí ejercicio 3
        /* escribe un programa que lea una cadena de texto y
        reemplace todas las ocurrencias de la letra ‘a’ con la letra ‘b’.
         A continuación debe imprimir la cadena resultante.*/

        System.out.println("Escribe una cadena");
        String cadena = sc.nextLine(); // "aaeiapoijaaaa"
        cadena = cadena.replace('a', 'b');
        System.out.println(cadena);
    }

    public static void comprobarTermina() {
        /* ejercicio 4 escribe un programa
         que lea el nombre de una ciudad y compruebe si el nombre termina con “burgo”.
         El programa debe imprimir true o false.*/
        System.out.println("Comprobar si una ciudad termina por \"burgo\"");
        System.out.println("=============================================");
        System.out.println("Escribe el nombre de una ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println(ciudad.endsWith("burgo"));

        /* otra forma
        boolean termina = ciudad.endsWith("burgo");
        System.out.println(termina); */
    }

    public static void comprobarComienza() {
        /* ejercicio 5; escribe un programa
        que compruebe si una cadena dada comienza por “J”,
        sin que tenga en cuenta si está en
        mayúsculas o minúsculas. El programa debe imprimir true o false. */
        System.out.println("Comprobar si una cadena comienza por J");
        System.out.println("======================================");
        System.out.println("Escribe una cadena de texto: ");
        String cadena = sc.nextLine();
        System.out.println(cadena.toLowerCase().startsWith("j"));

    }

    public static void compararCadenas() {
        /* ejercicio 6; escribe un programa que lea dos
cadenas y las compare sin tener en cuenta los espacios en blanco.
El programa debería imprimir true si son iguales, false en caso contrario. */
        System.out.println("Leer dos cadenas y comparar sin tener en cuenta espacios en blanco");
        System.out.println("==================================================================");

        // Pedimos e introducimos las cadenas
        System.out.println("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        // Quitamos los espacios en blanco en ambas cadenas
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");

        /* VAMOS A VERLO
        System.out.println(cadena1);
        System.out.println(cadena2); */

        // Comparo ambas cadenas e imprimo el resultado
        System.out.println(cadena1.equals(cadena2));
    }

    public static void extraerSubcadena() {
        /* ejercicio 7: escribe un programa que lea una cadena y dos números enteros
para indicar los límites inferior y superior respectivamente de un rango dentro de las
posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango: a)
suponiendo que ambos números siempre son mayores o iguales a 0 y menores que la
longitud de la cadena; b) Validando que sucede a). */
        System.out.println("Introduce cadena: ");
        String cadena = sc.nextLine();

        int desde, hasta;
        do {
            System.out.println("Extraer subcadena desde (número): ");
            desde = sc.nextInt();
            System.out.println("hasta (número):");
            hasta = sc.nextInt();
            sc.nextLine();
        } while (desde < 0 || desde >= cadena.length() || hasta < 0 || hasta >= cadena.length());

        System.out.println(cadena.substring(desde, hasta));
    }
}
