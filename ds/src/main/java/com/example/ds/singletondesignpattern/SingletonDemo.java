package com.example.ds.singletondesignpattern;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj1 = Abc.getInstance();
		//Abc obj2 = new Abc(); --> it will fail because my constructor is private
		Abc obj2 = Abc.getInstance();
		if(obj1==obj2){
			System.out.println("Object equal");// that means both the objects are poiting to same object
		}
	}
}
class Abc {
	static Abc obj = new Abc();
	private Abc() {
		
	}
	public static Abc getInstance()
	{
		return obj;
	}
}