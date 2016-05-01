package easy;
import java.util.Deque;
import java.util.LinkedList;


public class InvertTree {
	public static TreeNode invertTree(TreeNode root) {
        return invertTree2(root);
    }
	
	public static TreeNode invertTree1(TreeNode root) {
		if (root==null) return null;
		TreeNode node = root.left;
		root.left = root.right;
		root.right = node;
		invertTree1(root.left);
		invertTree1(root.right);
		return root;
	}
	
	public static TreeNode invertTree2(TreeNode root) {
		if (root == null) return root;
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode currNode = stack.pop();
			TreeNode temp = currNode.left;
			currNode.left = currNode.right;
			currNode.right = temp;
			if (currNode.left!=null) stack.push(currNode.left);
			if (currNode.right!=null) stack.push(currNode.right);
		}
        return root;
    }
}
