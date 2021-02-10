package string;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Ej8 {
    public static void main(String[] args) {
        String cadena = "Ke Paha mAheTeeee";

        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isLowerCase(cadena.charAt(i))){
                System.out.print(Character.toUpperCase(cadena.charAt(i)));
            }else {
                System.out.print(Character.toLowerCase(cadena.charAt(i)));
            }
        }
    }
}
