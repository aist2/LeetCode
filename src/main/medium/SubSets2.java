package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
    	Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<List<Integer>> prevSubList = new ArrayList<List<Integer>>();
        list.add(new ArrayList<Integer>());
        for (int i = 0; i<nums.length; i++) {
        	List<List<Integer>> currSubList = new ArrayList<List<Integer>>();
        	List<List<Integer>> iterList; 
        	if (i == 0 || nums[i] != nums[i-1])
        		iterList = list;
        	else
        		iterList = prevSubList;
        	for (List<Integer> item:iterList) {
        		List<Integer> newItem = new ArrayList<Integer>(item);
        		newItem.add(nums[i]);
        		currSubList.add(newItem);
        	}
        	list.addAll(currSubList);
        	prevSubList = currSubList;
        }
        return list;
    }
}
