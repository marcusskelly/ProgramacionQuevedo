package sesion07;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero(0 para finalizar)");
		int numero = sc.nextInt();
		int i = 0;
		while( numero != 0) {
			System.out.println("Introduce un numero(0 para finalizar)");
			 numero = sc.nextInt();
			 i++;
		}
		System.out.println("Has introducido " + i +" numeros");
	}

}
