/**
 * 
 */
package com.tnsif.inheritance.miltilevel;

/**
 * @author Sagar
 *
 */
public class MLInheritanceDemo {

	/**
	 * executor methods
	 */
	public static void main(String[] args) {
		Word word=new Word();
		System.out.println("Is text in Wordpad bold? " + word.isBold());
		word.write("Welcome to Java"+"");
		word.formatText(true);
		word.write("coding");
		word.displayContent();
        word.enableSpellCheck(true);
        
        System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		System.out.println(word.content);
	}
}
