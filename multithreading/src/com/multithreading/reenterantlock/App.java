package com.multithreading.reenterantlock;

public class App {
	public static void main(String arg[]) throws InterruptedException{
		Runner runner = new Runner();
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		runner.finished();
		
	}
}
