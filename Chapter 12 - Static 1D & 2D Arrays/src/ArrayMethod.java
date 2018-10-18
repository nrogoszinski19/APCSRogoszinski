
public class ArrayMethod {

	public static void main(String[] args) {
		
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		
		//System.out.println(six(numArray));
		
		System.out.println(reverse(array));
	}
	/*
	public static boolean six(int[] testArray) {
		
		boolean exists = false;
		
		for(int x=0; x<testArray.length; x++) {
			
			System.out.print(testArray[x]);
			
			if(testArray[x]==6)
				exists = true;
		}
		
		return exists;
	}
	*/
	
	public static int[] reverse(int[] array) {
		int[] reversed = new int[array.length];
		for(int x=0; x<array.length; x++) {
			reversed[array.length-x] = array[x];
		}
		return array;
	}
	
}}