import java.util.ArrayList;

public  abstract class Client {
    protected double money;
    protected ArrayList<Package>buyedPackages;
    protected Package mostExpensievePakcage;

    public Client(double mMoney){
        this.money = mMoney;
        this.buyedPackages = new ArrayList<Package>();
        this.mostExpensievePakcage = null;
    }
    
    public double getMoney() {
        return this.money;
    }

    public void setMoney(double mMoney) {
        this.money = mMoney;
    }
    
    public void buyPackage(Package mPackage){
    	double packagePrice = mPackage.getPrice(this);
    	if(this.money > packagePrice){
    		money =- packagePrice;
    		buyedPackages.add(mPackage);
    		if(isMoreExpensive(mPackage)){
    			mostExpensievePakcage = mPackage;
    		}
    	}
    }
    
    private boolean isMoreExpensive(Package newPackage){
    	if((mostExpensievePakcage != null)){
			return ((mostExpensievePakcage.getPrice(this)) < (newPackage.getPrice(this)));
		}else{
			mostExpensievePakcage = newPackage;
			return false;
    	}
    }
    
    public double getMoneySpent(){
    	double moneySpent = 0;
    	for (Package mPackage : buyedPackages){
    		moneySpent =+ mPackage.getPrice(this);
    	}
    	return moneySpent;
    }
    
    public int getPackagesPurchased(){
    	return this.buyedPackages.size();
    }
    
    public Package getMostExpensivePackage(){
    	return this.mostExpensievePakcage;
    }
}
