package string;

import java.util.Scanner;

public class EjercicioString3 {
    public static void main(String[] args) {

        //Ejercicio 2
        String str = "Escribir por pantalla";
        String subcadena = "es";
        str = str.toLowerCase();
        System.out.println(str.startsWith(subcadena));

        //Ejercicio 3
        String cadena = "blabla bla";
        char c = 'b';
        int contador = 0;
        for(int i = 0;i< cadena.length() ;i++){
            if(c == cadena.charAt(i)){
                contador ++;
            }
            System.out.println(contador);
        }

    }
}
