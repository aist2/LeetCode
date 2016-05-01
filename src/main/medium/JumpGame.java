package medium;

public class JumpGame {
//    public static boolean canJump(int[] nums) {
//    	if (nums.length <= 1) return true;
//    	int idx = 0;
//    	int step;
//    	while (idx < nums.length) {
//    		step = nums[idx];
//    		for (;step > 0; step--) {
//    			if (idx+step >= nums.length || nums[idx+step] != 0){
//    				idx += step;
//    				break;
//    			}
//    		}
//    		if (step == 0)
//    			return false;
//    	}
//        return true;
//    }
	public static boolean canJump(int[] nums) {
		return canJump2(nums);
	}
	
	public static boolean canJump2(int[] nums) {
		int max = 0;
		for (int i = 0; i<nums.length; i++){
			if (i>max) return false;
			max = Math.max(i + nums[i], max);
		}
		return true;
	}
	
	
	public static boolean canJump1(int[] nums) {
		return canJump(nums, 0);
	}
	
	private static boolean canJump(int[] nums, int idx) {
		if (idx>=nums.length-1)
			return true;
		if (nums[idx] == 0)
			return false;
		
		int step = nums[idx];
		for (;step > 0; step--) {
			boolean res = canJump(nums, idx+step);
			if (res)
				return true;
			else
				continue;
		}
		return false;
	}
}
