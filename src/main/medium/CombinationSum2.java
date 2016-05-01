package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (candidates.length == 0) return res;
        Arrays.sort(candidates);
    	helper(candidates, target, -1, res, new ArrayList<Integer>());
        return res;
    }
    
    private static void helper(int[] candidates, int target, int pos, List<List<Integer>> res, List<Integer> combination) {
    	if (target == 0) {
    		res.add(new ArrayList<Integer>(combination));
    		return;
    	}
    	for (int i = pos+1; i<candidates.length; i++) {
    		if (i > pos+1 && candidates[i] == candidates[i-1])
    			continue;
    		int sum = target - candidates[i];
    		if (sum >= 0) {
    			combination.add(candidates[i]);
    			helper(candidates, sum, i, res, combination);
    			combination.remove(combination.size()-1);
    		} else
    			break;
    	}
    }
}
