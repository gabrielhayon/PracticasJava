package clase_1;

public class Employee implements PackageStrategy{
	
	public static void main(String[] args){
		
	}
	
	private static double Discount = 0.7;
	
	public double getDiscount() {
		return Discount;
	}
	
	public static void setDiscount(double mDiscount) {
		Discount = mDiscount;
	}
	
	public double getPrice(double Price){
		return ((Price - (Price * this.getDiscount())));
	}
}
