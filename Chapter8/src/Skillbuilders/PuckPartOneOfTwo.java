package Skillbuilders;
import java.util.Scanner;


public abstract class PuckPartOneOfTwo 
{
	Scanner input = new Scanner(System.in);
	private String firstName, lastName;
	
	public void getWeight(int check, boolean standardWeight )
	{
		System.out.print("Weight: ");
		check = input.nextInt();
		
		if (check > 5 && check < 5.5)
		{
		
			standardWeight = true;
		}
		else
		{
			
			standardWeight = false;
		}
	}
	
	public void getDivision(boolean standardDivision, int an)
	{
		System.out.print("Are you in standard divion or in youth divion (1 for standard, 2 for child): ");
		an = input.nextInt();
		
		if (an == 1)
		{
		
			standardDivision = true;
		}
		else
		{
			
			standardDivision = false;
		}
		
		
		
	}
	
	
	
	
	//Constructor method 
	public PuckPartOneOfTwo(boolean standard, boolean youth, int check)
	{
		
		
		
		
		
		
	}
	
	public String toString()
	{
		return(firstName + " " + lastName);
	}
	
	abstract double pay(double period);
	

}
