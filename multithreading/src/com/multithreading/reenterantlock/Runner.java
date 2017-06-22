package com.multithreading.reenterantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 1000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("Waition...");
		condition.await();
		System.out.println("Awaken....");
		try {
			increment(); // if code throws exception then deadlock
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();
		System.out.println("press the return key..");
		new Scanner(System.in).nextLine();
		System.out.println("got the return key....");
		
		condition.signal();	
		lock.unlock();
		try {
			increment(); // if code throws exception then deadlock
		} finally {
			//
		}
	}

	public void finished() {
		System.out.println("count is " + count);
	}
}
