package com.multithread2;

import java.util.Scanner;

class App2 extends Thread{
	private
	volatile boolean threadTimer = true;
	@Override
	public void run(){
		while(threadTimer){
		System.out.println("Hello");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void stopRunning(){
		threadTimer = false;
	}
}

public class ThreadSync1 {
	public static void main(String arg[]){
	App2 obj = new App2();
	obj.start();
	
	System.out.println("Enter any key to continue");
	Scanner sc = new Scanner(System.in);
	sc.nextLine();
	
	obj.stopRunning();
	}
}
