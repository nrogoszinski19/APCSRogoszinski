
public class Problem2 {

	public static void main(String[] args) {

		int last = 0;
		int current = 1;
		int max = 4000000;
		int sum = 0;
		
		boolean over = false;
		while(!over) {
			int fib = last + current;
			last = current;
			current = fib;
			
			if(fib>max) {
				over = true;
				break;
			}
				
			if(fib%2==0)
				sum = sum + fib;
			}
		System.out.println("\nThe sum is " + sum);
		}
	}