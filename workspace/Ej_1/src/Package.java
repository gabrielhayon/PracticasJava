
public class Package {
	
    private Strategy strategy;
    private double basePrice;
    private double tax;
    private Hotel mHotel;
    
    public Package(Strategy mStrategy, Hotel hotelRecieved){
		this.strategy = mStrategy;
		this.mHotel = hotelRecieved;
	}
    
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double mBasePrice) {
        this.basePrice = mBasePrice;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double mTax) {
        this.tax = mTax;
    }
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy mStrategy) {
        this.strategy = mStrategy;
    }
    
    public double getPrice(Client unCLiente){
        
        return this.strategy.getPackagePrice(this.mHotel, unCLiente,this); 
    }
}
