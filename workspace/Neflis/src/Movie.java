
public class Movie extends Content implements Viewable{

	
	
	@Override
	public boolean hasUserWatchedMe(User mUser) {
		return mUser.getContentViewed().contains(this);
	}

	@Override
	public int getDuration() {
		return this.duration;
	}
	
}
