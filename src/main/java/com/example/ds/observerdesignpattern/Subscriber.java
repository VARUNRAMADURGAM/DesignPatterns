package com.example.ds.observerdesignpattern;

public class Subscriber {

	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void update() {
		System.out.println("Hey " + name + " Video Uploaded : " + channel.title);
	}
	public void SubscriberChannel(Channel ch) {
		channel = ch;
	}
}
