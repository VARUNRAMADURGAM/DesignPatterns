package com.example.ds.builderdesignpattern;

public class Shop {

	public static void main(String args[]) {
		Phone p = new Phone("Android",2,"Qualcomm",5.5,4000);
		System.out.println(p);
		
		/* problem in the above approach is that you need to 
		 * 1.pass all the values to the constructor even if we dont need it
		 * 2.sequence matters
		 */
		
		/* to avoid the above mentioned problem we use Builder design pattern */
		
		Phone p1 = new PhoneBuilder().setOs("Andriod").setBattery(4500).getPhone();
		System.out.println(p1);
		
	}
}
