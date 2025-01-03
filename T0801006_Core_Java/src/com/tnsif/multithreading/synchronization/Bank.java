/**
 * 
 */
package com.tnsif.multithreading.synchronization;


public interface Bank {
	int MINBAL=5000; //fields are static and final
    int DAILY_LIMIT=25000;
	void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException; //public and abstract
}
