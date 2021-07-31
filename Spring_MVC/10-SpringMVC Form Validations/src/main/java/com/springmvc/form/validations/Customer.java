package com.springmvc.form.validations;


import lombok.Data;


import javax.validation.constraints.*;

@Data
public class Customer {

	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min=1, message="is required")
	private String lastName;

	@NotNull(message = "This field is required")
	@Min(value = 1,message = "must be greater than or equal to one")
	@Max(value = 10,message = "must be less than or equal to ten")
	private Integer freePasses;

	@NotNull(message = "This field is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{6}",message = "only 5 digit/character value")
	private String postalCode;
}








