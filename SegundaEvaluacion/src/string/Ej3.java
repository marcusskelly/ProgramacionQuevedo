/*Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces
aparece el carácter en la cadena.*/

Scanner sc = new Scanner(System.in);
System.out.println("Introduce cadena: ");
String cadena = sc.nextLine();
System.out.println("Introduce carácter: ");
char carácter = sc.next().charAt(0);
/* recorremos la cadena carácter a carácter, contando las veces en que
coincide con el introducido por teclado */
int contador = 0;
for (int i = 0; i < cadena.length(); i++) {
if (cadena.charAt(i) == carácter) {
contador++;
}
}
System.out.println("El carácter " + carácter + " aparece " + contador + "
veces en " + cadena);
