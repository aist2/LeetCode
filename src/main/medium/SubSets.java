package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubSets {
    public static List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	res.add(Arrays.asList());
    	helper(res, nums);
        return res;
    }
    
    private static void helper(List<List<Integer>> res, int[] nums) {
    	int head = nums[0];
    	if (nums.length == 1) {
    		List<Integer> list = Arrays.asList(head);
    		res.add(list);
    	} else {
    		helper(res, Arrays.copyOfRange(nums, 1, nums.length));
    		List<List<Integer>> newList = new ArrayList<List<Integer>>();
    		for (List<Integer> item: res) {
    			List<Integer> list = new ArrayList<Integer>(item);
    			list.add(0, head);
    			newList.add(list);
    		}
    		res.addAll(newList);
    	}
    }
}
