import java.util.HashSet;

public class Diablo {
	private int diabloPower;
	private Demon lesserDemon;
	private int lessSoulsGiven;

	public Diablo(Demon mDemon){
		this.lesserDemon = mDemon;
		lessSoulsGiven = 0;
		this.diabloPower = 0;
	}
	
	public Demon getLesserDemon() {
		return lesserDemon;
	}

	public void setLesserDemon(Demon mLesserDemon) {
		this.lesserDemon = mLesserDemon;
	}

	public int getDiabloPower() {
		return diabloPower;
	}

	public void setDiabloPower(int mDiabloPower) {
		this.diabloPower = mDiabloPower;
	}
	
	public void settleUp(Demon mDemon){
		if(mDemon.getCapturedSouls().isEmpty()){
			mDemon.evilLevel = mDemon.evilLevel / 10;
		}else if(this.lessSoulsGiven > mDemon.getCapturedSouls().size()){
			this.lesserDemon = mDemon;
			this.lessSoulsGiven = mDemon.getCapturedSouls().size();
		}
		mDemon.setCapturedSouls(new HashSet<Soul>());
	}
}
