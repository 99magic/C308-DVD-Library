package com.dvd.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dvd.Dvd;
import com.dvdlibrary.DvdLibrary;

@Component(value ="dvdLibraryView")
public class DvdLibraryView {
	
	@Autowired
	private DvdLibrary dvdLibrary;
	
	public void printDvdLibraryData() {
		dvdLibrary.printDvdLibraryData();
	}
	
	public void printDvdData(String title) {
		dvdLibrary.printDvdData(title);
	}
}
