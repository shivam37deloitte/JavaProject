package com.deloitte.java;

public class Address {
	
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	private int id;
	
	
	
public Address(String n, String s, String c, String st, String cd, int i) {
		// TODO Auto-generated constructor stub
	
	name=n;
	street=s;
	city=c;
	state=st;
	code=cd;
	id=i;
	}


public String toString() {
	return name + "\n"+ street+ "\n"+ city +" " + state + " " + code; 
}
 
@Override
public boolean equals(Object obj) {

	if(obj !=null) {
		if(obj instanceof Address) {
			 Address add = (Address)obj;
			if(name==add.name && street==add.street && city==add.city && state==add.state  && code==add.code && id==add.id) {
				return true;
			}
		}
	}
	return false;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return id;
}
	
	
}


