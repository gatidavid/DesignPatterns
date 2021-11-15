package com.dave.creational;



class SingletonEager {
	private static SingletonEager instance = new SingletonEager();
	private SingletonEager() {
	}
	public static SingletonEager getInstance() {	
		return instance;
		
	}	
}

class SingletonLazy{
	private static SingletonLazy instance;
	private SingletonLazy() {}
	
	public static SingletonLazy getInstance() {
		if(instance == null) {
		 instance = new SingletonLazy();
		}
		return instance;
	}
}

class SingletonSynchronizedMethod{
	private static SingletonSynchronizedMethod instance;
	private SingletonSynchronizedMethod() {}
	
	public static synchronized SingletonSynchronizedMethod getInstance(){
		if(instance == null) {
			instance = new SingletonSynchronizedMethod();
		}
		
		return instance;
	}
}

class SingletonSynchonizedBlock{
	private static SingletonSynchonizedBlock instance;
	private SingletonSynchonizedBlock() {}
	
	public static SingletonSynchonizedBlock getInstance() {
		if(instance ==null) {
			synchronized (SingletonSynchonizedBlock.class) {
				if(instance == null) {
					instance = new SingletonSynchonizedBlock();
				}
				
			}
		}
		return instance;
	}
}
public class Singleton{
	
public static void main(String[] args) {
		
	//Eager Initialisation of Singleton Design Pattern
	/*
	 * SingletonEager singletonEager = SingletonEager.getInstance();
	 * System.out.println(singletonEager);
	 * 
	 * SingletonEager singletonEager1 = SingletonEager.getInstance();
	 * System.out.println(singletonEager1);
	 */
	
	//Lazy Initialisation of Singleton Design Pattern
	/*
	 * SingletonLazy singletonLazy = SingletonLazy.getInstance();
	 * System.out.println(singletonLazy);
	 * 
	 * SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
	 * System.out.println(singletonLazy1);
	 */
	
	//Eager Initialisation of Singleton Design Pattern
	
	  SingletonSynchronizedMethod singleton = SingletonSynchronizedMethod.getInstance();
	  System.out.println(singleton);
	  
	  SingletonSynchronizedMethod singleton1 = SingletonSynchronizedMethod.getInstance();
	  System.out.println(singleton1);
	 
	}
	
}