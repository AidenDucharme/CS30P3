/*

Program: Linked List Tester        Last Date of this Revision: January 13, 2026

Purpose: A data structure that is an alternative too array lists, and is used to store data. This tester class tests the data structure.

Author: Aiden Ducharme
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 

*/



package Skillbuilders;

public class LinkedListTester {

	public static void main(String[] args) 
	
	{
		LinkedList list = new LinkedList();
		
		list.addAtFront("Ben");
		list.addAtFront("Cam");
		list.addAtFront("Landen");
		list.addAtFront("Elliot");
		
		System.out.println("This list has " + list.size() + " idems");
		System.out.println(list);
		
		list.addatend("Berlin");
		list.addatend("Tokyo");
		list.addAtFront("Osaka");
		list.addAtFront("Paris");
		
		System.out.println("List has " + list.size() + " idems");
		System.out.println(list);
		
		list.makeEmpty();
		System.out.println("The list was made empty");
		
		list.addAtFront("9888736353");
		list.addAtFront("346366366466");
		
		
		System.out.println("List has " + list.size() + " idems");
		System.out.println(list);;
	}

}


//Test Cases:
/*

Test Case 1: 


This list has 4 idems
Hamza
44
Adam
Aiden

List has 8 idems
Zachary
34
Hamza
44
Adam
Aiden
Ducharme
Joel

The list was made empty
List has 2 idems
567
34

Test Case 2:

This list has 4 idems
Elliot
Landen
Cam
Ben

List has 8 idems
Paris
Osaka
Elliot
Landen
Cam
Ben
Berlin
Tokyo

The list was made empty
List has 2 idems
346366366466
9888736353




*/