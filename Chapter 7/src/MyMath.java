
public class MyMath {

	public static void main(String[] args) {
		
		System.out.println(addNum(2, 5));
		System.out.println(addNum(10, 100));
		
		System.out.println(addNum(10.5, 100.000));
		
		System.out.println("Circumference of a circle is " + calcCircOfCircle(5.5));
		
	}
	
	public static int addNum(int num1, int num2) {
		int sum =num1 + num2;
		return sum;

	}
	public static double addNum(double num1, double num2) {
		return (num1+num2);
	}
	
	public static double calcCircOfCircle(double radius) {
		return 2*radius*Math.PI;
	}
}