import java.util.HashSet;

public abstract class Demon {
	protected final static int GOODNESS_LOSS = 5;
	protected int evilLevel;
	protected HashSet<Soul> capturedSouls = new HashSet<Soul>();
	
	public int getEvilLevel() {
		return evilLevel;
	}
	public void setEvilLevel(int mEvilLevel) {
		this.evilLevel = mEvilLevel;
	}
	public HashSet<Soul> getCapturedSouls() {
		return capturedSouls;
	}
	public void setCapturedSouls(HashSet<Soul> mCapturedSouls) {
		this.capturedSouls = mCapturedSouls;
	}
	public abstract boolean verifyMission(Place mPlace, Mission mMission);
	public void hunt(Soul soulToHunt, Place placeHunted){
		this.capturedSouls.add(soulToHunt);
		placeHunted.huntedSoul(soulToHunt);
	}
	public void huntPlace(Place placeHunted) {
		HashSet<Soul> huntableSouls = this.scoutHuntableSouls(placeHunted);
		for(Soul soulToHunt : huntableSouls){
			this.hunt(soulToHunt,placeHunted);
		}
		HashSet<Soul> hauntableSouls = placeHunted.getSouls();
		for(Soul soulToHaunt : hauntableSouls){
			this.haunt(soulToHaunt);
		}
		this.evilLevel =+ (hauntableSouls.size() + (huntableSouls.size() * 2));
	}
	public abstract boolean verifyHunt(Soul mSoul);
	public abstract void haunt(Soul soulToHaunt);
	public boolean checkPossibleHunt(Soul mSoul){
		return this.evilLevel > mSoul.getGoodness();
	}
	public HashSet<Soul> scoutHuntableSouls(Place mPlace){
		HashSet<Soul> huntableSouls = new HashSet<Soul>();
		HashSet<Soul> livingSouls = mPlace.getSouls();
		for(Soul mSoul : livingSouls){
			if(this.verifyHunt(mSoul) && this.checkPossibleHunt(mSoul)){
				huntableSouls.add(mSoul);
			}
		}
		return huntableSouls;
	}
}
