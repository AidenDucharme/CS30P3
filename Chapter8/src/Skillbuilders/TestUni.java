package Skillbuilders;

import java.text.NumberFormat;
import java.util.Scanner;

import Skillbuilders.Staff;
import Skillbuilders.UEmployee;
import Skillbuilders.Faculty;

public class TestUni 
{
	
	public static void payEmployee(UEmployee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(emp);
		pay = emp.pay(payArg);
		System.out.println(money.format(pay));
	}
	
	public static void main(String[] args)
	{
		Faculty emp1 = new Faculty("Adam", "Aiden", 50000);
		
		Staff emp2 = new Staff("Ben", "Bentaga", 17.50);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		
		Faculty emp = emp1;
	
		 
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
				case 1: emp1 = emp1; break;
				case 2: emp1 = emp2; break;
				}
				
				 if(action.equalsIgnoreCase("E"))
				 {
					 System.out.println(emp1);
				 }
				 else if(action.equalsIgnoreCase("P"))
				 {
					 System.out.println("Enter Hours for associate" + "or pay period for manager");
					 payArg = input.nextDouble();
					 payEmployee(emp1, payArg);
				 }
				
			}

		
		}while(!action.equalsIgnoreCase("Q"));
		
	}//Main method
	
	
	

}
