package practica3;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        if(num1 % 2 != 0 ){
            System.out.println("El numero introducido, " + num1 + " es impar");
        }else{
            System.out.println("El numero introducido, " + num1 + " es par");
        }
    }
}
