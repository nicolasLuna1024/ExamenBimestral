package ElBhuo;

import java.security.PublicKey;
import java.util.Scanner;

public class Rutas extends Pasajero {
    //Atributos Unicos
    private double Quito_Guayaquil; //($20)
    private double Quito_Tulcan; //($17.50)
    private double Quito_Puyo; //($15)
    private double Quito_Riobamba;//($17.50)
    private double costoRuta;
    //Metodo Constructor ya con Super

    public Rutas(String cedula, String nombreCliente, String fecha, double quito_Guayaquil, double quito_Tulcan, double quito_Puyo, double quito_Riobamba, double costoRuta) {
        super(cedula, nombreCliente, fecha);
        Quito_Guayaquil = quito_Guayaquil;
        Quito_Tulcan = quito_Tulcan;
        Quito_Puyo = quito_Puyo;
        Quito_Riobamba = quito_Riobamba;
        this.costoRuta = costoRuta;
    }


    //Getters y Setters

    public double getQuito_Guayaquil() {
        return Quito_Guayaquil;
    }

    public void setQuito_Guayaquil(double quito_Guayaquil) {
        Quito_Guayaquil = quito_Guayaquil;
    }

    public double getQuito_Tulcan() {
        return Quito_Tulcan;
    }

    public void setQuito_Tulcan(double quito_Tulcan) {
        Quito_Tulcan = quito_Tulcan;
    }

    public double getQuito_Puyo() {
        return Quito_Puyo;
    }

    public void setQuito_Puyo(double quito_Puyo) {
        Quito_Puyo = quito_Puyo;
    }

    public double getQuito_Riobamba() {
        return Quito_Riobamba;
    }

    public void setQuito_Riobamba(double quito_Riobamba) {
        Quito_Riobamba = quito_Riobamba;
    }

    public double getCostoRuta() {
        return costoRuta;
    }

    public void setCostoRuta(double costoRuta) {
        this.costoRuta = costoRuta;
    }
    //Metodo Heredado con Override

    @Override
    public double calcularCosto() {
        return super.calcularCosto()+getCostoRuta();
    }
    //Metodo Individual
        //Pedir  Ruta                                   // SI DA ERROR POR SCANNER CAMBIAR ESTE METODO
    public void pedirRuta(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el  numero de ruta a su eleccion:");
        System.out.println("1. Quito-Guayaquil (Guayaquil-Quito) $20");
        System.out.println("2. Quito-Tulcan (Tulcan-Quito) $17.50");
        System.out.println("3. Quito-Puyo (Puyo-Quito) $15");
        System.out.println("4. Quito-Riobamba (Riobamba-Quito) $17.50");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                setCostoRuta(20);
                break;
            case 2:
                setCostoRuta(17.50);            // SI DA ERROR DE SCANNER APLICAR CONTINUE POR BREAK
                break;
            case 3:
                setCostoRuta(15);
                break;
            case 4:
                setCostoRuta(17.50);
                break;
            default:
                System.out.println("Ingrese una opcion Valida");
                break;

        }

    }

}
