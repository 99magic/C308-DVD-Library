package com.dvdlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;


import com.dvd.Dvd;

enum DvdEditType{
	TITLE,
	RELEASEDATE,
	DIRECTOR,
	STUDIO,
	USERRATING
};

public class DvdLibrary {
	
	private List<Dvd> allDvd = new ArrayList<Dvd>();
	static final private String DVDLIBRARY_DATA = "DefaultDvdLibraryData";
	private int dvdCount = 1;
	
	public DvdLibrary() {
		
	}
	
	public void loadDvdLibrary(String file) {
		
		try {
			FileInputStream fis = new FileInputStream(file + ".ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			allDvd = (ArrayList) ois.readObject();
			//System.out.println(allDvd);
			
			if(fis != null) {
				fis.close();
			}
			
			if(ois != null) {
				ois.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void saveDvdLibrary(String file) {
		
		try 
		{
			FileOutputStream fos = new FileOutputStream(file + ".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(allDvd);
			
			if(fos != null) {
				fos.close();
			}
			
			if(oos != null) {
				oos.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	private void editDvd(String newData, String title, DvdEditType editType) {
		
		for(Dvd myDvd : allDvd) {
			if(myDvd.getTitle().equals(title)) {
				
				switch(editType) {
					case TITLE:
						myDvd.setTitle(newData);
						return;
						
					case RELEASEDATE:
						myDvd.setReleaseDate(newData);;
						return;
						
					case DIRECTOR:
						myDvd.setDirectorName(newData);;
						return;
						
					case STUDIO:
						myDvd.setStudio(newData);
						return;
						
					case USERRATING:
						myDvd.setUserRating(newData);
						return;
				}
			}
		}
		
		System.out.println("EditDvdDataError: " + title + " cannot be found in Dvd Library");
	}
	
	public void editDvdTitle(String newData, String title) {
		editDvd(newData, title, DvdEditType.TITLE);
	}
	
	public void editDvdReleaseDate(String newData, String title) {
		editDvd(newData, title, DvdEditType.RELEASEDATE);
	}
	
	public void editDvdMpaaRating(int newData, String title) {
		for(Dvd myDvd : allDvd) {
			if(myDvd.getTitle().equals(title)) {
				myDvd.setMpaaRating(newData);
				return;
			}
		}
		
		System.out.println("EditDvdDataError: " + title + " cannot be found in Dvd Library");
	}
	
	public void editDvdDirectorName(String newData, String title) {
		editDvd(newData, title, DvdEditType.DIRECTOR);
	}
	
	public void editDvdStudio(String newData, String title) {
		editDvd(newData, title, DvdEditType.STUDIO);
	}
	
	public void editDvdUserRating(String newData, String title) {
		editDvd(newData, title, DvdEditType.USERRATING);
	}
	
	public void addDvd(String title, String releaseDate, int mpaaRating, String directorName, String studio, String userRating) {
		Dvd dvd = new Dvd(title, releaseDate, mpaaRating, directorName, studio, userRating);
		allDvd.add(dvd);
	}
	
	public Dvd getDvd(String title) {
		for(Dvd myDvd : allDvd) {
			if(myDvd.getTitle().equals(title)) {
				return myDvd;
			}
		}
		System.out.println("GetDvdError: " + title + " cannot be found in Dvd Library");
		return null;
	}
	
	public void removeDvd(String title) {
		
		Iterator<Dvd> iter = allDvd.iterator();
		
		while(iter.hasNext()) {
			Dvd dvd = iter.next();
			if(dvd.getTitle().equals(title)) {
				iter.remove();
				System.out.println("'" + title + "'" + " has been removed from the Dvd Library");
				return;
			}
		}

		System.out.println("RemoveDvdError: " + title + " cannot be found in Dvd Library");
	}
	
	public void printDvdLibraryData() {
		for(Dvd myDvd : allDvd) {
			System.out.println("Dvd #" + dvdCount);
			System.out.println(myDvd);
			dvdCount++;
		}
		dvdCount = 1;
	}
	
	public void printDvdData(String title) {
		for(Dvd myDvd : allDvd) {
			if(myDvd.getTitle().equals(title)) {
				System.out.println(myDvd);
				return;
			}
		}
		
		System.out.println("PrintDvdDataError: " + title + " cannot be found in Dvd Library");
	}
	
	public void doDestroy() {
		saveDvdLibrary(DVDLIBRARY_DATA);
	}
}
