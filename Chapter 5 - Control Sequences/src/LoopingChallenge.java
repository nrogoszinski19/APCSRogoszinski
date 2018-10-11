
public class LoopingChallenge {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int num=1; num<=1000; num++)
			sum=sum+num;
		System.out.println(sum);
		
		
		for(int x=2; x<=100; x=x+2)
			System.out.print(x + " ");
		
		int last = 0;
		int current = 1;
	    for (int i = 1; i <= 20; i++){
	    	System.out.print("\n" + last);
	    	int fib = last + current;
	    	last = current;
	    	current = fib;
	    }

	}

}
