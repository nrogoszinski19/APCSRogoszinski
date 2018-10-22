
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
		
	//Challenge: remove a specific element from the array and return the array without the value
		
		int[] output = remove(array, 22); // removes number 22 from array
		System.out.println(output[]);

		
	}

}
