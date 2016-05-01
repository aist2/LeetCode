package medium;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxCurr = nums[0];
        int max = nums[0];
        for (int i=1; i<nums.length; i++){
        	maxCurr = Math.max(nums[i], nums[i]+maxCurr);
        	max = Math.max(max, maxCurr);
        }
        return max;
    }
}
