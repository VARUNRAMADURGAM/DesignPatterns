package com.example.ds.prototypedesignpattern;

public class PrototypeDemo {
	public static void main (String args[]) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		System.out.println(bs);
		
		/* Creating one new book shop getting data again from load data method */
		BookShop bs1 = new BookShop();
		bs1.setShopName("A1");
		// bs1.loadData(); -->regular aapproach
		System.out.println(bs1);
		
		/* o override above problem we use cloning that is prototype design pattern */
		BookShop bs2 = (BookShop) bs.clone();
		bs1.setShopName("A1");
		// bs1.loadData(); -->regular aapproach
		System.out.println(bs2);
	}
}
