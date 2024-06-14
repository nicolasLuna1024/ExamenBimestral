package ElBhuo;

public class Main {
    public static void main(String[] args) {
        Ticket cliente1 = new Ticket ("1726","Nicolas Luna","17/03/20204",0,0,0,0,0,0,5,10);
        cliente1.pedirRuta();
        cliente1.pedirServicio();
        cliente1.maletaSumar();
        cliente1.facturaTicket();
        //Cliente2
        Ticket cliente2 = new Ticket ("12343","Sebastian Montero","10/02/20203",0,0,0,0,0,0,5,11);
        cliente2.pedirRuta();
        cliente2.pedirServicio();
        cliente2.maletaSumar();
        cliente2.facturaTicket();
        //Cliente3
        Ticket cliente3 = new Ticket ("123465","Irina Valentina","9/02/20223",0,0,0,0,0,0,5,12);
        cliente3.pedirRuta();
        cliente3.pedirServicio();
        cliente3.maletaSumar();
        cliente3.facturaTicket();
        //Cliente4
        Ticket cliente4 = new Ticket ("12343","Eranan COrtez","9/02/20203",0,0,0,0,0,0,0,13);
        cliente4.pedirRuta();
        cliente4.pedirServicio();
        cliente4.maletaSumar();
        cliente4.facturaTicket();
        //Cliente5
        Ticket cliente5 = new Ticket ("124354","Carlos Vera","73/02/20235",0,0,0,0,0,0,0,14);
        cliente5.pedirRuta();
        cliente5.pedirServicio();
        cliente5.maletaSumar();
        cliente5.facturaTicket();
    }
}