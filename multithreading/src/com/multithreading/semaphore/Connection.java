package com.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = new Connection();
	private int connections = 0;
	private Semaphore sem = new Semaphore(10,true); //whichever thread acquires the loc qill get the first permit

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			goConnect();
		} finally {
			sem.release();
		}
	}

	public void goConnect() {

		synchronized (this) {
			connections++;
			System.out.println("current connection is " + connections);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			connections--;
			// System.out.println("current connection is " + connections);
		}

	}

}
