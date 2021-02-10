package ejerciciosArray2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los desplazamientos");
        int n = sc.nextInt();
        int[] copia = array.clone();
        for (int i = n; i < array.length; i++) {
            array[i] = copia[i-n];
        }
        for (int i = 0; i < n; i++) {
            array[i] = copia[array.length-n+i];
        }
        System.out.println(Arrays.toString(array));
    }
}
