package ejerciciosArray2;

import java.util.Arrays;

public class Ej09 {

    public static int[] crear(){
        int[] array = new int [10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i;
        }
        return array;
    }
    public static int[] copiarArray(int[] arr){
        int[] copia = arr.clone();//copia es independiente donde copia[0] = 1111; solo cambiaria en copia[]
        //sin embargo int[] copia = array[] sería un tipo referencia en donde copia[0] = 1111 resultaría en el cambio en las dos arrays
        return copia;
    }
    public static int[] desplazarArray(int[] array, int[] copia){
        array[0] = copia[9];
        for (int i = 1; i <= array.length-1; i++) {
            array[i] = copia[i-1];
        }
        return array;
    }
    public static void main(String[] args) {
        int[] a = crear();
        System.out.println(Arrays.toString(a));
        int[] b = copiarArray(a);
        int [] c = desplazarArray(a,b);
        System.out.println(Arrays.toString(c));
    }
}
