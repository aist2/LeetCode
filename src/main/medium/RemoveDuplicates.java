package medium;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
    	int pS = 1;
        int pF = 1;
        int dupCount = 0;
        while (pF < nums.length) {
        	if (nums[pF] == nums[pF-1]) {
        		dupCount++;
        	} else {
        		dupCount = 0;
        	}
        	if (dupCount < 2)
        		nums[pS++] = nums[pF];
        	pF++;
        }
    	return pS;
    }
}
