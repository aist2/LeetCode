package easy;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderBottomTraversal {
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        return levelOrderBottom1(root);
    }
	public static List<List<Integer>> levelOrderBottom1(TreeNode root) {
		LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()){
        	int currLevelCount = q.size();
        	List<Integer> currList = new LinkedList<Integer>();
        	for (int i=0;i<currLevelCount;i++){
        		TreeNode curr = q.poll();
        		currList.add(curr.val);
        		if (curr.left != null) q.add(curr.left);
        		if (curr.right != null) q.add(curr.right);
        	}
        	res.addFirst(currList);;
        }
    	return res;
    }
}
