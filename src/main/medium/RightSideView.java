package medium;
import java.util.ArrayList;
import java.util.List;


public class RightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
    	List<Integer> resList = new ArrayList<>();
    	helper(root,resList,1);
        return resList;
    }
    
    private static void helper(TreeNode root, List<Integer> resList, int height) {
    	if (root==null)
    		return;
    	if (height > resList.size())
    		resList.add(root.val);
    	helper(root.right, resList, height+1);
    	helper(root.left, resList, height+1);
    }
}
