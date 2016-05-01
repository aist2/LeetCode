package easy;

import java.util.Arrays;
import java.util.HashMap;


public class MajorityElement {
    public static int majorityElement1(int[] nums) {
    	HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
    	int countOfMajorityElement = (int) Math.floor((double)nums.length / 2);
    	Integer currVal;
    	int currCount;
    	int currMajorityElement = nums[0];
    	int currCountOfMajorityElement = 1;
    	
    	for (int i=0;i<nums.length;i++) {
    		currVal = new Integer(nums[i]);
    		if (countMap.containsKey(currVal)) {
    			currCount = countMap.get(currVal) + 1;
    		}
    		else {
    			currCount = 1;
    		}
    		if ((currCount > currCountOfMajorityElement) && (currCount >= countOfMajorityElement)) {
    			currMajorityElement = currVal;
    			currCountOfMajorityElement = currCount;
    		}
			countMap.put(currVal, currCount);
    	}
        return currMajorityElement;
    }
    
    public static int majorityElement2(int[] nums) {
    	Arrays.sort(nums);
    	return nums[nums.length/2];
    }
    
    public static int majorityElement3(int[] nums) {
        int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;

        }
        return major;
    }
    
}
