package easy;


public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
    	return removeElement1(nums,val);
    }
    
    public static int removeElement1(int[] nums, int val) {
    	int pSlow = nums.length - 1;
    	int pFast = nums.length - 1;
    	while (pFast >= 0) {
    		if (nums[pFast] == val) {
    			nums[pFast] = nums[pSlow];
    			pSlow--;
    		}
    		pFast--;
    	}
    	
    	return pSlow+1;
    }
}
