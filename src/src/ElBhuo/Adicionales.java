package ElBhuo;

public class Adicionales extends TipoServicio{
    //Atributo
    private int Maleta;
    //COntrcutor

    public Adicionales(String cedula, String nombreCliente, String fecha, double quito_Guayaquil, double quito_Tulcan, double quito_Puyo, double quito_Riobamba, double costoRuta, double costoServicio, int maleta) {
        super(cedula, nombreCliente, fecha, quito_Guayaquil, quito_Tulcan, quito_Puyo, quito_Riobamba, costoRuta, costoServicio);
        Maleta = maleta;
    }



    //Getters and Setters

    public int getMaleta() {
        return Maleta;
    }

    public void setMaleta(int maleta) {
        Maleta = maleta;
    }


    //Metodo Heredado

    @Override
    public double calcularCosto() {
        return super.calcularCosto()+getMaleta();
    }
    public double maletaSumar(){
        return calcularCosto()+getMaleta();
    }

}
