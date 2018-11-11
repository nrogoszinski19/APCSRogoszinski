
public class Problem1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int last = 0;
		
		for(int i=1; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				sum = last + i;
				last = sum;
			}	
		}
		System.out.println(sum);

	}

}
