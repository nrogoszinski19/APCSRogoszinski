
public class DiverseArray {
	
	static int[] array = {1, 3, 5};
	static int[][] arr2D = {{1,2,3}, 
							{2,3,4},
							{3,4,5}};
	
	public static void main(String[] args) {
		//arraySum check
		System.out.println(arraySum(array));
		
		//rowSums check
		int[] sum = new int[3];
		sum = rowSums(arr2D);
		for(int i=0; i<sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		//isDiverse check
		System.out.println(isDiverse(arr2D));
	}
	
	public static int arraySum(int[] arr) {
		int last = arr[0];
		int arraySum = 0;
		for(int i=1; i<arr.length; i++) {
			arraySum = last + arr[i];
			last = arr[i];
		}
		return arraySum;
	}
	
	public static int[] rowSums(int[][] a) {
		int[] a2D = new int[a.length];
		int current = 0;
		int last = 0;
		for(int i = 0; i<a.length; i++) {
			for(int k = 0; k<a[0].length; k++) {
				current = last + a[i][k];
				last = current;
			}
			a2D[i] = current;
			current = 0;
			last = 0;
		}
		return a2D;
	}
	
	public static boolean isDiverse(int[][] arr2D)
	{
	  int[] sums = rowSums(arr2D);
	  
	  for(int i = 0; i < sums.length; i++)
	    for(int j = i + 1; j < sums.length; j++)
	      if(sums[i] == sums[j])
	        return false;
	  
	  return true;
	}
}
