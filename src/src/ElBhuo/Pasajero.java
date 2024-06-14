package ElBhuo;
import java.util.Scanner;

public class Pasajero {
    //Atributos
    private String cedula;
    private String nombreCliente;
    private String fecha;
    //Metodo Constructor

    public Pasajero(String cedula, String nombreCliente, String fecha) {
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
    }
    //Getters y Setters

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Metodo Personalizado
    public double calcularCosto(){
        return 0.0;
    }
}
