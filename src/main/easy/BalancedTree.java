package easy;

public class BalancedTree {
    public static boolean isBalanced(TreeNode root) {
        return isBalanced1(root);
    }
    
    public static boolean isBalanced1(TreeNode root) {
    	return height(root)!=-1;
    }
    
    private static int height(TreeNode root) {
    	if (root==null) return 0;
    	int left = height(root.left);
    	int right = height(root.right);
    	if ((left==-1||right==-1)||(Math.abs(left-right)>1)) return -1;
    	return Math.max(left, right)+1;
    }
}
