import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cuenta {
    /* Escribe una clase llamada Cuenta. Debe contener cuatro atributos:
    saldo, de tipo long;
    titular de tipo String,
    número, de tipo long, y
    bloqueada de tipo boolean,
 */
    private String titular;
    private String iban;
    private double saldo;
    private boolean bloqueada = false;

    /* También debe contener :
    - Un constructor con dos parámetros (titular y número).
    - Un constructor con tres parámetros (titular, número y saldo),
    para inicializar estos atributos.
    Todas las cuentas se crean desbloqueadas*/

    public Cuenta(String titular, String iban) {
        this.titular = titular;
        this.iban = iban;
        saldo = 1;

        String ruta = "C:\\Users\\Estela\\IdeaProjects\\Ficheros\\Banco";
        File fichero = new File(ruta + "\\" + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24));
        fichero.mkdirs();

        try (FileWriter fw = new FileWriter(ruta + "\\" + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24) + "\\movimientos.txt", true)) {
            // append = true -> añade al final
            // append = false (por defecto) -> sobreescribe
            fw.write((int) saldo);
            fw.write((int) saldo);
            for (int i = 0; i < 10; i++) {
                fw.write(i + "    ");
            }

        } catch (IOException e) {
            System.out.println("Excepción de E/S: " + e.getMessage());
        }

    }

    public Cuenta(String titular, String iban, double saldo) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
    }
    /* Añade los getter y setter para todos los atributos */

    public String getTitular() {
        return titular;
    }

    // no creamos setter para el titular porque no se puede cambiar el titular de una cuenta

    public String getIban() {
        return iban;
    }

    // no creamos setter porque no se puede cambiar un número de cuenta

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    /* Define el método ingresar(long):long, que consiste en comprobar si la cuenta está bloqueada
    y, en caso de no estarlo, añadir una cantidad al saldo.
     */
    public double ingresar(double cantidad) {
        if (bloqueada == false) {
            this.saldo = this.saldo + cantidad;
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return saldo;
    }

    /* Define el método retirar(long):long,
    en este caso, si la cuenta no está bloqueada y
    la cantidad a retirar es mayor que el saldo,
    hay que indicar: "Saldo insuficiente"
     En caso contrario hay que indicar el saldo que le queda.
     */
    public double retirar(double cantidad) {
        if (bloqueada == false) {
            if (cantidad <= this.saldo) {
                this.saldo = this.saldo - cantidad;
                System.out.println("Saldo resultante: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return this.saldo;
    }

    /* Define el método imprimir, que visualiza :
    "El titular ... con número de cuenta ... tiene un saldo de ... euros."*/
    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta "
                + this.iban + " tiene un saldo de " + this.saldo + " euros.");
    }



}



