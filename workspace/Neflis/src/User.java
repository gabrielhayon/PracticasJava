import java.util.HashSet;

public class User {
	HashSet<Viewable> contentViewed;
	
	public HashSet<Viewable> getContentViewed() {
		return this.contentViewed;
	}

	public void setContentViewed(HashSet<Viewable> mContentViewed) {
		this.contentViewed = mContentViewed;
	}

	public boolean isContentViewed(Content verifyContent){
		return verifyContent.hasUserWatchedMe(this);
	}
	
	public void viewContent(Viewable contentToWatch){
		this.contentViewed.add(contentToWatch);
	}
	
	public void String favoriteGenre(){
		
	}
}
