import java.util.ArrayList;

public class Company extends Client{

	public Company(double mMoney) {
		super(mMoney);
		// TODO Auto-generated constructor stub
	}
	
	public void buyMultiplePackasges(ArrayList<Package> packagesToBuy){
		for (Package packageToBuy : packagesToBuy){
			this.buyPackage(packageToBuy);
		}
	}
}
