package Skillbuilders;

import java.io.File;
import java.util.Scanner;


public class myFilePartOne {

	public static void main(String[] args) {
	
		
File textFile;
Scanner input = new Scanner(System.in);
String fileName;

//obtain file name from the user

System.out.println("Enter file name: ");
fileName = input.nextLine();


//Determin if this file exists

textFile = new File(fileName);
if(textFile.exists())
{
	System.out.println("File exists");
}

else
{
	System.out.println("File does not exist");
}
		
	












		
	}

}
