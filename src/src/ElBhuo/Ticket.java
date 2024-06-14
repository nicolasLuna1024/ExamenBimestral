package ElBhuo;

public class Ticket extends Adicionales {
    //Atributos
    private int idTicket;

    public Ticket(String cedula, String nombreCliente, String fecha, double quito_Guayaquil, double quito_Tulcan, double quito_Puyo, double quito_Riobamba, double costoRuta, double costoServicio, int maleta, int idTicket) {
        super(cedula, nombreCliente, fecha, quito_Guayaquil, quito_Tulcan, quito_Puyo, quito_Riobamba, costoRuta, costoServicio, maleta);
        this.idTicket = idTicket;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto();
    }

    @Override
    public double maletaSumar() {
        return super.maletaSumar();
    }
    //Mostrar Factura
    //Metodo para FACTURAR e indicar el costo final
    public double facturaTicket(){
        System.out.println("Nombre del cliente: "+getNombreCliente());
        System.out.println("Cedula del cliente: "+getCedula());
        System.out.println("Fecha del Viaje: "+getFecha());
        System.out.println("Id del Viaje: "+getIdTicket());
        System.out.println("Valor del Ticket: "+calcularCosto());
        return calcularCosto();
    }
}
