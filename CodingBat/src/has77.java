
public class has77 {

	public static void main(String[] args) {
		int[] nums = {7,1,2,7,7};
		System.out.println(has77(nums));

	}
	public static boolean has77(int[] nums) {
		boolean sevens = false;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==7 && nums[i+1]==7)
				sevens = true;
			if(i<=nums.length-3 && nums[i]==7 && nums[i+2]==7)
				sevens = true;
		}
		return sevens;
	}

}
