package easy;
import java.util.LinkedList;
import java.util.Queue;


public class MaxDepth {
	public static int maxDepth(TreeNode root) {
		return maxDepth2(root);
	}
	
    public static int maxDepth1(TreeNode root) {
    	if (root == null) return 0;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
    	int depth=0;
    	while (!q.isEmpty()) {
    		int currLevelCount = q.size();
    		for (int i=0; i<currLevelCount; i++) {
    			TreeNode currNode = q.poll();
    			if (currNode.left != null) q.add(currNode.left);
    			if (currNode.right != null) q.add(currNode.right);
    		}
    		depth++;
    	}
        return depth;
    }
    
    public static int maxDepth2(TreeNode root) {
    	if (root==null) return 0;
    	return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
    }
}
