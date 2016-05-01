package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combinationSum1(candidates, target);
    }
    
    public static List<List<Integer>> combinationSum1(int[] candidates, int target) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (candidates.length == 0) return list;
    	Arrays.sort(candidates);
        helper(candidates, list, new LinkedList<Integer>(), 0, target);
    	return list;
    }
    
    private static void helper(int[] candidates, List<List<Integer>> list, List<Integer> currList, int i, int target) {
    	for (int j = i; j < candidates.length; j++) {
        	int sum = target - candidates[j];
        	List<Integer> currListCopy = new LinkedList<Integer>(currList);
        	if (sum == 0){
        		currListCopy.add(candidates[j]);
        		list.add(currListCopy);
        		return;
        	} else if (sum >= candidates[j]) {
        		currListCopy.add(candidates[j]);
        		helper(candidates, list, currListCopy, j, sum);
        	} else if (sum < 0)
        		return;
    	}
    }
}
