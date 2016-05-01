package medium;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class KthSmallest {
    public static int kthSmallest(TreeNode root, int k) {
    	if (root==null) return 0;
    	List<TreeNode> list = new ArrayList<>();
    	Deque<TreeNode> stack = new LinkedList<>();
    	TreeNode p=root;
    	while (!stack.isEmpty() || p!= null|| list.size() < k) {
    		if (p!=null) {
    			stack.push(p);
    			p = p.left;
    		} else {
    			p = stack.pop();
    			list.add(p);
    			p = p.right;
    		}
    	}
        return list.get(k-1).val;
    }
}
