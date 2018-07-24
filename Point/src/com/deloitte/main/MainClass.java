package com.deloitte.main;

public class MainClass {

	public static void main(String[] args) {
		
		Point p1, p2, p3;
		p1 = new Point();
		
		p1.x=10;
		p1.y=20;
		
		System.out.println("BEGIN");
		System.out.println( p1.x + " " + p1.y);
		
		p2=p1;
		
		System.out.println( p2.x + " " + p2.y);
		p1.x=55;
		p1.y=77;
		
		System.out.println( p1.x + " " + p1.y);
		System.out.println( p2.x + " " + p2.y);
		
		System.out.println("Address of p1: " + p1);
		System.out.println("Address of p2: " + p2);
		
		p2 = new Point();
		p2.x=60;
		p2.y=70;
		
		System.out.println(p2.x + " " + p2.y);
		System.out.println(p1.x + " " + p1.y);
		
		System.out.println("Address of p1: " + p1);
		System.out.println("Address of p2: " + p2);
		
		p3 = p2;
		System.out.println(p3.x + " " + p3.y);
		System.out.println("Address of p3: " + p3);
		  
		System.out.println("END");

	}

}
