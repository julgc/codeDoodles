package com.sample;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;

public class ThreadViaRunnable implements Runnable {
	private String name;

	public ThreadViaRunnable(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadViaRunnable("t1"));
		Thread t2 = new Thread(new ThreadViaRunnable("t2"));
		Thread t3 = new Thread(new ThreadViaRunnable("t3"));
		Thread t4 = new Thread(new ThreadViaRunnable("t4"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

	@Override
	public void run() {

			LongStream randomStream = (new Random()).longs(1, 20);
			long random = randomStream.findAny().getAsLong();
			try {
				System.out.println(name+" start");
				TimeUnit.SECONDS.sleep(random);
				System.out.println(name+" end");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

	}

}
