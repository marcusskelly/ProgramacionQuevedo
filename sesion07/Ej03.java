package sesion07;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numMenor = 0;
		int numMayor = 0;
		int numero = 0;
		
		do {
			System.out.println("Introduce un numero(0 para finalizar)");
			numero = sc.nextInt();
			if(numMayor <= numero) {
				numMayor = numero;
			}
			if(numMenor >= numero) {
				numMenor = numero;
			}
		}while(numero != 0);
			
		System.out.println(numMayor);
	}

}


