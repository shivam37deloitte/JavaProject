package com.deloitte.cui;

import com.deloitte.livingbeings.Man;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Man man1;
	man1 = new Man();
	
	man1.leftEye.color="Blue";
	man1.leftEye.power=1.5f;
	man1.leftEye.iris="large";
	
	man1.rightEye.color="green";
	man1.rightEye.power = 2.5f;
	man1.rightEye.iris = "large";
	
	System.out.println("the left eye color is" + " " + man1.leftEye.color);
	System.out.println("the left eye power is" + " " + man1.leftEye.power);
	
	System.out.println("the right eye color is" + " " + man1.rightEye.color);
	System.out.println("the right eye color is" + " " + man1.rightEye.power);
	}

}
