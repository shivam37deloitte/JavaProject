package com.deloitte;

public class Substraction extends Arithmetic {

	
	public Substraction(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		 }
	@Override
	public int calculate() {
		if(num1>num2)
			return (num1-num2);
		else if(num2>num1)
				return (num2-num1);
		else
			return 0;
	}

}
