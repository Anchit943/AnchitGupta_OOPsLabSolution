package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class EmailApplicationMain
{
static Scanner sc=new Scanner(System.in);
	
	private Employee employee;
	private CredentialService credentialService;
	
	public void takeInputs() throws Exception
	{
		System.out.println("Welcome to Email Application !"+"\n");
		System.out.println("-------------------------------------");
		System.out.println("\n"+"Please enter your first name : ");
		String firstName = sc.nextLine();
		System.out.println("\n"+"Please enter your last name : ");
		String lastName = sc.nextLine();
		employee = new Employee(firstName,lastName); // USE OF PARAMETERTIZED CONSTRUCTOR
		System.out.println("\n"+"Please enter department from the following : " + "\n" + "1. Technical" + "\n" + "2. Admin" + "\n" + "3. Human Resource" + "\n" + "4. Legal");
		Integer choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			employee.setDepartment("Technical");
			break;
		case 2:
			employee.setDepartment("Admin");
			break;
		case 3:
			employee.setDepartment("HumanResource");
			break;
		case 4:
			employee.setDepartment("Legal");
			break;
		default:
			throw new Exception("Invalid Department choice. Please try again !");
		}
		
	}
	
	public static void main(String args[]) throws Exception
	{
		EmailApplicationMain app = new EmailApplicationMain();
		app.credentialService =  new CredentialService();
		try {
		app.takeInputs();
		app.employee.setEmailAddress(app.credentialService.generateEmailAddress(app.employee));
		app.employee.setPassword(app.credentialService.generatePassword(8));
		app.credentialService.showCredentials(app.employee);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			}
	}

}
