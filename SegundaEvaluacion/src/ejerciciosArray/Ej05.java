package ejerciciosArray;

import java.util.Arrays;

public class Ej05 {
    public static void main(String[] args) {
        int[] lista = new int [10];
        int[] inverso = new int[10];
        for(int i = 0; i < lista.length;i++){
             lista[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
        for(int i = 0; i < inverso.length;i++){
            inverso[i] = lista[(lista.length-1)-i];
        }
        System.out.println(Arrays.toString(inverso));
    }
}
