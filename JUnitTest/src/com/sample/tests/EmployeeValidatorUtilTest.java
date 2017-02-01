package com.sample.tests;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.util.EmployeeValidatorUtil;
import com.sample.vo.Employee;

public class EmployeeValidatorUtilTest {
	private static Employee emp;

	@BeforeClass
	public static void setup() {
		emp = new Employee();
	}

	@Test
	public void testIfEmailValidationIsOK() {
		emp.setEmail("notAValidEmail");
		assertFalse(EmployeeValidatorUtil.isValid(emp));
		emp.setEmail("validEmail@email.com");
		assertTrue(EmployeeValidatorUtil.isValid(emp));
	}
}
