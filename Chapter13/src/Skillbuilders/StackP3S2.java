package Skillbuilders;

public class StackP3S2 

{
	//object can be anything bulean int, etc
	private Object[] data;
	private int top;
	
	public StackP3S2(int maxIdems) //max idems is place holder
	{
		data = new Object[maxIdems];
		top = -1;//u cant have -1 idem slot so it is considered emplty if stuff in 0 the array is filled
	}
	
	public Object top() //returns whatever is at the top position 0
	{
		return (data[top]);
	}



public Object pop() //pop means remove
{
	top = top - 1;
	return(data[top + 1]);
}



public void push(Object idem) //void because you arnt expecting anything return
{
	if(top < data.length -1)
	{
		top = top + 1;
		data[top] = idem;
	}
}

public boolean isEmpty()
{
	if(top == -1) // -1 means empty
	
		return true;
	
	else
	
		return false;
}

public void makeEmpty()
{
	top = -1;
}

public int size()
{
	if(isEmpty())
	{
		return 0;
		
	}
	else
		return(top + 1);
}

}





