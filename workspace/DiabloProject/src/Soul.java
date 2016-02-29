
public class Soul {
	private int goodness;
	private int soulLevel;
	private boolean chilled;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String mName) {
		this.name = mName;
	}
	public int getSoulLevel() {
		return soulLevel;
	}
	public void setSoulLevel(int mSoulLevel) {
		this.soulLevel = mSoulLevel;
	}
	public int getGoodness() {
		return goodness;
	}
	public void setGoodness(int goodness) {
		this.goodness = goodness;
	}
	public boolean isChilled() {
		return chilled;
	}
	public void setChilled(boolean chilled) {
		this.chilled = chilled;
	}
	public void lowerGoodness(int toReduce){
		this.goodness =- toReduce;
	}
	public void lowerSoulLevel(){
		this.soulLevel = this.soulLevel / 2;
	}
	
}
