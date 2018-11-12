
public class FizzBuzz_variables {

	public static void main(String[] args) {
		fizzBuzz();
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
