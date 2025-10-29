package com.basic;

public class ThreadExmple {

	public static void main(String[] args) {

		NewTh obj = new NewTh(5);

		Thread t1 = new Thread(obj, "Thread-A");
		Thread t2 = new Thread(obj, "Thread B");
		t1.start();
		t2.start();

	}

}

class NewTh implements Runnable {

	private int limit;

	public NewTh(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {

		for (int i = 1; i <= limit; i++) {

			System.out.println(Thread.currentThread().getName() + " -> " + i);

		}

	}

}