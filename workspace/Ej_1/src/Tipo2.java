
public class Tipo2 implements Strategy{

    public double getPackagePrice(Hotel unHotel, Client unCliente, Package unPaquete){
        //Los que calculan su precio base de manera fija (como antes)
        double precioBase =((unPaquete.getTax() * unPaquete.getBasePrice()) /100) + unPaquete.getBasePrice();
        return precioBase;
    }
}
