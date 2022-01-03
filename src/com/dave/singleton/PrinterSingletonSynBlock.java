package com.dave.singleton;

public class PrinterSingletonSynBlock {

	private static PrinterSingletonSynBlock INSTANCE;
	
	private PrinterSingletonSynBlock() {
		
	}
	
	public static PrinterSingletonSynBlock getInstance() {
		
		synchronized (PrinterSingletonSynBlock.class) {
			if(INSTANCE== null)
				INSTANCE = new PrinterSingletonSynBlock();	
		}
		return INSTANCE;
	}
}
