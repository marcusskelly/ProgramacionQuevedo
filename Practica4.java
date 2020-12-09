package practica4;

import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		int opcion = 0;
		do {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ejercicio a resolver");
		System.out.println("1. For");
		System.out.println("2. While");
		 opcion = sc.nextInt();
		if(opcion == 1) {
			System.out.println("Introduce un numero");
			int numero = sc.nextInt();
			System.out.println("Introduce otro");
			int numero2 = sc.nextInt();
			System.out.println("Introduce caracter");
			char caracter = sc.next().charAt(0);
			if(numero < numero2) {
				for (int i = 1; i <= numero; i++) {
					for (int j = 1; j <= numero2; j++) {
					System.out.print(caracter + "\t");
					}
					System.out.println();
				}
			}else if(numero > numero2) {
				for (int i = 1; i <= numero2; i++) {
					for (int j = 1; j <= numero; j++) {
					System.out.print(caracter + "\t");
					}
					System.out.println();
				}
			}
			System.exit(0);
		}
		if(opcion ==2) {
			int numAleatorio = (int) (Math.random() * 100 + 1);
			System.out.println("Vamos a encontrar un numero al azar entre el 1 y el 100");
			System.out.println("Si deseas rendirte pulsa 0");
			System.out.println("Introduce un numero");
			int numero = sc.nextInt();
			do {
				if(numero > 101 || numero < 0) {
					System.out.println("valor fuera de rango");
					System.out.println("Introduce un numero");
					numero = sc.nextInt();
					continue;
				}else if(numero < numAleatorio) {
					System.out.println("El numero a encontrar es mayor");
					System.out.println("Introduce un numero");
					numero = sc.nextInt();
					continue;
				}else if(numero > numAleatorio) {
					System.out.println("El numero a encontrar es menor");
					System.out.println("Introduce un numero");
					numero = sc.nextInt();
					continue;
				}else if(numero == numAleatorio) {
					System.out.println("Felicidades, encontraste el numero");
					System.exit(0);
				}else if(numero > 101 || numero < 0) {
					System.out.println("valor fuera de rango");
					System.out.println("Introduce un numero");
					numero = sc.nextInt();
				}
				
			}while(numero != 0);
			System.out.println("te has rendido, el numero era " + numAleatorio);
			System.exit(0);
		}
		
		}while(opcion != 1 || opcion != 2);
	}

}
