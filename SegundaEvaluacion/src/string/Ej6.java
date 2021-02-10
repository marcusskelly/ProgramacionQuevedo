package string;

public class Ej6 {
    public static void main(String[] args) {
        String cadena = "hola";
        String cadenaInvertida = "";
        for (int i = cadena.length()-1; i >=0 ; i--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);
    }
}
