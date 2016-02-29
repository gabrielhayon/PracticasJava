import java.util.HashSet;

public class ShadowDemon extends Demon{
	
	private static int soulLimit;

	public static int getSoulLimit() {
		return soulLimit;
	}

	public static void setSoulLimit(int mSoulLimit) {
		ShadowDemon.soulLimit = mSoulLimit;
	}

	@Override
	public boolean verifyMission(Place mPlace, Mission mMission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyHunt(Soul mSoul) {
		return ((checkPossibleHunt(mSoul)) && (mSoul.getSoulLevel() < soulLimit));
	}

	@Override
	public void haunt(Soul soulToHaunt){
		soulToHaunt.lowerGoodness(GOODNESS_LOSS);
		soulToHaunt.lowerSoulLevel();
	}
}
