import java.util.HashSet;
import java.util.TreeSet;

public class Serie extends Content{
	TreeSet<Season> seriesSeasons;
	
	@Override
	public boolean hasUserWatchedMe(User mUser){
		for (Season seasonToVerify : seriesSeasons){
			if(!(seasonToVerify.checkSeasonViewed(mUser.contentViewed))){
				return false;
			}
		}
		return true;
	}

	@Override
	public int getDuration() {
		this.duration = 0;
		for (Season mSeason : seriesSeasons){
			for (Chapter mChapter : mSeason.getSeasonChapters()){
				this.duration =+ mChapter.getDuration();
			}
		}
		return this.duration;
	}
	
	public Chapter getLastChapter(){
		return seriesSeasons.last().seasonChapters.last();
	}
}
