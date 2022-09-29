package com.dvd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dvd implements Serializable{
	
	private String title;
	private String releaseDate;
	private int mpaaRating;
	private String directorName;
	private String studio;
	private String userRating;
	
	public Dvd(String title, String releaseDate, int mpaaRating, String directorName, String studio, String userRatings) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.mpaaRating = mpaaRating;
		this.directorName = directorName;
		this.studio = studio;
		this.userRating = userRatings;
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
	
	public String getUserRating() {
		return userRating;
	}

	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}

	@Override
	public String toString() {
		return  "title= " + title + System.lineSeparator() +
				"releaseDate= " + releaseDate + System.lineSeparator() +
				"mpaaRating= " + mpaaRating + System.lineSeparator() +
				"directorName= " + directorName + System.lineSeparator() +
				"studio= " + studio + System.lineSeparator() +
				"userRating= " + userRating + System.lineSeparator();
	}
	
	
}

