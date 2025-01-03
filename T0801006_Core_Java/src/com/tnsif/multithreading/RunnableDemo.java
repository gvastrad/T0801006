/**
 * 
 */
package com.tnsif.multithreading;

/**
 * @author Sagar
 *
 */
public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj=new UsingRunnable(10,20,"Thread1");

		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		
			
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		
		// lambda expression
				runnable = () -> { 
					System.out.println("Runnable with Lambda Expression");
				};
				
				new Thread(runnable).start();
	}

}
