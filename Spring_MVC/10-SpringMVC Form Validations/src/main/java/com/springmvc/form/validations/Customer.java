package com.springmvc.form.validations;



import javax.validation.constraints.*;

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
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}








