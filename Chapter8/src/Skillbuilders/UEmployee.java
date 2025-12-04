package Skillbuilders;

public abstract class UEmployee 
{
private String firstName, lastName;
	
	//Constructor method 
	public UEmployee(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}
	
	public String toString()
	{
		return(firstName + " " + lastName);
	}
	
	abstract double pay(double period);
	
	
	
	
	

}
