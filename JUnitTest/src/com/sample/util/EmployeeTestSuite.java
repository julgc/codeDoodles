package com.sample.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sample.tests.EmployeeSalaryManagerTest;
import com.sample.tests.EmployeeValidatorUtilTest;

@RunWith(Suite.class)
@SuiteClasses({ EmployeeSalaryManagerTest.class,
		EmployeeValidatorUtilTest.class, })
public class EmployeeTestSuite {

}
