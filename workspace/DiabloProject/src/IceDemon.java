import java.util.HashSet;

public class IceDemon extends Demon{

	@Override
	public boolean verifyMission(Place mPlace, Mission mMission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyHunt(Soul mSoul) {
		// TODO Auto-generated method stub
		return (checkPossibleHunt(mSoul) && mSoul.isChilled() == true);
	}

	@Override
	public HashSet<Soul> scoutHuntableSouls(Place mPlace) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void haunt(Soul soulToHaunt){
		soulToHaunt.lowerGoodness(GOODNESS_LOSS);
		soulToHaunt.setChilled(true);
	}
}
