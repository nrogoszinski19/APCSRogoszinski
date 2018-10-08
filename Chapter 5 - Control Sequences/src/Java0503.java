// Java0503.java
// This program demonstrates <String> objects concatenation with 
// keyboard entered data.                                                    


import java.util.Scanner;

public class Java0503
{
	public static void main (String args[]) 							
	{  
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Number  ===>>  ");										
		int number1 = input.nextInt();
		System.out.print("Enter 2nd Number  ===>>  ");										
		int number2 = input.nextInt();
		
		System.out.println("My numbers are " + number1 + " and " + number2);
	}
}
