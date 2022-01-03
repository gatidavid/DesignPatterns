package com.dave.singleton;

/*
 * Singleton Object Creation Best Solution 1
 * */
public class PrinterSingletonBlockDoubleNullCheck {

private static PrinterSingletonBlockDoubleNullCheck INSTANCE;
	
	private PrinterSingletonBlockDoubleNullCheck() {
		
	}
	
	public static PrinterSingletonBlockDoubleNullCheck getInstance() {
		
		if(INSTANCE ==null) {
			
		synchronized (PrinterSingletonBlockDoubleNullCheck.class) {
			if(INSTANCE== null)
				INSTANCE = new PrinterSingletonBlockDoubleNullCheck();	
		}
		
	}
		return INSTANCE;
	}
}
