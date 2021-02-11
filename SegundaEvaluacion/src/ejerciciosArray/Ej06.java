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
/*Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para
simplificarlo vamos a suponer que febrero tiene 28 días.

