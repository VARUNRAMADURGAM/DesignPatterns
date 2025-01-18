package com.example.ds.factorydesignpattern;

public class OperatingSystemFactory {

	public Os getInstance(String phone) {
		if(phone.equals("Open")) {
			return new Andriod();
		}else if(phone.equals("Closed")) {
			return new Ios();
		}else {
			return new Windows();
		}
	}
}
