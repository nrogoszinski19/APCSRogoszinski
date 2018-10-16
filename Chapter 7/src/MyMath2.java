import java.util.Scanner;

public class MyMath2 {

	public static void main(String[] args) {
		
		System.out.println(calcAreaOfCircle(5));
		
		System.out.println(calcDistance(20, 50, 10, 100));
		
		System.out.println("The missing side is " + pythagorean());
									
	}

	public static double calcAreaOfCircle(double radius) {
		return Math.PI*radius*radius;
	}
	
	public static double calcDistance(int x1, int y1, int x2, int y2) {
		int difx = x2-x1;
		int dify = y2-y1;
		return Math.sqrt((difx*difx)+(dify*dify));
	}
	
	public static double pythagorean() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("If you need to find side A or B, input 0. If you need to find side C, input 1:   ");
		double option = keyboard.nextInt();
		
		if(option == 0) {
			System.out.print("Side 1:  ");										
			double side1 = keyboard.nextInt();
			System.out.print("Hypotenuse:  ");										
			double hypo = keyboard.nextInt();
			return Math.sqrt(Math.pow(hypo, 2) - Math.pow(side1,  2));
		}
		if(option == 1) {
			System.out.print("Side 1:  ");										
			double side1 = keyboard.nextInt();
			System.out.print("Side 2:  ");										
			double side2 = keyboard.nextInt();
			return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,  2));
		}
		
		return -1;
		

	}
	
	
}
