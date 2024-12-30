/**
 * 
 */
package com.tnsif.multithreading;

/**
 * @author Sagar
 *
 */
public class ChildThread extends Thread {
     private int n;
     private String msg;
     
     public ChildThread(int n, String msg) {
 		this.n = n;
 		this.msg = msg;
     }
	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName());
			
		}
	}
}
