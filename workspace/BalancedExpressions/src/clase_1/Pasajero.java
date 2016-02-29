package clase_1;

public class Pasajero implements PackageStrategy{
	
	public static void main(String[] args){
	}
	
	private double Commission;
	private double Discount;

	public double getCommission() {
		return this.Commission;
	}

	public void setCommission(double mCommission) {
		this.Commission = mCommission;
	}

	public double getDiscount() {
		return this.Discount;
	}
	
	public void setDiscount(double mDiscount) {
		this.Discount = mDiscount;
	}
	
	public double getPrice(double Price){
		return ((Price - (Price * this.getDiscount())) + this.Commission);
	} 
}
