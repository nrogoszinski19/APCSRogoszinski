
public class ManipulateArray {

	public static void main(String[] args) {

	//Write a Java program to calculate the average value of array elements
		
		int[] array = {1, 2, 3, 4, 5};
		
		int sum=0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double avg = sum/array.length;
		
		System.out.println(avg);
		
	//Write a Java program to test if an array contains a specific value
				
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 4)
				System.out.println("true");
		}
		
	//Write a Java program to find the index of an array element
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 4)
				System.out.println(i);
		}
		
		
	}
	
	//Write a Java program to find the index of an array element
	
	public static int findIndex (int[] array, int t) {
		if(array == null) return 1;
		int len = array.length;
		int i = 0;
		while(i<len) {
			if(array[i] == t) return i;
			else i=i+1;
		}
		return -1;
	}
	
	//Challenge: remove a specific element from the array and return the array without the value
	
	public static int[] removeArray(int[] oldArray, int num) {
		int[] newArray = new int[oldArray.length-1];
		
		for(int k=0; k < oldArray.length; k++) {
			//check to see if the item in the old array
			//if its not, then you want to copy over the item into newArray
		}
		return newArray;
	}

}
