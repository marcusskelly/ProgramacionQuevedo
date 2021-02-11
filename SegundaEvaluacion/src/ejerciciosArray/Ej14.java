package ejerciciosArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
       /* Crear un programa que lea los precios de 5 artículos y las cantidades vendidas por una
        empresa en sus 4 sucursales. Informar:
• Las cantidades totales de cada articulo.
• La cantidad de artículos en la sucursal 2.
• La cantidad del articulo 3 en la sucursal 1.
• La recaudación total de cada sucursal.
• La recaudación total de la empresa.
• La sucursal de mayor recaudación. */

        Scanner sc = new Scanner(System.in);
        /* Array unidimensional: precios de los cinco artículos (0 a 4).
        EJ: precios[0] es el precio del primer artículo */

    int[] precios = new int[5];

    int precio;
        for (int i = 0; i < precios.length; i++) {
            do {
                System.out.println("Introduce el precio del artículo " + (i + 1));
                precio = sc.nextInt();
            } while (precio <= 0); // nos aseguramos de que no se introduzca un precio 0 o negativo
            precios[i] = precio;
        }

        /* Array bidimensional: ventas
            - cantidades de cada producto vendidas de cada producto (columnas, de 0 a 4)
              en cada sucursal (filas, de 0 a 3)
              Ej: ventas[2][3]: cantidad del tercer producto (índice [2]) vendido en la cuarta sucursal (índice [3])
         */

        //int[][] ventas = new int[4][5]; // creamos la tabla para las cuatro sucursales y los cinco productos

        // la rellenamos aleatoriamente con cantidades de 0 a 1000.
        /* for (int i = 0; i < ventas.length; i++) { // ventas.length = 4
            for (int j = 0; j < ventas[0].length; j++) {  // ventas[0].length = 5
                ventas[i][j] = (int) (Math.random() * 1000);
            }
        } */

        // hacemos una tabla con valores fijos para probar que funcionan los cálculos
        int[][] ventas = {{100, 50, 75, 30, 0}, {40, 100, 50, 30, 60}, {0, 250, 100, 300, 0}, {100, 100, 100, 100, 100}};

        // Imprimimos la tabla ventas para ver qué hay
        System.out.println("Tabla ventas");
        System.out.println("============");
        System.out.println("      P1\tP2\tP3\tP4\tP5");
        for (int i = 0; i < ventas.length; i++) { //ventas.length = 4 en este caso
            System.out.print("Suc " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        // • Las cantidades totales de cada articulo: sumar cada columna
        int[] sumaCol = new int[5];

        for (int i = 0; i < ventas[0].length; i++) {
            for (int j = 0; j < ventas.length; j++) {
                sumaCol[i] += ventas[j][i];
            }
        }

        System.out.println("Cantidades de cada artículo:");
        System.out.println(Arrays.toString(sumaCol));
        System.out.println();

        //• La cantidad de artículos en la sucursal 2: tenemos que sumar las cantidades de la segunda fila
        int cantSuc2 = 0;
        for (int i = 0; i < 5; i++) {
            cantSuc2 += ventas[1][i];
        }

        System.out.println("Cantidad de artículos vendidos en la sucursal 2: " + cantSuc2);
        System.out.println();

        //• La cantidad del articulo 3 en la sucursal 1:
        // es el valor que encontramos en el cruce de la primera fila (1ª sucursal) y la 3º columna (artículo 3)
        System.out.println("Cantidad del artículo 3 en la sucursal 1:" + ventas[0][2]);
        System.out.println();

        //• La recaudación total de cada sucursal: tenemos que multiplicar (para cada fila) el precio de cada producto por su cantidad,
        // y sumar todos los productos en cada fila (en cada sucursal)
        int[] recaudación = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                recaudación[i] += ventas[i][j] * precios[j];
            }
        }
        System.out.println("La recaudación de cada sucursal es: " + Arrays.toString(recaudación));
        System.out.println();

        //• La recaudación total de la empresa: sumamos lo recaudado en cada sucursal
        int recaudaciónTotal = 0;
        for (int i = 0; i < 4; i++) {
            recaudaciónTotal += recaudación[i];
        }
        System.out.println("La recaudación total de la empresa es: " + recaudaciónTotal);
        System.out.println();

        //• La sucursal de mayor recaudación: buscamos el máximo en el array recaudación
        int máximo = recaudación[0];
        int sucursal = 0; // para recoger la sucursal que tiene el máximo
        for (int i = 0; i < 4; i++) {
            if (recaudación[i] > máximo)
                máximo = recaudación[i];
                sucursal = i;
        }
        System.out.println("La sucursal con mayor recaudación es la " + (sucursal) + " (" + máximo + ").");
    }
}
