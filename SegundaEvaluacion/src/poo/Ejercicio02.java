package poo;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] array = {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789, 1234567890};
        System.out.println();

        // Pide un número por teclado; no utilices la instrucción import para crear el objeto Scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Pide un número por teclado; no utilices la instrucción import para crear el objeto Scanner
        System.out.println("Introduce numero");
        int n = sc.nextInt();
        // Imprime el resultado -tal cual- de el método binarySearch para buscar el número en el array
        // SIN UTILIZAR import
        System.out.println(java.util.Arrays.binarySearch(array, n));
        //El binary search te devuelve la posicion donde un numero esta.

        if(java.util.Arrays.binarySearch(array, n) >=0){
            System.out.println("el numero " + n + " Se encuentra en la posicion " + java.util.Arrays.binarySearch(array, n));
        }else{
            System.out.println("el numero " + n + "no Se encuentra en el array");
        }
    }
}
