
public class methods {

	public static void main(String[] args) {
		
		boolean ans = isEven(10);
		System.out.println(ans);
		
		System.out.println();
		
		System.out.println(evenNum(5));
		
		System.out.println();
		
		fizzBuzz();
		
	}

	//whether a number is even or not
	public static boolean isEven(int num) {
		boolean even = false;
		
		if(num%2 == 0)
			even = true;
		else
			even = false;
		
		return even;
	}
	
	//count the number of even numbers between 1 and user input
	public static int evenNum(int user) {
		int count = 0;
		for(int i=1; i<=user; i++) {
			if(i%2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	/*write a program that prints the numbers from 1 to 100
	 multiples of 3 print "Fizz
	 multiples of 5 print "Buzz
	 multiples of 3 and 5 print "FizzBuzz"
	 */
	public static void fizzBuzz() {
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5!=0)
				System.out.println(i + " - Fizz");
			else if(i%5==0 && i%3!=0)
				System.out.println(i + " - Buzz");
			else if(i%3==0 && i%5==0)
				System.out.println(i + " - FizzBuzz");
			else
				System.out.println(i);
		}
	}
	
}
