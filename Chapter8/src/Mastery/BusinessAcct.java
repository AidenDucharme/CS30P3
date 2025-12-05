package Mastery;

public class BusinessAcct extends Account

{
	private double charge;
	
	private double balance;
		
		
		
		public double payments(double charge, double balance)
		{
			double payEarned;
			
			if (balance < 500)
			{
				balance = (balance - 10);
				
				
			}
			
		return balance;
		
		
		
		}
		
		public String toString()
		{
			return(super.toString() + ", your balance is" + balance);
		}
		
		
		
		
		
		

}
