package com.multithread2;

public class App implements Runnable {
	public void run(){
	for(int i =0;i<10;i++){
		System.out.println("thread number"+i);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}
}
class runner {
	public static void main(String arg[]){
		Thread obj = new Thread(new App());
		obj.start();
		Thread obj2 = new Thread(new App());
		obj2.start();
	}
}
