package medium;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class InorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        while (curr!=null || !stack.isEmpty()) {
        	if (curr!=null) {
        		stack.push(curr);
        		curr = curr.left;
        	}
        	else {
        		curr = stack.pop();
        		finalList.add(curr.val);
        		curr = curr.right;
        	}
        }
        return finalList;
    }
	
    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        Set<TreeNode> parentSet = new HashSet<>();
        stack.add(root);
        while (root!=null||!stack.isEmpty()) {
        	TreeNode curr = stack.pop();
        	if (curr.left==null && curr.right==null) {
        		finalList.add(curr.val);
        		continue;
        	}
        	else if (parentSet.contains(curr)) {
        		finalList.add(curr.val);
        		parentSet.remove(curr);
        		continue;
        	}
        	if (curr.right!=null) {
        		stack.push(curr.right);
        	}
        	stack.push(curr);
        	parentSet.add(curr);
        	if (curr.left!=null) {
        		stack.push(curr.left);
        	}
        }
        return finalList;
    }
	
	
    public static List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        traverse(finalList,root);
        return finalList;
    }
    
    private static void traverse(List<Integer> list, TreeNode root) {
    	if (root==null) return;
    	traverse(list,root.left);
    	list.add(root.val);
    	traverse(list,root.right);
    }
}
