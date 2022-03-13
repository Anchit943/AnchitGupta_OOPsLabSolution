package com.greatlearning.model;

public class Employee 
{
	private String firstName;
	private String lastName;
	private String department;
	private String emailAddress;
	private char[] password;
	
	public Employee(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password.toString();
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
	

}
