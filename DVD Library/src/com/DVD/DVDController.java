package com.DVD;
import java.util.ArrayList;
import java.util.List;

public class DVDController {
	
	private static DVDController instance = null;
	private List<DVD> allDVD = new ArrayList<DVD>();
	
	private DVDController() {
		
	}
	
	public static DVDController getInstance() {
		if(instance == null) {
			instance = new DVDController();
		}
		
		return instance;
	}
	
	private DVD getDVD(String title) {
		for(DVD dvd : allDVD) {
			if(dvd.getTitle() == title) {
				return dvd;
			}
		}
		return null;
	}
	
	private int getDVDIndex(String title) {
		int n = allDVD.size();
		for(int i = 0; i < n; ++i) {
			if(allDVD.get(i).getTitle() == title) {
				return i;
			}
		}
		return -1;
	}
	
	public void addDVD(String title, String releaseDate, int ratings, String directorName, String studio, List<String> userRatings) {
		
		DVD my_dvd = getDVD(title);
		
		if(my_dvd != null) {
			allDVD.add(new DVD(title, releaseDate, ratings, directorName, studio, userRatings));
		}
		else {
			System.out.println("Add DVD Error: Title already exist. Please pick another title.");
		}
	}
	
	public void addDVD(DVD dvd) {
		
		DVD my_dvd = getDVD(dvd.getTitle());
		
		if(my_dvd != null) {
			allDVD.add(dvd);
		}
		else {
			System.out.println("Add DVD Error: Title already exist. Please pick another title.");
		}
	}
	
	public void removeDVD(String title) {
		
		int n = getDVDIndex(title);
		
		if(n != -1) {
			allDVD.remove(n);
		}
	}
	
	public void removeDVD() {
		allDVD.remove(allDVD.size() -1);
	}
	
	public void updateDVDTitle(String title, String newTitle) {
		
	}
}
