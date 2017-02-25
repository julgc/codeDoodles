package com.sample.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmployeeSalaryManagerTest.class,
		EmployeeValidatorUtilTest.class, })
public class EmployeeTestSuite {

}
