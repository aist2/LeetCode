package easy;
public class SameTree {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		return isSameTree1(p, q);
	}

	public static boolean isSameTree1(TreeNode p, TreeNode q) {
		if (p == null || q == null) return p == q;
		return (p.val == q.val) && isSameTree1(p.left, q.left) && isSameTree1(p.right, q.right);
	}
}
