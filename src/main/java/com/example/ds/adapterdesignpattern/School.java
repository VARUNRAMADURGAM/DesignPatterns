package com.example.ds.adapterdesignpattern;

public class School {
	 public static void main(String args[]) {
		 Pen p = new PenAdapter();
		 AssignmentWork aw =new AssignmentWork();
		 aw.setP(p);
		 aw.writeAssignment("I am tired");
		 
		 /* youtube video for reference other than telusko */
		 /* https://www.youtube.com/watch?v=eR22JuwTa54 */
	 }
}
