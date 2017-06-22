package com.multithreading;

public class App3 {
	public static void main(String arg[]){
	Thread obj3 = new Thread(new Runnable(){
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
	});
	obj3.start();
	}
}
