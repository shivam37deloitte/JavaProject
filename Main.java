package com.deloitte;


public class Main {

	public static void main(String[] args) {
		int []a;int b;
		
		b=Integer.parseInt(args[0]);
		a=new int[b];
		for(int i=0;i<b;i++) {
			a[i]=Integer.parseInt(args[i+1]);
		}
		
		System.out.println( UserMainCode.checkTripplets(a));
	}

}
