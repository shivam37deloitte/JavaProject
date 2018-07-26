package com.deloitte.java;



import java.util.LinkedList;

public class Act {
	
	
	public static void main(String[] args) {
		
	
	
LinkedList<String> result=new LinkedList<String>();
	
	result.add("B");
	result.add("E");
	result.add("D");
	result.add("X");
	result.add("Y");
	result.addLast("Z");
	result.addFirst("A");
	
	System.out.println("Original contents of result:"+ result);
	
	
	result.remove("F");
	result.remove(2);
	
	System.out.println("Contents of result after deletion:" +result);
	
	result.removeFirst();
	result.removeLast();
	
	System.out.println("Contents of result after deleting first and last:" +result);
	
	
	
	
	
	
	

}
}