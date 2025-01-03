/**
 * 
 */
package com.tnsif.multithreading.synchronization;

/**
 * @author Sagar
 *
 */
public class SynchronizationDemo {
	public static void main(String[] args) {
		Account acc = new Account(101, "Amit", 50000);
		
	/*	AccountThread thread[] = new AccountThread[5];
		for (int i = 0; i < 5; i++) {
			thread[i] = new AccountThread(acc, 1000 * (i + 1));
			try {
				thread[i].join(); // waits main thread till execution of all child thread finish
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}*/
		AccountThread thread1=new AccountThread(acc,1000);
		AccountThread thread2=new AccountThread(acc,2000);
		AccountThread thread3=new AccountThread(acc,3000);
		AccountThread thread4=new AccountThread(acc,4000);
	
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	
		System.out.println("--------------------------------------------------------");
		System.out.println(acc);
}
}
