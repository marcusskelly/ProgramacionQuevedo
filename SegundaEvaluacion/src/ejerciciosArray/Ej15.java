package ejerciciosArrays1;

import java.util.Arrays;

public class Ej15 {
    public static void main(String[] args) {
        /*Crear un programa de ordenador para gestionar los resultados de la quiniela de fútbol. Para
        ello vamos a utilizar dos tablas:

• Equipos: Que es una tabla de cadenas donde guardamos en cada columna el
        nombre de los equipos de cada partido. En la quiniela se indican 15 partidos.
• Resultados: Es una tabla de enteros donde se indica el resultado. También tiene dos
        columnas, en la primera se guarda el número de goles del equipo que está guardado
        en la primera columna de la tabla anterior, y en la segunda los goles del otro equipo.
        El programa ira pidiendo los nombres de los equipos de cada partido y el resultado del
        partido, a continuación se imprimirá la quiniela de esa jornada.
¿Qué modificación habría que hacer en las tablas para guardar todos los resultados de
        todas las jornadas de la temporada? */

        // Tabla equipos:
        // guardamos antes los nombres de los equipos en un array de tamaño 30
        String[] nombresEquipos = {"Valencia", "Athletic Club", "Getafe", "Sevilla",
        "Huesca", "Alavés", "Real Madrid", "At. Madrid", "Real Sociedad", "Eibar",
        "Betis", "Villarreal", "Elche", "Granada", "Barcelona", "Levante", "Leganés",
        "Mallorca", "Fuenlabrada", "Mirandés", "Logroñés", "Español", "Almería", "Málaga",
        "Las Palmas", "Alcorcón", "Sporting", "Zaragoza", "Celta", "Cádiz"};

        // en la tabla equipos. en la primera columna van las posiciones pares de nombresEquipos
        // y en la segunda columna las posiciones impares
        String[][] equipos = new String[15][2];
        for (int i = 0; i < 15; i++) {
                    equipos[i][0] = nombresEquipos[i * 2];
                    equipos[i][1] = nombresEquipos[i * 2 + 1];
        }

         for (int i = 0; i < 15; i++) {
            System.out.println(Arrays.toString(equipos[i]));
        } //Descomentar esto para ver la tabla equipos*/

        // Tabla resultados:
        //int[][] resultados = new int[15][2];

        // lo rellenamos directamente también
        int[][] resultados = {{2, 2}, {0, 1}, {1, 0}, {2, 0}, {1, 1}, {1, 1}, {0, 1}, {1, 0}, {0, 1}, {0, 1},
                {0, 3}, {3, 1}, {0, 0}, {1, 0}, {4, 0}};

        // Imprimimos la quiniela
        System.out.println();
        System.out.println("La Quiniela");
        System.out.println("===========");
        for (int i = 0; i < 15; i++) {
                if (resultados[i][0] > resultados[i][1])
                    System.out.println("1");
                else if (resultados[i][0] < resultados[i][1])
                    System.out.println("2");
                else
                    System.out.println("X");
        }
    }
}
