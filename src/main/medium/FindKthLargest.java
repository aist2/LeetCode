package medium;
import java.util.Arrays;


public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
    	Arrays.sort(nums);
    	if (k > nums.length)
    		return -1;
        return nums[nums.length-k];
    }
}
