
public class App {
	 public static void main(String[] args){
	        
	        Client cli = new Client(2000);
	        
	        Hotel hot = new Hotel();
	        hot.setNumRooms(9);
	        hot.setRoomPrice(500);
	        
	        Package pack = new Package(new Tipo3(),hot);
	        pack.setTax(11);
	        pack.setBasePrice(8701);
	        
	        /*Paquete pack = new Paquete();
	        pack.setImpuesto(10);
	        pack.setPrecioBase(100);
	        System.out.println(pack.CalculadorPrecioBaseconImpuesto());*/
	        cli.buyPackage(pack);
	        System.out.println(pack.getPrice(cli));
	        
	        
	    }
}
