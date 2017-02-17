package com.test;

import org.apache.log4j.Logger;

public class MyClass {

	private static final Logger logger=Logger.getLogger(MyClass.class);
	public static void main(String[] args) {
		logger.info("this is an info");
		try {
			throw new Exception("Error Intentionally Thrown");
		} catch (Exception e) {
			logger.error("this is an ERROR",e);
		}
	}

}
