package com.tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import junit.framework.TestCase;

import com.demo.Index;
import com.opensymphony.xwork2.ActionSupport;

public class IndexTest extends TestCase{
	private static final Logger logger = LogManager.getLogger(IndexTest.class);
	public void testIndex(){
        try {
			Index index = new Index();
			String result = index.execute();
			assertEquals(ActionSupport.SUCCESS, result);
			logger.info("Index.action OK");
		} catch (Exception e) {
			logger.error("fail",e);
			fail();
		}
	}
}
