package sesion07;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		int numero = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
			suma = suma + numero;
			
		}while(suma <= 125);
		System.out.println("La suma total es: " +suma);

	}

}
