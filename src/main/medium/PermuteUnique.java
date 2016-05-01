package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PermuteUnique {
	public static List<List<Integer>> permuteUnique(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		helper(list, new ArrayList<Integer>(), nums, used);
		return list;
	}
	
	private static void helper(List<List<Integer>>list, List<Integer> subList, int[] nums, boolean[] used){
		if (subList.size() == nums.length){
			list.add(new ArrayList<Integer>(subList));
			return;
		}
		for (int i=0; i<nums.length; i++){
			if (used[i])
				continue;
			if (i>0 && nums[i]==nums[i-1] && !used[i-1])
				continue;
			
			used[i] = true;
			subList.add(nums[i]);
			helper(list,subList,nums,used);
			subList.remove(subList.size()-1);
			used[i] = false;
		}
	}
	
	
	
    public static List<List<Integer>> permuteUnique1(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> list = new ArrayList<>();
    	List<Integer> subList = new ArrayList<Integer>();
    	subList.add(nums[0]);
    	list.add(subList);
    	
    	for (int i=1; i<nums.length; i++) {
    		List<List<Integer>> newList = new ArrayList<>();
    		for (int j=0; j<=i; j++) {
    			for (List<Integer> item:list) {
    				List<Integer> newSubList = new ArrayList<>(item);
    				if (j<newSubList.size()&&newSubList.get(j)==nums[i])
    					continue;
    				newSubList.add(j, nums[i]);
    				newList.add(newSubList);
    			}
    		}
    		list = newList;
    	}
        return list;
    }
}
