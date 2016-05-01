package medium;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class PreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if (root==null) return resList;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
        	TreeNode node = stack.pop();
        	resList.add(node.val);
        	if (node.right != null)
        		stack.push(node.right);
        	if (node.left != null)
        		stack.push(node.left);
        }
    	return resList;
    }
}
