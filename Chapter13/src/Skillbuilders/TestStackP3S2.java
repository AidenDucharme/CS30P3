/*
Program: Stack tester class         Last Date of this Revision: January 13, 2026

Purpose: A type of array used to manage data in a program. This class tests this data structure.

Author: Aiden Ducharme
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 */


package Skillbuilders;

public class TestStackP3S2 {

	public static void main(String[] args) 
	
	
	{
	StackP3S2 s2 = new StackP3S2(3);
	s2.push("Red");
	s2.push("Orange");
	s2.push(11);
	s2.push(67);
	s2.push(98);
	System.out.println("Top is pointing to: " + s2.top());
	System.out.println("Size of the stack is: " + s2.size());
	s2.pop();
	
	System.out.println("The top is ponting to: " + s2.top());
	System.out.println("The size of the stack is: " + s2.size());
	
	s2.push(56);
	s2.push(89);
	
	System.out.println("The top is ponting to: " + s2.top());
	System.out.println("The size of the stack is: " + s2.size());

	}

}

/*
 * Test Case Number 1
 * 
 * Top is pointing to: 11
Size of the stack is: 3
The top is ponting to: Orange
The size of the stack is: 2

 * Test Case number 2:
 * 
 * Top is pointing to: 11
Size of the stack is: 3
The top is ponting to: Orange
The size of the stack is: 2
The top is ponting to: 56
The size of the stack is: 3
 * 
 * 
 * 
 * 
 */

