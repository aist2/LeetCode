package easy;

import java.util.Arrays;
import java.util.HashMap;


public class ContainDuplicate {
	public static boolean containsDuplicateV1(int[] nums) {
		HashMap<Integer,Boolean> dupMap = new HashMap<Integer,Boolean>();
		for (int i=0;i<nums.length;i++){
			if (dupMap.containsKey(new Integer(nums[i]))){
				return true;
			}
			else {
				dupMap.put(new Integer(nums[i]), true);
			}
		}
        return false;
    }
	public static boolean containsDuplicateV2(int[] nums) {
		Arrays.sort(nums);
		for (int i=0;i<nums.length-1;i++){
			if (nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
    }
}
