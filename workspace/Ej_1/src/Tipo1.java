
public class Tipo1 implements Strategy{
    
    public double getPackagePrice(Hotel unHotel, Client unCliente, Package unPaquete){
        // Los que calculan su precio base como cantidad de habitaciones * precio de habitación,
        double precioBase = unHotel.getNumRooms() * unHotel.getRoomPrice();
        return precioBase;
    }
}
