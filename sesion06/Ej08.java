package sesion06;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero base");
		int numero = sc.nextInt();
		System.out.println("Introduce el exponente");
		int exponente = sc.nextInt();
		int resultado = 0;
		for(int i = 0;i <= exponente;i++) {
			resultado = numero * i;
		}
		System.out.println(resultado);
	}

}
