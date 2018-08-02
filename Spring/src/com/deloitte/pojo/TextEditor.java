package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor() {
		System.out.println("TextEditor default constructor");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("inside textEditor constructor");
		this.spellChecker= spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void getName() {
		System.out.println("name:"+ name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
