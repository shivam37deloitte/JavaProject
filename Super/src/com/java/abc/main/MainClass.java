package com.java.abc.main;

import static javax.swing.JOptionPane.*;

import com.java.abc.Derived;
import com.java.abc.Factory;

public class MainClass {
	
	private static final Derived NULL = null;
	private static final int INFORMATION_MESAGE = 0;
	private static final int ERROR_MESSAGE = 0;

	public static void main(String[] args) {
		
		showMessageDialog(null, "hello","greetings", ERROR_MESSAGE);
		
		
		
		new Factory().createInstance().test();
	}

}
