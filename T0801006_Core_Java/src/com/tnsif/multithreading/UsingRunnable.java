/**
 * 
 */
package com.tnsif.multithreading;

/**
 * @author Sagar
 *
 */
public class UsingRunnable implements Runnable {

	 private int low, high;
	 String msg;
	 Thread t;
	
	public UsingRunnable(int low, int high, String msg) {
		super();
		this.low = low;
		this.high = high;
		this.msg = msg;
		t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for (int i = low; i <= high; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}

}
