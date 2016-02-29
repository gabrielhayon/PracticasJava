package clase_1;

public class App {
	public static void main(String[] args){
		Pasajero mPasajero = new Pasajero();
		Pasajero anotherPasajero = new Pasajero();
		Employee newEmployee = new Employee();
		PriceCalculator priceCalculater = new PriceCalculator();
		
		newEmployee.setName(args[0]);
		
		mPasajero.setName(args[1]);
		mPasajero.setDiscount(0.30);
		mPasajero.setCommission(1500);
		
		anotherPasajero.setName(args[2]);
		
		System.out.println("Primer passenger: " + mPasajero.getName() + priceCalculater.calculatePrice(10000, mPasajero));
		System.out.println( "Empleado: " + newEmployee.getName() + priceCalculater.calculatePrice(10000, newEmployee));
	}
}
