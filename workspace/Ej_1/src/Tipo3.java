
public class Tipo3 implements Strategy{

    public double getPackagePrice(Hotel unHotel, Client unCliente, Package unPaquete){ 
        // Los que su precio base es el 10% del saldo del cliente.
        double precioBase =  (10 * unCliente.getMoney())/100;
        return precioBase;
    }
}
