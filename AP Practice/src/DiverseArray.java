
public class DiverseArray {
	
	static int[] array;
	
	public static void main(String[] args) {
		arraySum(array);
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

}
