package ejerciciosArray;
import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {

        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int numero = 0;
        String[] mes = {"Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre"};
        do{
            do{
                System.out.println("Introduce un mes");
                numero = sc.nextInt();
            }while(numero < 1 || numero > 12);
                System.out.println(mes[numero-1] + " tiene " + dias[numero-1] + "dias");
                System.out.println("Quieres buscar otro mes? s/n");
                char respuesta = sc.next().charAt(0);
                if(respuesta == 's' || respuesta =='S'){
                    seguir = true;
                }else if(respuesta == 'n' || respuesta == 'N'){
                    seguir = false;
                }
        }while(seguir == true);

    }
}
