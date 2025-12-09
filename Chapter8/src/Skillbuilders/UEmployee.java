package Skillbuilders;

public abstract class UEmployee //Abstract allows other classes to inherit information from this class
{
 String name; //Create variable that will hold the name of the employee (String cause its words)
double salary; //Create variable that will hold the salary of the variable (double because it may be a decimal number)
	
	//Constructor method 
	public UEmployee(String nam, double sal)
	{
		name = nam; //Variable in the constructor method for the name
		salary = sal; //Variable in the constructor method for the salary
	}
	
	
	public String getEmployeeName()
	{
		return(name); //Return name of employee when called
	}
	
	public double getEmployeeSal() //Method for salary 
	{
		return(salary); //Return salary of employee when called.
	}
	
	
	
	
	
	
	
	

}
