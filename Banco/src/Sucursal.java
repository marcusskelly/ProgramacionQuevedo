import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
        if (cuentas.get(0).isBloqueada() == false) {
            cuentas.get(0).setSaldo(cuentas.get(0).getSaldo() + cantidad);
            String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
            try (FileWriter fw = new FileWriter(ruta + "\\" + entidad + "\\" + oficina + "\\" + cuentas.get(0).getIban().substring(14,24) + "\\movimientos.txt", true)) {
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
        return cuentas.get(0).getSaldo();
    }

    public double retirar(Cuenta cuenta1, double cantidad) {
        if (cuenta1.isBloqueada() == false) {
            if (cantidad <= cuenta1.getSaldo()) {
                cuenta1.setSaldo(cuenta1.getSaldo() - cantidad);
                System.out.println("Saldo resultante: " + cuenta1.getSaldo());
                String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
                try (FileWriter fw = new FileWriter(ruta + "\\" + entidad + "\\" + oficina + "\\" + cuenta1.getIban().substring(14,24) + "\\movimientos.txt", true)) {
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

    public void generarExtracto(Cuenta cuenta) throws FileNotFoundException {

        String titular = cuenta.getTitular();
        String iban = cuenta.getIban();

        double sumaIngresos = 0;
        double sumaReintegros = 0;

        String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";

        File f = new File(ruta + "\\" + entidad + "\\" +oficina + "\\" + cuenta.getIban().substring(14,24) + "\\movimientos.txt");//Aqui se intento hacerlo directamente con FileWriter, pero sin exitofg
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNextLine()){
                if(sc.nextLine().startsWith("-")){
                    sumaReintegros = sumaReintegros + Double.parseDouble(sc.nextLine());
                }else{
                    sumaIngresos = sumaIngresos + Double.parseDouble(sc.nextLine());
                }
            }

        File fichero = new File(ruta + "\\" + entidad + "\\" +oficina + "\\" + cuenta.getIban().substring(14,24) + "\\extracto.txt");
        fichero.createNewFile();

        try(FileWriter fw = new FileWriter(fichero,true)){
            fw.write("Titular: " + titular + "\n");
            fw.write("iban: " + iban + "\n");
            fw.write("Ingresos: " + sumaIngresos + "\n");
            fw.write("Reintegros: " + sumaReintegros + "\n");
            fw.write("Saldo: " + cuenta.getSaldo() + "\n");
        }


        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado: " +e.getMessage());
        } catch (IOException e) {
            System.out.println("Excepcion E/S: " + e.getMessage());
        }
    }

    public void bloquearCuenta(Cuenta cuenta){
        if(!cuenta.isBloqueada()){
            cuenta.setBloqueada(true);
        }
        
        String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
        File file = new File(ruta + "\\" + entidad + "\\" +oficina + "\\bloqueadas");
        file.mkdirs();
        
        String origen = ruta + "\\" + entidad + "\\" +oficina + "\\" + cuenta.getIban().substring(14,24);
        String destino = ruta + "\\" + entidad + "\\" +oficina + "\\bloqueadas\\" + cuenta.getIban().substring(14,24);
        file.renameTo(new File(ruta + "\\" + entidad + "\\" +oficina + "\\bloqueadas\\" + cuenta.getIban().substring(14,24)));
    }
    
    public void eliminarCuenta(Cuenta cuenta){
        if(!cuenta.isBloqueada()){
            bloquearCuenta(cuenta);
        }
        
        String ruta = "C:\\Users\\Estela\\IdeaProjects\\ficheros\\Banco";
        File f = new File(ruta + "\\" + entidad + "\\" +oficina + "\\bloqueadas\\" + cuenta.getIban().substring(14,24));
        boolean borrada = f.delete();
        if(borrada == false){
            borrarRecursivamente(f);
        }
        
        String eliminadas = ruta + "\\" + entidad + "\\" +oficina + "\\cuentas_eliminadas.txt\\";
        File f2 = new File(eliminadas);
        try{
            boolean creado = f2.createNewFile();
            try(FileWriter fw = new FileWriter(f2,true)){
                fw.write(cuenta.getIban() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error de E/S: " +e.getMessage());
        }

        for (int i = 0; i < cuentas.size(); i++) {
            if(cuentas.get(i).getIban().equals(cuenta.getIban())){
                cuentas.remove(i);
            }
        }
    }
    
    public static void borrarRecursivamente(File dir){
        File[] elementos = dir.listFiles();
        System.out.println("Contenido");
        for (File unElemento: elementos) {
            System.out.println("Nombre: " +unElemento.getName());
            if(unElemento.isDirectory()){
                borrarRecursivamente(unElemento);
            }else{
                System.out.println("Esto es un fichero que sera borrado: " +unElemento);
                unElemento.delete();
            }
        }
        System.out.println("Borrado todo el directorio, y sus carpetas");
        boolean borrada = dir.delete();
        if(borrada)System.out.println("Borrada");
        
    }


}
