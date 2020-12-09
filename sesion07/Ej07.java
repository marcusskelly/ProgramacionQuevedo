package sesion07;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		int numAleatorio = (int) (Math.random() * 100 + 1);
		System.out.println("Vamos a encontrar un numero al azar entre el 1 y el 100");
		System.out.println("Si deseas rendirte pulsa 0");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		do {
			if(numero < numAleatorio) {
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
				break;
			}else if(numero > 101) {
				System.out.println("valor fuera de rango");
				System.out.println("Introduce un numero");
				numero = sc.nextInt();
			}
			
		}while(numero != 0);
		System.out.println("te has rendido, el numero era " + numAleatorio);
	}

}
