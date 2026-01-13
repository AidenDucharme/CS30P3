/*

Program: Queue tester clss         Last Date of this Revision: January 13, 2026

Purpose: A type of array used to manage data in a program. This class tests this data structure.

Author: Aiden Ducharme
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 

*/


package Skillbuilders;

public class QueueTester {

	public static void main(String[] args) 
	
	{
		Queue q1 = new Queue(15);
		q1.enqueue("Aiden");
		q1.enqueue("does");
		q1.enqueue("not");
		q1.enqueue("love");
		q1.enqueue("the");
		q1.enqueue("mall");

		System.out.println("Front of q1 is: " + q1.front());
		System.out.println("size of q1 is: " + q1.size());
		
		System.out.println("Now lets add some new elements");
		q1.enqueue("unless");
		q1.enqueue("he");
		q1.enqueue("is");
		q1.enqueue("with");
		q1.enqueue("his");
		q1.enqueue("friends!");
		
	
		
		
	}

}


/*Test Cases:
 * 
 * Test Case Number 1:
 * 
 * Front of q1 is: red
size of q1 is: 3
Front of q1 is: Yellow
size of q1 is: 2


Test Case Number 2:
 */

