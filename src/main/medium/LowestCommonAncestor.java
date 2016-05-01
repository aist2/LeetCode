package medium;
import java.util.ArrayList;
import java.util.List;


public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pList = new ArrayList<TreeNode>();
        List<TreeNode> qList = new ArrayList<TreeNode>();
        helper(root, p, q, pList, qList, new ArrayList<TreeNode>());
        
        TreeNode common = null;
        int len = Math.min(pList.size(), qList.size());
        for (int i=0; i<len; i++) {
        	if (pList.get(i)==qList.get(i))
        		common = pList.get(i);
        	else
        		break;
        }
    	return common;
    }
    
    private static void helper(TreeNode node, TreeNode p, TreeNode q, 
    		List<TreeNode> pList, List<TreeNode> qList, List<TreeNode> currList) {
    	if (node == null)
    		return;
    	if (pList.size()>0 && qList.size()>0)
    		return;
    	currList.add(node);
    	if (node == p)
    		pList.addAll(currList);
    	if (node == q)
    		qList.addAll(currList);
		helper(node.left, p, q, pList, qList, currList);
		helper(node.right, p, q, pList, qList, currList);
    	currList.remove(currList.size()-1);
    }
}
