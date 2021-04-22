import java.util.ArrayList;
import java.lang.Math;

public class Sucursal {

    String entidad;
    String oficina;
    ArrayList<Cuenta> cuentas;

    public Sucursal(String entidad, String oficina) {
        this.entidad = entidad;
        this.oficina = oficina;
        ArrayList<Cuenta> cuentas = new ArrayList<>();
    }

    public String generarCC(){
        int codigoControl1 = (int)(Math.random() * 9);
        int codigoControl2 = (int)(Math.random() * 9);
        String cControl = String.valueOf(codigoControl1) + String.valueOf(codigoControl2);
        return cControl;
    }

    public String generarNumeroCuenta(){
        int numeroCuenta1 = (int)(Math.random() * 99999);
        int numeroCuenta2 = (int)(Math.random() * 99999);
        String nCuenta = String.valueOf(numeroCuenta1) + String.valueOf(numeroCuenta2);
        return nCuenta;
    }

    public String generarIban(){
        String iban = "ES" + generarCC() + entidad + oficina + generarCC() + generarNumeroCuenta();
        return iban;
    }

    public void crearCuenta(String titular, double saldo){
        Cuenta cuenta1 = new Cuenta(titular,generarIban(),saldo);
        cuentas.add(cuenta1);
    }

    

}
