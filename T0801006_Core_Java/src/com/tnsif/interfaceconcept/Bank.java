/**
 * 
 */
package com.tnsif.interfaceconcept;

/**
 * @author Sagar
 *
 */
public interface Bank {

	 double MIN_BALANCE = 1000;
	 double DEPOSIT_LIMIT = 25000;
	 double INTEREST_RATE = 7.8;
	 
	 void withdraw(Account a, double amt);
	 void deposite(Account a,double amt); 
}
