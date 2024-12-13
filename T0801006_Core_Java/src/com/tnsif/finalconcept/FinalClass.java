/**
 * 
 */
package com.tnsif.finalconcept;

/**
 * @author Sagar
 *
 */
 public final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes

/* class FinalChildClass extends FinalClass { } */
 
