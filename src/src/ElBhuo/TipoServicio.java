package ElBhuo;

import java.util.Scanner;

public class TipoServicio extends Rutas {
    private double costoServicio;
    //Metodo COnstructor

    public TipoServicio(String cedula, String nombreCliente, String fecha, double quito_Guayaquil, double quito_Tulcan, double quito_Puyo, double quito_Riobamba, double costoRuta, double costoServicio) {
        super(cedula, nombreCliente, fecha, quito_Guayaquil, quito_Tulcan, quito_Puyo, quito_Riobamba, costoRuta);
        this.costoServicio = costoServicio;
    }

    //Getters and Setters

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }
    //Metodos heredados

    @Override
    public double calcularCosto() {
        return super.calcularCosto()+getCostoServicio();

    }
    //Mettodo para pedir tipo de Servicio Normal o VIP
    public void pedirServicio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("A continuacion se mostrara el tipo de Servicio:");
        System.out.println("Recordar que el Servicio Normal contiene lo siguiente:");
        System.out.println("Selección de asientos: ventana, pasillo, al final, adelante.");
        System.out.println("Espacio para una maleta.");
        System.out.println("Opción a una maleta adicional por costo extra ($5).");
        System.out.println("*************************************");
        System.out.println("Servicio VIP (30% del valor del pasaje normal): ");
        System.out.println("Televisión, internet.");
        System.out.println("Espacio para dos maletas.");
        System.out.println("Opción a una maleta adicional por costo extra ($5).");
        System.out.println("*************************************");
        System.out.println("Ingrese el tipo de servicion: ");
        System.out.println("1) Normal");
        System.out.println("2) VIP");



        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                setCostoServicio(0);
                break;
            case 2:
                setCostoServicio(getCostoRuta()*0.3);
                break;
            default:
                System.out.println("Ingrese una opcion Valida");
                break;
        }

    }







}
