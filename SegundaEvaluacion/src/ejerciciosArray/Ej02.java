package ejerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        String[] array = new String[5];
        String[] array2 = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length;i++){
            System.out.println("Introduce un string");
            array[i] = sc.next();
        }
        System.out.println(Arrays.toString(array));
        array2[0] = array[4];
        array2[1] = array[3];
        array2[2] = array[2];
        array2[3] = array[1];
        array2[4] = array[0];
        for(int i = 0; i < array2.length;i++){
            array2[i] = array[(array.length-1)-i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
