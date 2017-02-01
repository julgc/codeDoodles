package com.sample.util;

import com.sample.vo.Employee;

public final class EmployeeValidatorUtil {
	public static boolean isValid(Employee emp){
		boolean isValid=false;
		
		isValid = validateEmail(emp.getEmail());
		
		return isValid;
	}

	private static boolean validateEmail(String email) {
		boolean isValid;
		String emailRegexp="[a-zA-Z._0-9\\-]*@[a-zA-Z._0-9\\-]*\\.[a-zA-Z._0-9\\-]*";
		isValid = email.matches(emailRegexp);
		return isValid;
	}
}
