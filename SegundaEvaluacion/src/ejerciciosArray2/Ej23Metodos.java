package EjerciciosProgramacion.src.arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej23Metodos {

	
	public static void sumarIndice(long [] array, int indice, long valor) {
		array[indice] = valor + array [indice];
		
	}
	public static void main(String[] args) {
		long [] array = new long [6];
		
		for(int i =0;i<array.length;i++) {
			array[i] = (long)(Math.random()*100 -50);
		}
		sumarIndice(array,4,100);
		System.out.println(Arrays.toString(array));
		
		

	}

}
