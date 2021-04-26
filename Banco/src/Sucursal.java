import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sucursal {

    String entidad;
    String oficina;
    ArrayList<Cuenta> cuentas;

    public Sucursal(String entidad, String oficina) {
        this.entidad = entidad;
        this.oficina = oficina;
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
        File fichero = new File(ruta + "\\" + entidad + "\\" + oficina);
        fichero.mkdirs();
    }

    public String generarCC() {

        int CC1 = (int)(Math.random() * 9);
        int CC2 = (int)(Math.random() * 9);
        String codigoControl = String.valueOf(CC1) + String.valueOf(CC2);

        return codigoControl;
    }

    public String generarNumeroCuenta(){

        int cuenta1 = (int)(Math.random() * 99999);
        int cuenta2 = (int)(Math.random() * 99999);
        String numeroCuenta = String.valueOf(cuenta1) + String.valueOf(cuenta2);

        return numeroCuenta;
    }

    public String generarIban(){
        String iban = "ES" + generarCC() + entidad + oficina + generarCC() + generarNumeroCuenta();

        return iban;
    }

    public void crearCuenta(String titular, double saldo)  {

        Cuenta cuenta1 = new Cuenta(titular,generarIban(),saldo);
        cuentas.add(cuenta1);
    }


    public double ingresar(Cuenta cuenta1,double cantidad) {
        if (cuenta1.isBloqueada() == false) {
            cuenta1.setSaldo(cuenta1.getSaldo() + cantidad);
            String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
            try (FileWriter fw = new FileWriter(ruta + "\\" + cuenta1.getIban().substring(4,8) + "\\" + cuenta1.getIban().substring(8,12) + "\\" + cuenta1.getIban().substring(14,24) + "\\movimientos.txt", true)) {
                // append = true -> añade al final
                // append = false (por defecto) -> sobreescribe
                String saldoCadena = String.valueOf(cantidad);
                fw.write(saldoCadena);

            } catch (IOException e) {
                System.out.println("Excepción de E/S: " + e.getMessage());
            }
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return cuenta1.getSaldo();
    }

    public double retirar(Cuenta cuenta1, double cantidad) {
        if (cuenta1.isBloqueada() == false) {
            if (cantidad <= cuenta1.getSaldo()) {
                cuenta1.setSaldo(cuenta1.getSaldo() - cantidad);
                System.out.println("Saldo resultante: " + cuenta1.getSaldo());
                String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
                try (FileWriter fw = new FileWriter(ruta + "\\" + cuenta1.getIban().substring(4,8) + "\\" + cuenta1.getIban().substring(8,12) + "\\" + cuenta1.getIban().substring(14,24) + "\\movimientos.txt", true)) {
                    // append = true -> añade al final
                    // append = false (por defecto) -> sobreescribe
                    String saldoCadena = "-" + String.valueOf(cantidad);
                    fw.write(saldoCadena);

                } catch (IOException e) {
                    System.out.println("Excepción de E/S: " + e.getMessage());
                }
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return cuenta1.getSaldo();
    }


}
