package Skillbuilders;

import CrestMart.employee;

public class Faculty extends UEmployee //allows it to inherit information from the UEmployee class



{
	
	String department; //Declaring a variable that will hold the value for the department the employee is in (string because words will be the value)
	

	
	public Faculty(String name, double sal, String dept) //Constructor method
	{
		super(name,sal); //Inherit name of employee and salary from the UEmployee class
		department = dept; //Declare a variable in the constructor method for department
		
	}
	
	public String getDept() //Method that will return the department the employee is in
	{
		return(department);//Returning the department 
	}
	
	
	public String toString()
	
	{
		String empInfo; //Holds the info of the employee
		empInfo = super.getEmployeeName() + " " + department + " " + super.getEmployeeSal(); //Gathers all of the info in a presentable statment under the variable empInfo
		return(empInfo); //Present all of the info in the empInfo variable
	}
	
	
	
	
	
	
	
	

}
