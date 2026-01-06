package Skillbuilders;

public class QueueTester {

	public static void main(String[] args) 
	
	{
		Queue q1 = new Queue(3);
		q1.enqueue("red");
		q1.enqueue("Yellow");
		q1.enqueue("Orange");

		System.out.println("Front of q1 is: " + q1.front());
		System.out.println("size of q1 is: " + q1.size());
		
		q1.dequeue();
		
		System.out.println("Front of q1 is: " + q1.front());
		System.out.println("size of q1 is: " + q1.size());
		
	}

}
