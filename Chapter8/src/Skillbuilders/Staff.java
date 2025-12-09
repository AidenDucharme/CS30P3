package Skillbuilders;

public class Staff extends UEmployee
{
	
String title; //Declaring the variable "title" that will hold the value for what title the staff member is. Not assigned because not asked yet.
	
	public Staff(String name, double sal, String jobTitle) //Constructor method
	{
		super(name, sal); //Gets name and sal from the father class, UEmployee
		title = jobTitle; 
	}
	
	
	
	
	
	public String getTitle()
	{
		return(title); //Returns the title of the worker
	}
	
	public String toString()
	{
		String empInfo; //String variable that holds the value of the information of the staff employee
		empInfo = super.getEmployeeName() + " " + title + " " +  super.getEmployeeSal(); //Retreiving the employee name from the father class, and then also prevents the title of the employee along with the salary and the spaces are for formating 
		return(empInfo); //Return the variable that contains all of the employees information.
	}
	
	

}
