package com.java.abc;

import com.java.abc.Derived;

public class Factory {
	
	public Derived createInstance() {
		
		return new Derived(7);   
	}

}
