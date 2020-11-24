package sesion06;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos numeros enteros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0;i <=b;i++) {
			suma +=i;
		}
		System.out.println(suma);
	}
}
