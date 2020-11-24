package sesion06;

public class Ej05 {

	public static void main(String[] args) {
		int suma = 0;
		int producto = 1;
		int numero = 30;
		for(int i = 1;i<=30;i++) {
			suma +=i;
			producto = producto * i;
		}
		System.out.println(suma);
		System.out.println(producto);
	}
}
