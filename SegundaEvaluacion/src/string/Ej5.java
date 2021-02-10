package string;

public class Ej5 {
    public static void main(String[] args) {
        String persona = "marcus skelly burgos";
        persona = persona.trim().toUpperCase();
        System.out.print(persona.charAt(0));
        for (int i = 0; i < persona.length() ; i++) {
            if(persona.charAt(i) == ' '){
                System.out.print(persona.toUpperCase().charAt(i+1));
            }
        }
    }
}
