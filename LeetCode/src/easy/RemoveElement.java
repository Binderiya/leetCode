package easy;

public class RemoveElement {
	
	public static void main(String args[]) {
		int[] nums = {3,2,2,3};
		int val = 3;
		System.out.println(remove(nums, val));
	}
	static int remove(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}

}
