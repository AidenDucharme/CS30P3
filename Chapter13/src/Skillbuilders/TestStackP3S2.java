package Skillbuilders;

public class TestStackP3S2 {

	public static void main(String[] args) 
	
	
	{
	StackP3S2 s2 = new StackP3S2(3);
	s2.push("Red");
	s2.push("Orange");
	s2.push(11);
	System.out.println("Top is pointing to: " + s2.top());
	System.out.println("Size of the stack is: " + s2.size());
	s2.pop();
	
	System.out.println("The top is ponting to: " + s2.top());
	System.out.println("The size of the stack is: " + s2.size());
	
	
	

	}

}
