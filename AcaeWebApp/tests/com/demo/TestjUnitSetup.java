package com.demo;

import junit.framework.TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestjUnitSetup extends TestCase {

	private static final Logger logger = LogManager.getLogger(TestjUnitSetup.class);

	public void testSetup() {
		try {
			logger.info("Able to Log");
		} catch (Exception e) {
			logger.info("Error in Logging check project configurations");
			fail();
		}
	}
}
