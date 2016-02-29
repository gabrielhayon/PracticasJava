import java.util.HashSet;

public abstract class Content {
	protected HashSet<Actor> mainActors;
	protected String genre;
	protected int duration;
	
	public HashSet<Actor> getMainActors() {
		return this.mainActors;
	}
	public void setMainActors(HashSet<Actor> mMainActors) {
		this.mainActors = mMainActors;
	}
	public String getGenre() {
		return this.genre;
	}
	public void setGenre(String mGenre) {
		this.genre = mGenre;
	}
	public void setDuration(int mDuration) {
		this.duration = mDuration;
	}
	public abstract int getDuration();
	public abstract boolean hasUserWatchedMe(User mUser);
	
	
	
}
