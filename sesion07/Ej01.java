package sesion07;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 1 y 100");
		int numero = sc.nextInt();
		while(numero < 1 || numero > 100) {
			System.out.println("Error en el numero introducido");
			System.out.println("Introduce un numero entre 1 y 100");
			 numero = sc.nextInt();
		}
		System.out.println("El numero introducido es: " + numero);
		
	}
}
