package easy;

import java.util.HashMap;
import java.util.HashSet;


public class ContainDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        return containsNearbyDuplicate2(nums,k);
    }
    
    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	Integer val;
    	for (int i=0; i<nums.length; i++) {
    		val = map.get(nums[i]);
    		if (val != null && (Math.abs(val-i)<=k)){
    			return true;
    		}
    		map.put(nums[i],i);
    	}
        return false;
    }
    
    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	for (int i=0; i<nums.length; i++) {
    		if (i>k) set.remove(nums[i-k-1]);
    		if (!set.add(nums[i])) return true;
    	}
        return false;
    }
}
