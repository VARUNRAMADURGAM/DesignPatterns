package com.example.ds.observerdesignpattern;

public class Youtube {

	public static void main(String[] args) {
		Channel telusko = new Channel();
		Subscriber s1 = new Subscriber("Abc");
		Subscriber s2 = new Subscriber("Def");
		Subscriber s3 = new Subscriber("Ghi");
		
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		
		telusko.unsubscriber(s3);
		
		s1.SubscriberChannel(telusko);
		s2.SubscriberChannel(telusko);
		s3.SubscriberChannel(telusko);
		
		telusko.upload("How to run a program");
	}

}
