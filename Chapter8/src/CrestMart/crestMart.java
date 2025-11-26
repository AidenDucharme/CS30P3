package CrestMart;

import java.text.NumberFormat;
import java.util.Scanner;





public abstract class crestMart

{
	
	public static void payEmployee(employee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(emp);
		pay = emp.pay(payArg);
		System.out.println(money.format(pay));
	}
	
	public static void main(String[] args)
	{
		Manager emp1 = new Manager("Adam", "Aiden", 50000);
		
		associate emp2 = new associate("Ben", "Bentaga", 17.50);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		
		employee emp = emp1;
		 
		do
		{
			System.out.println("\n (E)mployee" + "\\(P)ay \\ (Q)uit");
			
			System.out.println("Enter Choice: ");
			
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter employee number (1 or 2)");
				
				empNum = input.nextInt();
				
				switch(empNum)
				{
				case 1: emp = emp1; break;
				case 2: emp = emp2; break;
				}
				
				 if(action.equalsIgnoreCase("E"))
				 {
					 System.out.println(emp);
				 }
				 else if(action.equalsIgnoreCase("P"))
				 {
					 System.out.println("Enter Hours for associate" + "or pay period for manager");
					 payArg = input.nextDouble();
					 payEmployee(emp, payArg);
				 }
				
			}

		
		}while(!action.equalsIgnoreCase("Q"));
		
	}//Main method

}
