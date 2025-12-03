package Skillbuilders;

public class Rectangle {
	/**
	 * Circle class.
	 */
	
		private static double width;
		private static double length;
		
			
		
		public Rectangle(double w, double l) {
			width = w;
			length = l;
		}


		public void setWidth(double newWidth) {
		 	width = newWidth;
		}



		public double area() {
		 	double RA;
		 	
		 	RA = width * length;
		 	return(RA);
		}

		
		
		public double getWidth() {
		 	return(width);
		}
		
		public double getLength() {
		 	return(length);
		}
		
		
		
		public static void displayAreaFormula() {
		 	System.out.println("The formula for the area of a circle is a = w x l");
		}
		

		
		public boolean equals(Object obj) 
		{
			Rectangle testObj = (Rectangle)obj;
			
		 	if (testObj.getWidth() == width) 
		 	{
				return(true);
			} else 
			{
				return(false);
			}
		 	
		}
		
		
		public int compareTo(Object p)
		{
			Rectangle testRectangle = (Rectangle)p;
			
			if(testRectangle.getWidth() > width)
			{
				return(-1);
			}
			else if(testRectangle.getWidth() == width)
			{
				return(0);
			
			}
			else
			{
				return(1);
			}
		
			
			}		



		public String toString() {
			String rectangleString;

			rectangleString = "Circle has width of " + width + ", and a length of " + length;
		 	return(rectangleString);
		}

		}
