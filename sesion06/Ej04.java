package sesion06;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j < 10; j++) {
			System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}
}