import java.util.HashSet;

public class FireDemon extends Demon{

	@Override
	public boolean verifyMission(Place mPlace, Mission mMission) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean verifyHunt(Soul mSoul) {
		return (checkPossibleHunt(mSoul) && (mSoul.isChilled() != true));
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashSet<Soul> scoutHuntableSouls(Place mPlace) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void haunt(Soul soulToHaunt){
		soulToHaunt.lowerGoodness(GOODNESS_LOSS);
		soulToHaunt.setChilled(false);
	}

}
