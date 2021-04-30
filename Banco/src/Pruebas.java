import java.io.IOException;

public class Pruebas {
    public static void main(String[] args) throws IOException {


        Sucursal cajabanco = new Sucursal("1210","1444");
        Cuenta cuenta1 = new Cuenta("Javier Perez","ES0012101444320000000001");
        Cuenta cuenta2 = new Cuenta("Juan Lopez","ES0012101444320000000002");
        Cuenta cuenta3 = new Cuenta("Ramon Garcia","ES0012101444320000000003");

        //cajabanco.cuentas.add(cuenta1);
        //cajabanco.cuentas.add(cuenta2);
        //cajabanco.cuentas.add(cuenta3);

        cajabanco.ingresar(cuenta1,1000);
        cajabanco.retirar(cuenta1,200);
        cajabanco.retirar(cuenta1,100);
        cajabanco.ingresar(cuenta1,1250);
        cajabanco.retirar(cuenta1,100);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);
        cajabanco.retirar(cuenta1,50);

        cajabanco.generarExtracto(cuenta1);
        cajabanco.bloquearCuenta(cuenta2);
        cajabanco.bloquearCuenta(cuenta3); //Esta no mete las cuentas bloqueadas en la carpeta "bloqueadas"

        //cajabanco.ingresar(cajabanco.cuentas.get(0), 500);




    }
}
