package com.deloitte.livingbeings;

import com.deloitte.livingbeings.organs.Eye;

public class Human extends Mammals {
	public HumanEye leftEye,rightEye; //fields
	
	public Human(){
		leftEye = new HumanEye(); 
		rightEye = new HumanEye();
		
	}
	
	public class HumanEye extends Eye{
		
		public String iris;
	}
}
