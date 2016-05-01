package medium;

public class IsValidBST {
    public static boolean isValidBST(TreeNode root) {
    	return helper(root,(long)Integer.MIN_VALUE-1,(long)Integer.MAX_VALUE+1);
    }
    
    private static boolean helper(TreeNode root, long lowBound, long highBound) {
    	if (root == null)
    		return true;
    	boolean res = root.val > lowBound && root.val < highBound;
    	if (!res)
    		return false;
    	return helper(root.left, lowBound, Math.min(highBound, root.val)) 
    			&& helper(root.right, Math.max(lowBound, root.val), highBound);    	
    }
}
