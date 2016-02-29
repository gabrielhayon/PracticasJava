import java.util.HashSet;
import java.util.TreeSet;

public class Season {
	TreeSet<Chapter> seasonChapters;
	
	public TreeSet<Chapter> getSeasonChapters() {
		return this.seasonChapters;
	}

	public void setSeasonChapters(TreeSet<Chapter> mSeasonChapters) {
		this.seasonChapters = mSeasonChapters;
	}

	public boolean checkSeasonViewed(HashSet<Viewable> contentViewed){
		int chaptersViewed = 0;
		for (Chapter mChapter : seasonChapters){
			if(mChapter.isChapterViewed(contentViewed)){
				chaptersViewed++;
			}
		}
		return (chaptersViewed == seasonChapters.size());
	}
}
