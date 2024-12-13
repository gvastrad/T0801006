/**
 * 
 */
package com.tnsif.interfaceconcept;

/**
 * @author Sagar
 *
 */
public class BankImpl implements Bank {

	@Override
	public void withdraw(Account a, double amt) {
	
		
	}

	@Override
	public void deposite(Account a, double amt) {
		if(amt>DEPOSIT_LIMIT) {
			System.err.println("Deposite limit exceeds");}
			else {
				a.setBalance(a.getBalance()+amt);}
			 System.out.println("Deposited " + amt + " into account: " + a.getAccNo());
				
		}
		
	}


