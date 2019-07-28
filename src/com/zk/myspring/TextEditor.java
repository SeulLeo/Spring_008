package com.zk.myspring;

public class TextEditor {
	private SpellChecker spellchecker;
	
	public TextEditor(SpellChecker spellchecker){
		System.out.println("Inside TextEditor constructor");
		this.spellchecker=spellchecker;
	}
	
	public void spellCheck(){
		spellchecker.checkSpelling();
	}
}
