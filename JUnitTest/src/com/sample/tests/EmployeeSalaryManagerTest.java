package com.sample.tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.util.EmployeeSalaryManager;
import com.sample.vo.Employee;

public class EmployeeSalaryManagerTest {
	private static Employee emp;

	@BeforeClass
	public static void setup() {
		emp = new Employee();
	}

	@Test
	public void testIfEmailValidationIsOK() {
		emp.setSalary(5);
		emp.setSalary(EmployeeSalaryManager.increateSalByThousand(emp.getSalary()));
		assertEquals(1005, emp.getSalary());
		emp.setSalary(EmployeeSalaryManager.increateSal(emp.getSalary(),95));
		assertEquals(1100, emp.getSalary());
	}
}
