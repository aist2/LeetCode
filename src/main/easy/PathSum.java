package easy;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum1(root, sum);
    }
    
    public static boolean hasPathSum1(TreeNode root, int sum) {
        return sum(root,0,sum);
    }
    
    private static boolean sum(TreeNode root, int sum, int expected) {
    	if (root==null) return false;
    	sum += root.val;
    	if (root.left==null && root.right==null) return sum==expected;
    	return sum(root.left,sum,expected)||sum(root.right,sum,expected);
    }
}
