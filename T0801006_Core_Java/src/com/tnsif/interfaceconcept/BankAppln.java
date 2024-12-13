/**
 * 
 */
package com.tnsif.interfaceconcept;

/**
 * @author Sagar
 *
 */
public class BankAppln {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank =new BankImpl();
		  // Create an Account
	   Account account=new Account(123456, "Mihir", 155000, bank);
        account.getBank().deposite(account,2000);
	    System.out.println(account);
	}

}
