package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService 
{
	public char[] generatePassword(int length) 
	{
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	 }
	
	public String generateEmailAddress(Employee employee)
	{
		String emailAddress =  employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+employee.getDepartment().toLowerCase()+".company"+".com";
		return emailAddress;
	}
	
	public void showCredentials(Employee employee)
	{
		System.out.println("\n");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(" Dear "+ employee.getFirstName()+ " your generated credentials are as follows :"+"\n");
		System.out.println(" Email    --> " + employee.getEmailAddress());
		System.out.println(" Password --> " + employee.getPassword());
	}

}
