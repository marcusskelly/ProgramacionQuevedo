package string;

public class Ej4 {
    public static void main(String[] args) {
        String cadena = "La frase que queremos analizar";
        cadena = cadena.trim();
        int contador = 0;
        for(int i = 0; i<cadena.length();i++){
            if(cadena.charAt(i) == ' '){
                contador ++;
            }

        }
        System.out.println(contador +1);
    }
}
