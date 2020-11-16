package practica2;

import java.util.Scanner;

public class Practica2Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        if(num1 >=0){
            System.out.println("Introduce otro numero");
            int num2 = sc.nextInt();
            if(num2 >=0){
                System.out.println("Introduce la operacion deseada(+,-,*,/ )");
                char c = sc.next().charAt(0);
                switch(c){
                    case '+':
                        System.out.println("El resultado de la suma es: "  + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("El resultado de la resta es: "  + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("El resultado de la multiplicacion es: "  + (num1 * num2));
                        break;
                    case '/':
                        System.out.println("El resultado de la division es: "  + (num1 / num2));

                    default:
                        System.out.println("Operacion erronea");

                }
            }else{
                System.out.println("El segundo numero es negativo");
            }
        }else{
            System.out.println("El primer numero es negativo");
        }

            System.out.println("Final del programa");
        }

    }
