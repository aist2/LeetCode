package medium;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class ZigzagOrderLevel {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	Deque<TreeNode> stackLeftRight = new LinkedList<>();
    	Deque<TreeNode> stackRightLeft = new LinkedList<>();
    	List<List<Integer>> resList = new LinkedList<>();
    	if (root==null) return resList;
    	stackLeftRight.push(root);
    	while (!stackLeftRight.isEmpty() || !stackRightLeft.isEmpty()) {
    		//left to right
    		List<Integer> currList = new LinkedList<>();
    		while (!stackLeftRight.isEmpty()) {
    			TreeNode currNode = stackLeftRight.pop();
    			currList.add(currNode.val);
    			if (currNode.left != null)
    				stackRightLeft.push(currNode.left);
    			if (currNode.right != null)
    				stackRightLeft.push(currNode.right);
    		}
    		if (!currList.isEmpty())
    			resList.add(new LinkedList<Integer>(currList));
    		//right to left
    		currList.clear();
    		while (!stackRightLeft.isEmpty()) {
    			TreeNode currNode = stackRightLeft.pop();
    			currList.add(currNode.val);
    			if (currNode.right != null)
    				stackLeftRight.push(currNode.right);
    			if (currNode.left != null)
    				stackLeftRight.push(currNode.left);
    		}
    		if (!currList.isEmpty())
    			resList.add(new LinkedList<Integer>(currList));
    	}
        return resList;
    }
}
