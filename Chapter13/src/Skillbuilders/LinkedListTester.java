package Skillbuilders;

public class LinkedListTester {

	public static void main(String[] args) 
	
	{
		LinkedList list = new LinkedList();
		
		list.addAtFront("Red");
		list.addAtFront("314");
		list.addAtFront("Aiden");
		
		System.out.println("List has " + list.size() + " idems");
		System.out.println(list);
		
		list.addatend("Blue");
		list.addatend("Blue");
		
		System.out.println("List has " + list.size() + " idems");
		System.out.println(list);
	}

}
