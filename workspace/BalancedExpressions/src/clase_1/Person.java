package clase_1;

public abstract class Person{
	
	protected String Name;
	protected double Discount;
	
	public double getPrice(double Price){
		return ((Price - (Price * this.getDiscount())));
	}

	public String getName() {
		return Name;
	}

	public void setName(String mNombre) {
		this.Name = mNombre;
	}

	public abstract double getDiscount();
}
