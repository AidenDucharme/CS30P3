package Skillbuilders;



public class PuckPartOneOfTwo extends Disk
{
	double minStandWeight = 5;
	double maxStandWeight = 5.5;
	double minYouthWeight = 4;
	double maxYouthWeight = 4.5;
	double weight;
	boolean standard, youth;

	//Constructor method 
	public PuckPartOneOfTwo(double w)
	{
		
		super(1.5, 1);
		weight = w;
		
		
		
		if (weight >= 5 && weight <= 5.5)
		{
		
			standard= true;
			youth = false;
		}
		else
		{
			
			standard= false;
			youth = true;
		}
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	public String getDivision()
	{
		String div;
		
		if(standard)
		{
			div = "Puck is standard";
		}
		
		else
		{
			div = "Puck is a youth puck";
		}
	
		
	 return div;
	
	
	
	
	
	}
	
	public boolean equals(Object c) 
	{
		PuckPartOneOfTwo testObj = (PuckPartOneOfTwo)c;
		
		if(testObj.getWeight() == weight)
		{
			return(true);
			
		}
		else
		{
			return(false);
		}
	}
	
	private double getWeight() {
		
		return weight;
	}





	public String toString()
	{
		return("The pucks weight is: " + getWeight() + " And the division is: " + getDivision());
	}
	

	

}
