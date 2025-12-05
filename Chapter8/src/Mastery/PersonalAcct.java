package Mastery;

import Skillbuilders.UEmployee;

public class PersonalAcct extends Account


{
	
	private double charge;
	
private double balance;
	
	public PersonalAcct(String PA, double due, double balance)
	{
		super(PA, PA);
		charge = due;
		
	}
	
	
	public double payments(double charge, double balance)
	{
		double payEarned;
		
		if (balance < 100)
		{
			balance = (balance - 2);
			
			
		}
		
	return balance;
	
	
	
	}
	
	public String toString()
	{
		return(super.toString() + ", your balance is" + balance);
	}
	
	
	
	
	
	
	
	

	

}
