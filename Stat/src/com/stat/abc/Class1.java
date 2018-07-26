package com.stat.abc;

public class Class1 {
	
	static int num;
	static int x,y;
	
	static 
	{
		num=4;
		System.out.println("SI");
	}
	{
		System.out.println("AI");
	}
	
	


public Class1(int x, int y) {
	this.x=x;
	this.y=y;
	
	System.out.println("Constructor");
	}

@Override
public String toString() {
	
	return x+","+y;
}

@Override
public boolean equals(Object obj) {
	
	if(obj!=null)
	{
		
		if(obj instanceof Class1) {
			Class1 c=(Class1)obj;
		if(x==c.x && y==c.y)
			return true;
		}
	}
	
	return false;
			
}


}

