import java.util.Arrays;
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i*5 +5;
        }
        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        int pos;
        do{
            System.out.println("introduce posicion");
            pos = sc.nextInt();
        }while(pos < 0 || pos > array.length-1);
        System.out.println("Introduce numero a insertar");
        int numero = sc.nextInt();
        for (int i = array.length-2; i >= pos-1 ; i--) {
            array[i+1] = array[i];
        }
        System.out.println(Arrays.toString(array));
        array[pos-1] = numero;
    }
}
/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el
teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás.
