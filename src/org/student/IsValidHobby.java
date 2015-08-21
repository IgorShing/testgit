package org.student;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface IsValidHobby {

	String listOfValidHoobies() default "Music|Football|Cricket|Hockey|Cars";

	String message() default "Please, provide a valid hobby: Cricket, Music, Football and Hockey";

	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}