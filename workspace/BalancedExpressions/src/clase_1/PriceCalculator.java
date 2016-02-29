package clase_1;

public class PriceCalculator{
	
	private final static double IVA = 1.21;
	
	public double calculatePrice(int Price, Client mClient){
		double FinalPrice = Price;
		FinalPrice = mClient.getPrice(FinalPrice);
		FinalPrice = FinalPrice * IVA;
		return FinalPrice;
	}
}
