package com.multithread.lowlevelsync;

public class App {
	public static void main(String arg[]) throws InterruptedException{
		final Processor process = new Processor();
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					process.producer();
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
					process.consumer();
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
		
		
	}
}
