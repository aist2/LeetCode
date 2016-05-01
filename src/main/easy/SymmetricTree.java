package easy;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric1(root);
    }
    
    public static boolean isSymmetric1(TreeNode root) {
    	if (root == null) return true;
        return isSymmetric1(root.left, root.right);
    }
    
    public static boolean isSymmetric1(TreeNode p, TreeNode q) {
    	if (p == null || q == null) return p==q;
    	return (p.val == q.val) && isSymmetric1(p.left, q.right) && isSymmetric1(p.right, q.left);
    }
}
