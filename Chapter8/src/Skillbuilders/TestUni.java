/*

Program: University          Last Date of this Revision: 12/9/2025

Purpose: An application that gathers information such as pay, faculty, name, ect... from employees at a university

Author: Aiden Ducharme,
School: CHHS
Course: OBject oriented programming 2 (CSE 3130)
 

*/





package Skillbuilders;

import java.text.NumberFormat;
import java.util.Scanner;

import Skillbuilders.Staff;
import Skillbuilders.UEmployee;
import Skillbuilders.Faculty;

public class TestUni 
{
	
	
	public static UEmployee assignEmployee()
	{
		String empStatus, name, dept, title, repsonse, ignore;
		double salary; //Inputing string variables that will be assigned values later
		
		  Scanner scanner = new Scanner(System.in); //allowing input

		System.out.println("Enter employee name"); //Asking employee name
		name = scanner.nextLine(); //assigning the variable "name" with the name employee enters
		
		System.out.println("Enter employee salary");//Asking for employee salary
		 salary = scanner.nextDouble();//assigning the variable "salary" with the salary employee enters
		 ignore = scanner.nextLine(); //Spacing for format
		 
		 System.out.println("Are they fauclty and staff (F/S)"); //Asking the user if they are faculty or staff
		 repsonse = scanner.nextLine(); //The variable "response" will hold the value of their decision
		 
		 if (repsonse.equalsIgnoreCase("F")) //If faculty...
		 {
			System.out.println("Enter Department/Faculty: "); //Ask for what faculty they are in
			dept = scanner.nextLine(); //Assign what faculty they are in to the variable "dept"
			return(new Faculty(name, salary, dept)); //Return the name, salary and the department the employee belongs in
		 }
		 
		 else // if they are an employee 
		 {
			 System.out.print("Enter employee title: "); //Ask what type of employee they are 
			 title = scanner.nextLine(); //collect that info in a variable
			 return(new Staff(name, salary, title)); //return the name salary and title of the employee
			 
		 }
	}
	
	
	public static void main(String[] args)
	{
	
	UEmployee emp1, emp2, emp3; //declaring employees from UEmployee class
	 Scanner scanner = new Scanner(System.in); //Allowing user input
	
	emp1 = assignEmployee();
	emp2 = assignEmployee();
	emp3 = assignEmployee();
	System.out.println("University Employees: ");
	
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	}
	
}


/*
 * Program Tests: 
 * 
 * 1.
 * 
 * Enter employee name
a
Enter employee salary
50000
Are they fauclty and staff (F/S)
f
Enter Department/Faculty: 
math
Enter employee name
ben
Enter employee salary
98999
Are they fauclty and staff (F/S)
s
Enter employee title: janitor
Enter employee name
flicker
Enter employee salary
22222222
Are they fauclty and staff (F/S)
f
Enter Department/Faculty: 
science
University Employees: 
a math 50000.0
ben janitor 98999.0
flicker science 2.2222222E7


2. 

Enter employee name
fred
Enter employee salary
45454545
Are they fauclty and staff (F/S)
f
Enter Department/Faculty: 
enl
Enter employee name
pooner
Enter employee salary
76623662
Are they fauclty and staff (F/S)
s
Enter employee title: headmaster
Enter employee name
jen
Enter employee salary
25252527
Are they fauclty and staff (F/S)
f
Enter Department/Faculty: 
physics
University Employees: 
fred enl 4.5454545E7
pooner headmaster 7.6623662E7
jen physics 2.5252527E7


 * 
 * 
 * 
*/
 
