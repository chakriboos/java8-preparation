package com.javaindepth.threads;

public class FirstThread {

	public static void main(String[] args) throws InterruptedException {
		
		var unit = 1602;
		
		// Create task
		Task task1 = new Task();

		// Create a thread
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Thread.sleep(3000);
		
		thread1.start();
		
		System.out.println("Inside main method");

	}

}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run method");
		go();
	}

	private void go() {
		System.out.println("Inside go method");
		more();
	}

	private void more() {
		System.out.println("Inside more method");

	}

}
