package sesion06;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("numero");
		int numero = sc.nextInt();
		System.out.println("caracter");
		char caracter = sc.next().charAt(0);
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
			System.out.print(i * j + "\t");
			}
			System.out.println(caracter);
		}
	}

}
