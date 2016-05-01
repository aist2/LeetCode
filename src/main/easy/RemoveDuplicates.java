package easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
    	return removeDuplicates1(nums);
    }
    
    public static int removeDuplicates1(int[] nums) {
    	int pSlow = 0;
    	int currFastVal;
    	for (int pFast = 1; pFast < nums.length; pFast++) {
    		currFastVal = nums[pFast];
    		if (currFastVal != nums[pSlow]){
    			if (pFast > (pSlow + 1)) {
    				nums[pSlow+1] = currFastVal; 
    			}
    			pSlow++;
    			continue;
    		}
    		else {
    			continue;
    		}
    	}
    	return pSlow+1;
    }
}
