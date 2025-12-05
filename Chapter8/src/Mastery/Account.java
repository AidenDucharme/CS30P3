package Mastery;

public abstract class Account {
	
	
		
		private String BusA, PerA;
			
			//Constructor method 
			public Account(String BA, String PA)
			{
				BusA = BA;
				PerA = PA;
			}
			
			public String toString()
			{
				return(BusA + " or " + PerA);
			}
			
			abstract double choice(double des);
			
			
			
			


}
