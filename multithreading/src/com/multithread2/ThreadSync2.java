package com.multithread2;

public class ThreadSync2 {
	private int count = 0;
	public static void main(String arg[]){
		ThreadSync2 obj = new ThreadSync2();
		obj.work();
	}
	public synchronized void incrementCount(){
		count++;
	}
	public void work(){
		Thread th1 = new Thread(new Runnable(){
			@Override
			public void run(){
			for(int i =0;i<10000;i++){
				incrementCount();
			}
		}
		});
		Thread th2 = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i =0;i<10000;i++){
					incrementCount();
				}	
			}
		});
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread count is   "+count);
	}
}
