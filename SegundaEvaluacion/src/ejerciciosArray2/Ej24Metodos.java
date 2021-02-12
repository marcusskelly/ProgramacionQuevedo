package EjerciciosProgramacion.src.arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej24Metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduce un tamaño");
			n = sc.nextInt();
		}while(n <=0);
		int[] prueba = new int [n];
		for(int i =0;i<prueba.length;i++) {
			prueba[i] = (int) (Math.random() *2000);
		}
		System.out.println(Arrays.toString(getPrimeroYUltimo(prueba)));
		
	}
	public static int[] getPrimeroYUltimo(int [] array){
		
		int[] respuesta = new int [2];
		respuesta[0] = array[0];
		respuesta[1] = array[array.length-1];
		return respuesta;
		
	}

}
