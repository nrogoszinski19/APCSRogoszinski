
public class FizzBuzz_array {

	public static void main(String[] args) {
		printArray(fizzBuzz(1,5));
	}
	
	public static String[] fizzBuzz(int start, int end) {
		 int size = end-1;
		 String[] fizzBuzz = new String[size];
		 for(int i=0; i<size; i++){
		   if((i+1)%3==0 && (i+1)%5==0)
		     fizzBuzz[i] = "FizzBuzz";
		   else if((i+1)%3==0)
		     fizzBuzz[i] = "Fizz";
		   else if((i+1)%5==0)
			 fizzBuzz[i] = "Buzz";
		   else
		     fizzBuzz[i] = String.valueOf(i+1);
		 }
		 return fizzBuzz;
	}
	
	public static void printArray(String[] a) {
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}