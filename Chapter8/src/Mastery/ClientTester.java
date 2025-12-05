package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;


import Mastery.BusinessAcct;
import Mastery.PersonalAcct;

public class ClientTester 

{
	

		
		public static void payEmployee(employee emp, double payArg)
		{
			NumberFormat balancee = NumberFormat.getCurrencyInstance();
			double balance;
			
			System.out.println(BusA);
			balance = emp.pay(payArg);
			System.out.println(money.format(pay));
		}
		
		public static void main(String[] args)
		{
			BusinessAcct emp1 = new BusinessAcct(10, 1000);
			
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
