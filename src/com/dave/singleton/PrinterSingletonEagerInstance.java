package com.dave.singleton;

public class PrinterSingletonEagerInstance {

	private static PrinterSingletonEagerInstance INSTANCE = new PrinterSingletonEagerInstance();
	private PrinterSingletonEagerInstance() {
		
	}
	public static PrinterSingletonEagerInstance getInstance() {
		return INSTANCE;
	}

}
