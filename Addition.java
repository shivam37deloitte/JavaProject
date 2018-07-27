package com.deloitte;

public class Addition extends Arithmetic {
	
	public Addition(int num1, int num2) {
		  setNum1(num1);
		  setNum2(num2);

		 }
	

	@Override
	public int calculate() {
		
		return num1+ num2;
	}
	
	
	
	
	

}
