package medium;

public class Flatten {
    public static void flatten(TreeNode root) {
    	if(root==null) return;
        helper(root);
    }
    
    private static TreeNode helper(TreeNode node) {
    	if (node.left != null) {
    		TreeNode left = node.left;
    		TreeNode right = node.right;
			TreeNode tailOfLeft = helper(left);
			node.left = null;
			node.right = left;
			tailOfLeft.right = right;
    	}
    	TreeNode tail = node;
    	while (tail.right!=null) {
    		tail = helper(tail.right);
    	}
    	return tail;
    }
}
