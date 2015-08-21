package org.student;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	@SuppressWarnings("unused")
	private String listOfValidHobbies;

	@Override
	public void initialize(IsValidHobby isValidHobby){
		this.listOfValidHobbies = isValidHobby.listOfValidHoobies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if (studentHobby == null){
			return false;
		}

		if (studentHobby.matches("Music|Football|Cricket|Hockey")){
			return true;
		} else {
			return false;
		}
	}
}