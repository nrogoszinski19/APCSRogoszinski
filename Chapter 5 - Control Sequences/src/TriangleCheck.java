import java.util.Scanner;

public class TriangleCheck {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Side 1:  ");										
		int number1 = input.nextInt();
		System.out.print("Side 2:  ");										
		int number2 = input.nextInt();
		System.out.print("Side 3:  ");										
		int number3 = input.nextInt();
		
		if(number1 == number2 && number2 == number3) {
			System.out.println("This triangle is equilateral.");
		}
		else if(number1 == number2 || number2 == number3 || number1 == number3) {
			System.out.println("This triangle is isosceles.");
		}
		else {
			System.out.println("This triangle is scalene.");
		}
		
		

	}

}
