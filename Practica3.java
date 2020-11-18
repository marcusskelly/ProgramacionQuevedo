package practica3;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sobre que estructura quieres resolver ejercicios?");
		System.out.println("1. If");
		System.out.println("2. Switch");
		int opcion = sc.nextInt();
		if(opcion == 1) {
			System.out.println("Introduce el numero de ejercicio que quieras que resuelva: ");
			System.out.println("1. Par-impar");
			System.out.println("2. Sueldo anual");
			System.out.println("5. Triangulo valido");
			System.out.println("6. Fiesta de marmotas");
			System.out.println("7. Notas");
			int programa = sc.nextInt();
			if(programa == 1) {
				System.out.println("Introduce un numero: ");
		        int num1 = sc.nextInt();
		        if(num1 % 2 != 0 ){
		            System.out.println("El numero introducido, " + num1 + " es impar");
		        }else{
		            System.out.println("El numero introducido, " + num1 + " es par");
		        }
		    }
			if(programa == 2) {
				System.out.println("Introduce el sueldo anual: ");
				int sueldo = sc.nextInt();
				if(sueldo > 9000) {
					System.out.println("Debes pagar impuestos");
				}
			}
			if(programa == 5) {
				System.out.println("Introduce un numero: ");
				int a = sc.nextInt();
				System.out.println("Introduce otro: ");
				int b = sc.nextInt();
				System.out.println("Introduce el ultimo: ");
				int c = sc.nextInt();
				int suma1 = a + b;
				int suma2 = a + c;
				int suma3 = b + c;
				if(suma1 > c && suma2 > b && suma3 > c) {
					System.out.println("Es un triangulo");
				}else{
					System.out.println("No es un triangulo");
				}
			}
			if(programa == 6) {
				System.out.println("Introduce el numero de tazas: ");
				int tazas = sc.nextInt();
				if(tazas > 10 && tazas < 20) {
					System.out.println("No es fin de semana");
				}else {
					System.out.println("Fin de semana");
				}
			}
			if(programa == 7) {
				System.out.println("Introduce la nota numerica: ");
				float nota = sc.nextFloat();
				
				if(nota >= 0 && nota < 3) {
					System.out.println("MD");
				}else if(nota >= 3 && nota < 5) {
					System.out.println("Insuficiente");
				}else if(nota >= 5 && nota < 6) {
					System.out.println("Suficiente");
				}else if(nota >= 6 && nota < 7) {
					System.out.println("B");
				}else if(nota >= 7 && nota < 9) {
					System.out.println("Notable");
				}else if(nota >= 9 && nota <= 10) {
					System.out.println("SB");
				}
			}
			if(programa != 1 || programa != 2 || programa != 5 || programa != 6 || programa !=7) {
				System.out.println("Este ejercicio no forma parte del programa");
			}
		 }
		if(opcion != 1 || opcion != 2){
			System.out.println("opcion incorrecta");
		}
		if (opcion == 2) {
			System.out.println("Introduce el numero de ejercicio que quieras que resuelva: ");
			System.out.println("1. Lenguaje de programacion");
			System.out.println("2. Programa numero");
			System.out.println("3. Harry potter");
			System.out.println("4. Programa direccion");
			int programa2 = sc.nextInt();
			if(programa2 == 1) {
				System.out.println("Que lenjuage estas aprendiendo? ");
				System.out.println("");
				System.out.println("a. Java");
				System.out.println("b. Kotlin");
				System.out.println("c. Python");
				System.out.println("d. Scala");
				char c = sc.next().charAt(0);
					
					switch(c){
			        case 'a':
			            System.out.println("Si!");
			            break;
			        case 'b':
			            System.out.println("No!");
			            break;
			        case 'c':
			            System.out.println("No!");
			            break;
			        case 'd':
			            System.out.println("No!");
			            break;
			
			        default:
			            System.out.println("Numero desconocido");
			
			    }
			}
			if (programa2 == 2) {
					System.out.println("Introduce un numero: ");
					String num = sc.next();
					
						switch(num) {
						case "Uno":
							System.out.println("Uno");
							break;
						case "Dos":
							System.out.println("Dos");
							break;
						case "Tres":
							System.out.println("Tres");
							break;
						case "Cuatro":
							System.out.println("Cuatro");
							break;
						case "Cinco":
							System.out.println("Cinco");
							break;
						case "Seis":
							System.out.println("Seis");
							break;
						case "Siete":
							System.out.println("Siete");
							break;
						case "Ocho":
							System.out.println("Ocho");
							break;
						case "Nueve":
							System.out.println("Nueve");
							break;
						default:
							System.out.println("Numero introducido es menor que 1 o mayor que 9");
						}
				}
			if(programa2 == 3) {
					System.out.println("Elige una casa para saber su caracteristica ");
					System.out.println("");
					System.out.println("1. Gryffindor");
					System.out.println("2. Hufflepuff");
					System.out.println("3. Slytherin");
					System.out.println("4. Ravenclaw");
					char c1 = sc.next().charAt(0);
					
						switch(c1){
				        case '1':
				            System.out.println("Valentía");
				            break;
				        case '2':
				            System.out.println("Lealtad");
				            break;
				        case '3':
				            System.out.println("Astucia");
				            break;
				        case '4':
				            System.out.println("Intelecto");
				            break;
				        default:
				            System.out.println("No es una casa valida");
				
				    }
				}
			if(programa2 == 4) {
					System.out.println("Elige una direccion ");
					System.out.println("");
					System.out.println("1. Arriba");
					System.out.println("2. Abajo");
					System.out.println("3. Izquierda");
					System.out.println("4. Derecha");
					System.out.println("0. No mover");
					char c2 = sc.next().charAt(0);
					
						switch(c2){
				        case '1':
				            System.out.println("Subir");
				            break;
				        case '2':
				            System.out.println("Bajar");
				            break;
				        case '3':
				            System.out.println("Mover a la izquierda");
				            break;
				        case '4':
				            System.out.println("Mover a la derecha");
				            break;
				            
				        case '0':
				        	System.out.println("No mover");
				        	break;
				        default:
				            System.out.println("Error");
				
				    }
				}
			if(programa2 != 1 || programa2 != 2 || programa2 != 3 || programa2 != 4) {
				System.out.println("Este ejercicio no forma parte del programa");
			}
			
		}
	}
	
}



