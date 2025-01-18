package com.example.ds.compositedesignpattern;

public class CompositeTest {

	public static void main(String args[]) {
		Component hd = new Leaf((4000),"HardDrive");
		Component mouse = new Leaf((3000),"mouse");
		Component monitor = new Leaf((6000),"monitor");
		Component hdRam = new Leaf((9000),"Ram");
		
		Composite ph = new Composite("Pheripheral");
		Composite cab = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(hdRam);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cab.addComponent(hd);
		cab.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cab);
		
		ph.showPrice();
		computer.showPrice();
	}
}
