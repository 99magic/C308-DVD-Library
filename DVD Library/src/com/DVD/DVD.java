package com.DVD;
import java.util.ArrayList;
import java.util.List;

public class DVD {
	
	private String title;
	private String releaseDate;
	private int mpaaRating;
	private String directorName;
	private String studio;
	private List<String> userRatings = new ArrayList<String>();
	
	public DVD(String title, String releaseDate, int mpaaRating, String directorName, String studio, List<String> userRatings) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.mpaaRating = mpaaRating;
		this.directorName = directorName;
		this.studio = studio;
		this.userRatings = userRatings;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(int mpaaRating) {
		this.mpaaRating = mpaaRating;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
}
