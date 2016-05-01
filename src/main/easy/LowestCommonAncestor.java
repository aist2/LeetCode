package easy;
import java.util.LinkedList;
import java.util.List;


public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestor2(root, p, q);
    }
    
    public static TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
    	if (root==null||p==null|q==null) return null;
    	TreeNode curr = root;
    	List<TreeNode> listP = new LinkedList<TreeNode>();
    	List<TreeNode> listQ = new LinkedList<TreeNode>();
    	while (curr!=null) {
    		listP.add(0, curr);
    		if (curr.val == p.val)
    			break;
    		else if (curr.val > p.val)
    			curr = curr.left;
    		else
    			curr = curr.right;
    	}
    	if (listP.isEmpty() || listP.get(0) != p) return null;
    	
    	curr = root;
    	while (curr!=null) {
    		listQ.add(0, curr);
    		if (curr.val == q.val)
    			break;
    		else if (curr.val > q.val)
    			curr = curr.left;
    		else
    			curr = curr.right;
    	}
    	if (listQ.isEmpty() || listQ.get(0) != q) return null;
    	
    	for (TreeNode each:listP) {
    		if (listQ.indexOf(each) != -1)
    			return each;
    	}
        return null;
    }
    
    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    	while ((root.val - p.val) * (root.val - q.val) > 0){
    		if (root.val > p.val)
    			root = root.left;
    		else
    			root = root.right;
    	}
    	return root;
    }
}
