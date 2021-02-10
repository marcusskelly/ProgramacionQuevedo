package ejerciciosArray;
import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Double[] array = new Double[5];
        Scanner sc = new Scanner(System.in);
        double maximo = 0;
        double minimo = 0;
        double sumaNotas = 0;
        double media = 0;
        for (int i = 0; i < array.length;i++){
            System.out.println("Introduce una nota");
            array[i] = sc.nextDouble();
        }
        for(int i = 0; i < array.length;i++){
            sumaNotas = sumaNotas + array[i];
        }
        media = sumaNotas/ array.length;
        System.out.printf( "La media es: %.1f" , media);
        System.out.println();

        maximo = array[0];
        minimo = array[0];
        for(int i = 0; i < array.length;i++){
            if(array[i] > maximo){
                maximo = array[i];
            }else if(array[i] < minimo){
                minimo = array[i];
            }
        }
        System.out.printf("la maxima es: %.1f" , maximo);
        System.out.println();
        System.out.printf("la minima es: %.1f" , minimo);

    }

}
