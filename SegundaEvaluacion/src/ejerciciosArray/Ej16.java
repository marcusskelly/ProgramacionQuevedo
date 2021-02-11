package ejerciciosArrays1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        /* Vamos a crear un programa que tenga el siguiente menú:
1. Añadir número a la lista: Me pide un número de la lista y lo añade al final de la lista.
2. Añadir número de la lista en una posición: Me pide un número y una posición, y si la
posición existe en la lista lo añade a ella (la posición se pide a partir de 1).
3. Longitud de la lista: te muestra el número de elementos de la lista.
4. Eliminar el último número: Muestra el último número de la lista y lo borra.
5. Eliminar un número: Pide una posición, y si la posición existe en la lista lo borra de
ella (la posición se pide a partir de 1).
6. Contar números: Te pide un número y te dice cuantas apariciones hay en la lista.
7. Posiciones de un número: Te pide un número y te dice en que posiciones está
(contando desde 1).
8. Mostrar números: Muestra los números de la lista
9. Salir */
        
        // Añadido mío: al solicitar menú, que controle que se introduce una opción correcta, no pasamos adelante
        //si no se introduce bien
        
        // Empezamos preguntando tamaño
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Tamaño de la lista: ");
            n = sc.nextInt();
        } while (n <= 0);
        
        // Creamos la lista
        int[] lista = new int[n];

        boolean seguir = true;
        do {

            // Menú
            int opcion;
            do {
                System.out.println("Elige una opción: ");
                System.out.println("1. Añadir número a la lista");
                System.out.println("2. Añadir número de la lista en una posición");
                System.out.println("3. Longitud de la lista");
                System.out.println("4. Eliminar el último número");
                System.out.println("5. Eliminar un número");
                System.out.println("6. Contar números");
                System.out.println("7. Posiciones de un número");
                System.out.println("8. Mostrar números");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 9);

            int num, pos;
            switch (opcion) {
                case 1: // 1. Añadir número a la lista: Me pide un número de la lista y lo añade al final de la lista.
                    // El enunciado no especifica posición, vamos a rellenarla con números random
                    for (int i = 0; i < lista.length; i++) {
                        lista[i] = (int) (Math.random() * 10);
                    }
                    break;
                case 2: // 2. Añadir número de la lista en una posición. Me pide un número y una posición, y si la
                    //posición existe en la lista lo añade a ella (la posición se pide a partir de 1).
                    do {
                        System.out.println("Número a insertar:");
                        num = sc.nextInt();
                        System.out.println("Posición");
                        pos = sc.nextInt();
                    } while (pos < 1 || pos > lista.length);

                    lista[pos - 1] = num;
                    break;
                case 3: // 3. Longitud de la lista. te muestra el número de elementos de la lista.
                    System.out.println("La lista contiene " + lista.length + " elementos.");
                    break;
                case 4: // 4. Eliminar el último número. Muestra el último número de la lista y lo borra.
                    System.out.println("Se va a proceder a eliminar el número " + lista[lista.length - 1]);
                    lista[lista.length - 1] = 0;
                    break;
                case 5: // 5. Eliminar un número. Pide una posición, y si la posición existe en la lista lo borra de
                    // ella (la posición se pide a partir de 1).
                    do {
                        System.out.println("Posición del número a eliminar:");
                        pos = sc.nextInt();
                    } while (pos < 1 || pos > lista.length);

                    System.out.println("Se va a proceder a eliminar el número " + lista[pos -1]);
                    lista[pos - 1] = 0;
                    break;
                case 6: // 6. Contar números. Te pide un número y te dice cuantas apariciones hay en la lista.
                    System.out.println("Número del que queremos saber el número de apariciones: ");
                    num = sc.nextInt();

                    int contador = 0;
                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i] == num)
                            contador++;
                    }
                    System.out.println("El número " + num + " aparece " + contador + "veces");
                    break;
                case 7: // 7. Posiciones de un número. Te pide un número y te dice en que posiciones está
                    //(contando desde 1).
                    System.out.println("Número del que queremos saber las posiciones: ");
                    num = sc.nextInt();

                    System.out.print("El número " + num + " aparece en las posiciones: ");
                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i] == num)
                            System.out.println((i + 1) + "\t");
                    }
                    break;
                case 8: // 8. Mostrar números. Muestra los números de la lista.
                    System.out.println("Los números de la lista son: ");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.print(lista[i] + "\t");
                    }
                    System.out.println();
                default: // se supone que no va a haber una opción incorrecta cuando llegamos aquí
            }

            do {
                System.out.println("¿Desea continuar? \n1. Sí \n2. No");
                num = sc.nextInt();
            }while (num != 1 && num != 2);
            if (num == 2)
                seguir = false;
        } while (seguir == true);
    }
}
