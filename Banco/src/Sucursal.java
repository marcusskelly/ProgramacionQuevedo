import com.sun.deploy.net.MessageHeader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Sucursal {


    String entidad;
    String oficina;
    static ArrayList<Cuenta> cuentas;

    public Sucursal(String entidad, String oficina) throws IOException {
        this.entidad = entidad;
        this.oficina = oficina;
        File cuentas = new File("C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco\\cuentas");
        boolean creado = cuentas.mkdirs();
        if(creado){
            System.out.println("El fichero " + cuentas.getName() + " Se ha creado");
        }
    }

    public static void crearCuenta(String titular, String numero, double saldo) throws IOException {

        Cuenta cuenta = new Cuenta(titular,numero,saldo);
        cuentas.add(cuenta);
    }
}
