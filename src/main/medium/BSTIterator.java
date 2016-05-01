package medium;
import java.util.Deque;
import java.util.LinkedList;

public class BSTIterator {
	Deque<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new LinkedList<>();
        stackUp(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
    	TreeNode next = stack.pop();
		stackUp(next.right);
        return next.val;
    }
    
    private void stackUp(TreeNode root) {
    	TreeNode node = root;
    	while (node != null) {
        	stack.push(node);
        	node = node.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */