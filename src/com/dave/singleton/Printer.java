package com.dave.singleton;

/* 
 * Bare Minimum Singleton Class
 * */
public class Printer {

	private static Printer INSTANCE;
	
	private Printer() {}
	
	public static Printer getInstance(){
		if(INSTANCE ==null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	public void printPreview() {
		System.out.println("Showing print preview");
	}
	}
