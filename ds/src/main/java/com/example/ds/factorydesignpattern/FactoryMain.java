package com.example.ds.factorydesignpattern;

public class FactoryMain {
	public static void main(String args[]) {
//		Os obj = new Andriod();
//		obj.spec();
//		Os obj1 = new Windows();
//		obj1.spec();
//		Os obj2 = new Ios();
//		obj2.spec();
		
		/* this is the problem with normal implementation 
		 * where you need to expose all the class names to client */
		
		/* To avoid this we will implement the factory design pattern */
		
		OperatingSystemFactory asf = new OperatingSystemFactory();
		Os obj = asf.getInstance("Abcd");
		obj.spec();
	}
}
