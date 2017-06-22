package com.multithread.threadinterrupt;

import java.util.Random;

public class App {
	public static void main(String arg[]) throws InterruptedException {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				Random ran = new Random();
				for (int i = 0; i < 1E6; i++) {
					/*
					 * if(Thread.currentThread().isInterrupted()){
					 * System.out.println("Thread interrupted"); break; }
					 */
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Thread Interrupted");
						break;
					}
					Math.sin(ran.nextDouble());
				}
			}
		});
		th.run();

		System.out.println("Thread Started..");
		Thread.sleep(500);
		th.interrupt();
		th.join();

		System.out.println("Thread stopped..");
	}

}
