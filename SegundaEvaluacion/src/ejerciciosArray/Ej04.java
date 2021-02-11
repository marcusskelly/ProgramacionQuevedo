package ejerciciosArray;
import java.util.Arrays;
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        int tamaño= 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Que tamaño tiene el array? ");
            tamaño = sc.nextInt();
        }while(tamaño <= 0);
        int[] lista = new int [tamaño];
        int teclado;
        for (int i = 0; i < lista.length;i++){
            System.out.println("Introduce un numero");
            teclado = sc.nextInt();
            if(teclado > 0){
                lista[i]= teclado;
            }else if(teclado < 0){
                break;
            }
        }
        System.out.println(Arrays.toString(lista));
    }
}
/*Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un
número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).
