package easy;

import java.util.ArrayList;
import java.util.List;


public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        return summaryRanges2(nums);
    }
    
    public static List<String> summaryRanges1(int[] nums) {
        List<String> res = new ArrayList<String>();

        if (nums.length==1){
        	res.add(Integer.toString(nums[0]));
        	return res;
        }
        int pSlow=0;
        int pFast;
        for (pFast=1;pFast<nums.length;pFast++){
    		if (nums[pFast] == nums[pSlow]+pFast-pSlow){
    			continue;
    		}
    		else {
    			if (pFast == pSlow+1) {
    				res.add(Integer.toString(nums[pSlow]));
    			}
    			else {
    				res.add(Integer.toString(nums[pSlow])+"->"+Integer.toString(nums[pFast-1]));
    			}
    			pSlow = pFast;
    		}
        }
		if (pFast==pSlow+1){
			res.add(Integer.toString(nums[pSlow]));
		}
		else {
			res.add(Integer.toString(nums[pSlow])+"->"+Integer.toString(nums[pFast-1]));
		}

        return res;
    }
    
    public static List<String> summaryRanges2(int[] nums) {
    	List<String> res = new ArrayList<String>();
    	
    	for (int i=0;i<nums.length;i++){
    		int tmp = nums[i];
    		while (i+1<nums.length && nums[i+1]==nums[i]+1) {
    			i++;
    		}
    		if (nums[i]>tmp){
    			res.add(Integer.toString(tmp)+"->"+Integer.toString(nums[i]));
    		}
    		else {
    			res.add(Integer.toString(tmp));
    		}
    	}
    	return res;
    }
}
