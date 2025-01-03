/**
 * 
 */
package com.tnsif.multithreading.synchronization;

/**
 * @author Sagar
 *
 */
public class DepositLimitExceedsException extends Exception {
	public DepositLimitExceedsException() {
		
	}
	public DepositLimitExceedsException(String message) {
		super(message);
	}

}
