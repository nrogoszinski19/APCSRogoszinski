
public class tenRun {

	public static void main(String[] args) {
		int[] nums = {2, 10, 3, 4, 20, 5};
		printArray(tenRun(nums));
	}
	
	public static int[] tenRun(int[] nums) {
		int i=0;
		int current;
		while(i < nums.length && nums[i] % 10 != 0)
			i++;
	    if(i >= nums.length)
	    	return nums;
	    current = nums[i];
	    i++;
		while(i < nums.length) {
	        if(nums[i] % 10 == 0)
	        	current = nums[i];
	        else
	            nums[i] = current;
	        i++;
	    }
		return nums;
	}
	public static void printArray(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}
