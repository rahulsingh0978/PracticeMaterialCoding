package com.producerconsumer;

import java.util.Scanner;

public class Processor {
	public void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("this is producer block....");
			wait();
			System.out.println("resumed....");
		}
	}
	public void consumer() throws InterruptedException{
		Thread.sleep(2000);
		synchronized (this) {
			Scanner sc = new Scanner(System.in);
			System.out.println("the consumer...waiting for return key");
			sc.nextLine();
			System.out.println("returned key pressed, bnotify will be called");
			notify();
			Thread.sleep(5000);
			System.out.println("Rahul");
		}
		
	}
}
