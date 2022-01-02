package com.dave.singleton;

/* 
 * Bare Minimum Singleton Class
 * */
public class PrinterSynchronizedMethod {

	private static PrinterSynchronizedMethod INSTANCE;
	
	private PrinterSynchronizedMethod() {}
	
	public static synchronized PrinterSynchronizedMethod getInstance(){
		if(INSTANCE ==null)
			INSTANCE = new PrinterSynchronizedMethod();
		return INSTANCE;
	}
	public void printPreview() {
		System.out.println("Showing print preview");
	}
	}
