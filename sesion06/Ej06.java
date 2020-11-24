package sesion06;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero");
		int numero = sc.nextInt();
		int producto = 1;
		for(int i = 1; i <= numero; i++) {
			producto = producto * i;
			System.out.println(producto);
		}
		

	}
}
