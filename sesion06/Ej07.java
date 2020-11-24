package sesion06;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = 0;
		do {
			 numero = sc.nextInt();
		}while(numero >0);
		int i = 0;
		System.out.println("Los divisores son: ");
		for(numero=1; i<=numero;i++) {
			if(numero % 5 == 0) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
