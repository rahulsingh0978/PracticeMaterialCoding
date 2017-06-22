package com.multithreading;

import java.net.NetworkInterface;

public class Thread1 extends Thread{
	@Override
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
class Runner{
	public static void main(String arg[]){
		Thread1 threadObj = new Thread1();
		threadObj.run();
		Thread1 threadObj2 = new Thread1();
		threadObj2.run();
	}
}
