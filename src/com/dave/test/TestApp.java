package com.dave.test;

import com.dave.singleton.Printer;

public class TestApp {

	public static void main(String[] args) {
		
		Printer print1 = Printer.getInstance();
		Printer print2 = Printer.getInstance();
		
		System.out.println("hash Codes: "+print1.hashCode()+" "+print2.hashCode());
		System.out.println("print1=print2? "+(print1==print2));
	}
}
