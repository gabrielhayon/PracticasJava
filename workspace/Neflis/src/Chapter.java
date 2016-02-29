import java.util.HashSet;

public class Chapter implements Viewable{
	private HashSet<Actor> guestActors;
	private int duration;
	private int chapterNumber;
	
	public HashSet<Actor> getGuestActors() {
		return this.guestActors;
	}
	public void setGuestActors(HashSet<Actor> mGuestActors) {
		this.guestActors = mGuestActors;
	}
	public int getDuration() {
		return this.duration;
	}
	public void setDuration(int mDuration) {
		this.duration = mDuration;
	}
	public int getChapterNumber() {
		return this.chapterNumber;
	}
	public void setChapterNumber(int mChapterNumber) {
		this.chapterNumber = mChapterNumber;
	}
	public boolean isChapterViewed(HashSet<Viewable> contentViewed){
		return contentViewed.contains(this);
	}
}
