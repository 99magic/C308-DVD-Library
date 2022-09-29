package com.dvd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dvd.Dvd;
import com.dvdlibrary.DvdLibrary;

@Component(value ="dvdLibraryController")
public class DvdLibraryController {
	
	@Autowired
	private DvdLibrary dvdLibrary;
	
	////////////////////////
//	Allow the user to add a DVD to the collection
//	Allow the user to remove a DVD from the collection
//	Allow the user to edit the information for an existing DVD in the collection
//	Allow the user to list the DVDs in the collection
//	Allow the user to display the information for a particular DVD
//	Allow the user to search for a DVD by title
//	Load the DVD library from a file
//	Save the DVD library back to the file when the program completes
//	Allow the user to add, edit, or delete many DVDs in one session
	
	
	public void editDvdTitle(String newData, String title) {
		dvdLibrary.editDvdTitle(newData, title);
	}
	
	public void editDvdReleaseDate(String newData, String title) {
		dvdLibrary.editDvdReleaseDate(newData, title);
	}
	
	public void editDvdMpaaRating(int newData, String title) {
		dvdLibrary.editDvdMpaaRating(newData, title);
	}
	
	public void editDvdDirectorName(String newData, String title) {
		dvdLibrary.editDvdDirectorName(newData, title);
	}
	
	public void editDvdStudio(String newData, String title) {
		dvdLibrary.editDvdStudio(newData, title);
	}
	
	public void addDvd(String title, String releaseDate, int mpaaRating, String directorName, String studio, String userRatings) {
		dvdLibrary.addDvd(title, releaseDate, mpaaRating, directorName, studio, userRatings);
	}
	
	public void editDvdUserRating(String newData, String title) {
		dvdLibrary.editDvdUserRating(newData, title);
	}
	
	public Dvd getDvd(String title) {
		return dvdLibrary.getDvd(title);
	}
	
	public void removeDvd(String title) {
		dvdLibrary.removeDvd(title);
	}
	
	public void saveDvdLibrary(String title) {
		dvdLibrary.saveDvdLibrary(title);
	}
	
	public void loadDvdLibrary(String title) {
		dvdLibrary.loadDvdLibrary(title);
	}
}
