package com.sms.controller;



import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sms.model.tblStudentUser;


public class StudentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return tblStudentUser.class.equals(clazz);
		// TODO Auto-generated method stub
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.err.println("----- \t Validate DEPARTMENT \t -----");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username","1", "Student's username is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password","2", "Student's password is required");
		
		// TODO Auto-generated method stub

	}

}
