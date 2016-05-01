package medium;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
    	if (nums==null || nums.length ==0) return 0;
        int maxCurr, minCurr;
        int maxPre = nums[0];
        int minPre = nums[0];
        int maxSofar = maxPre;
        for (int i=1; i<nums.length; i++) {
        	maxCurr = Math.max(Math.max(maxPre*nums[i], minPre*nums[i]),nums[i]);
        	minCurr = Math.min(Math.min(maxPre*nums[i], minPre*nums[i]), nums[i]);
        	maxSofar = Math.max(maxSofar, maxCurr);
        	maxPre = maxCurr;
        	minPre = minCurr;
        }
        return maxSofar;
    }
}
