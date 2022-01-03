package com.dave.singleton;

/*
 * Singleton Object creation best solution 2
 * */
public class PrinterSingletonInnerClazEagerInstance {

	
	private PrinterSingletonInnerClazEagerInstance() {
		
	}

	private static class PrinterInnerClass{	
		private static PrinterSingletonInnerClazEagerInstance INSTANCE = new PrinterSingletonInnerClazEagerInstance();
	}
	
	public static PrinterSingletonInnerClazEagerInstance getInstance() {
		return PrinterInnerClass.INSTANCE;
	}
}
