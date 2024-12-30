/**
 * 
 */
package com.tnsif.multithreading;

/**
 * @author Sagar
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChildThread thread1=new ChildThread(10,"First");
		ChildThread thread2=new ChildThread(20,"Second");
		
		thread1.start();
		//thread1.start();
		thread2.start();
		try {
		thread1.join();
		thread2.join();
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		System.out.println("-----------------------End of Main--------------------------");
	}

}
