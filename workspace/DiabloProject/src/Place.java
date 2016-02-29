import java.util.HashSet;

public class Place {
	private HashSet<Soul> souls = new HashSet<Soul>();
	
	public HashSet<Soul> getSouls() {
		return souls;
	}

	public void setSouls(HashSet<Soul> souls) {
		this.souls = souls;
	}
	
	public void huntedSoul(Soul mSoul){
		this.souls.remove(mSoul);
	}
}
