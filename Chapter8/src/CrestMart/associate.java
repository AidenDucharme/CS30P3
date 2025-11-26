package CrestMart;

public class associate extends employee
{
	
	private double hourlyPayRate;
	
	public associate(String fn, String ln, double hRate)
	{
		super(fn,ln);
		hourlyPayRate = hRate;
		
	}
	
	
	public double pay(double hours)
	{
		double payEarned;
		
		if (hours > 40)
		{
			payEarned = ((hourlyPayRate * 40) + (hourlyPayRate * 1.5) * (hours - 40));
			
			
		}
		
		else
		{
			payEarned = hours*hourlyPayRate;
		}
		
		
	return payEarned;
	
	
	
	}
	
	public String toString()
	{
		return(super.toString() + ", Associate" + "Pay Rate: " + hourlyPayRate);
	}
	
	
}
