package easy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder1(TreeNode root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
		levelOrderHelper(root,1,list);
		return list;
    }
    
    private static void levelOrderHelper(TreeNode node, int level, List<List<Integer>> nodeList) {
    	if (node == null) return;
    	if (level > nodeList.size()) nodeList.add(new ArrayList<Integer>());
    	nodeList.get(level-1).add(node.val);
    	levelOrderHelper(node.left,level+1,nodeList);
    	levelOrderHelper(node.right,level+1,nodeList);
    	return;
    }
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if (root==null) return list;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.offer(root);
    	int currLevelNodeCount;
    	TreeNode currNode;
    	List<Integer> currList;
    	while (!q.isEmpty()) {
    		currList = new ArrayList<Integer>();
    		currLevelNodeCount = q.size();
    		for (int i=0; i<currLevelNodeCount; i++) {
    			currNode = q.poll();
    			if (currNode.left != null) q.offer(currNode.left);
        		if (currNode.right != null) q.offer(currNode.right);
    			currList.add(currNode.val);
    		}
    		list.add(currList);
    	}
		return list;
    }
}
