package com.deloitte;

public class Division extends Arithmetic {


	public Division(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);

		 }
	@Override
	public int calculate() {
		int c;
		c=0;
		
			try {
				c=(int)num1/num2;
				return c;
				}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
			
		}
			return 0;
		
		}
		
}
