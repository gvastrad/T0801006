package com.tnsif.inheritance.miltilevel;

public class NotePad {
	
	protected String content;

	public NotePad() {
		this.content="";
	}
	
	public void write(String content) {
		this.content+=content;
	}

	public String displayContent() {
		return content;
		
	}
}
