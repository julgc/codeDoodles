package com.sample;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;

public class ThreadViaThread extends Thread {
	
	private String name;

	public ThreadViaThread(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {

		Thread t1 = new ThreadViaThread("t1");
		Thread t2 = new ThreadViaThread("t2");
		Thread t3 = new ThreadViaThread("t3");
		Thread t4 = new ThreadViaThread("t4");
		
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
