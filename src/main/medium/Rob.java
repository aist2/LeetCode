package medium;

public class Rob {
    public static int rob(int[] nums) {
    	if (nums==null||nums.length==0) return 0;
    	if (nums.length<=1) return nums[0]; 
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    
    private static int rob(int[] nums, int lo, int hi) {
    	int rob=0;
    	int unRob=0;
    	for (int i=lo; i<=hi; i++) {
    		int tmp = rob;
    		rob = unRob + nums[i];
    		unRob = Math.max(unRob, tmp);
    	}
    	return Math.max(rob, unRob);
    }
}
