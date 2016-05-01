package medium;
import java.util.ArrayList;
import java.util.List;


public class PathSum2 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> resList = new ArrayList<>();
        helper(root, sum, resList, new ArrayList<Integer>());
    	return resList;
    }
    
    private static void helper(TreeNode node, int sum, 
    		List<List<Integer>> resList, List<Integer> currList) {
    	if (node==null)
    		return;
    	sum -= node.val;
    	currList.add(node.val);
    	if (sum==0 && node.left==null && node.right==null)
    		resList.add(new ArrayList<Integer>(currList));
    	else {
	    	if (node.left != null)
	    		helper(node.left, sum, resList, currList);
	    	if (node.right != null)
	    		helper(node.right, sum, resList, currList);
    	}
    	currList.remove(currList.size()-1);
    }
}
