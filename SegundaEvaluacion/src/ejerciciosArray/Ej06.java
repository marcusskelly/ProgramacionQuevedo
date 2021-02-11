package ejerciciosArrays1;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        /* Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4)
        y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes.
        Debes usar listas. Para simplificarlo vamos a suponer que febrero tiene 28 días.
         */

        Scanner sc = new Scanner(System.in);
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int mes;
        do {
            System.out.println("Indica el número de mes (1-12): ");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        System.out.println(nombreMes[mes - 1] + " tiene " + diasMes[mes - 1] + " días.");
    }
}
