package easy;

public class MinimumDepth {
    public static int minDepth(TreeNode root) {
        return minDepth1(root);
    }
    
    private static int minDepth1(TreeNode root) {
    	if (root==null) return 0;
    	if (root.left==null) return minDepth1(root.right)+1;
    	if (root.right==null) return minDepth1(root.left)+1;
        return Math.min(minDepth1(root.left), minDepth1(root.right))+1;
    }
}
