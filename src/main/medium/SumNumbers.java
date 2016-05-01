package medium;


public class SumNumbers {
    public static int sumNumbers(TreeNode root) {
    	return helper(root,0);
    }
    
    private static int helper(TreeNode node, int val) {
    	if (node==null)
    		return 0;
    	val = val*10 + node.val;
    	if (node.left==null && node.right==null)
    		return val;
    	return helper(node.left, val) + helper(node.right, val);
    }
}
