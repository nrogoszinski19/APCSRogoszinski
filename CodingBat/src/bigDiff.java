
public class bigDiff {
	public static void main(String[] args) {
		int[] bigDiff = {10,3,5,6};
		System.out.println(bigDiff(bigDiff));
	}

	public static int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		int diff = max - min;
		return diff;
	}
}