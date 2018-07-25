                                                                                                package com.deloitte.sys;

public class SysArray {
	
	                                                                                                      
	public static void main(String[] args) {
		
		int[] a;
		a=new int[5];
		
		int[] b;
		b= new int[10];
		
		int[] c;
		c=new int[10];
		
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6;
		
		System.out.println("Arrray a");
		
		for(int i:a) {
			System.out.println(i);
			
		}
		
		
		System.out.println("array c");
		
		
		System.arraycopy(a, 0, c, 0, 5);
		
		for(int i:c) {
			System.out.println(i);
		}
		
		
		b=a.clone();
		
		System.out.println("Array b");
		
		for(int i:b) {
			System.out.println(i);
		}
		
	}
	
	

}
