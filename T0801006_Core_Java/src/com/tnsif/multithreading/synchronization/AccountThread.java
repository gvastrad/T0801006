/**
 * 
 */
package com.tnsif.multithreading.synchronization;

/**
 * @author Sagar
 *
 */
public class AccountThread extends Thread {
	private Account acc;
	private int amt;
	
	
	public AccountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}


	@Override
	public void run()
	{
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}

}
