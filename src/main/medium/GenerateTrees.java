package medium;
import java.util.ArrayList;
import java.util.List;


public class GenerateTrees {
    public static List<TreeNode> generateTrees(int n) {
    	if (n==0) return new ArrayList<TreeNode>();
    	List<TreeNode>[] arr = new List[n+1];
    	arr[0] = new ArrayList<TreeNode>();
    	arr[0].add(null);
    	for (int i=1; i<=n; i++) {
    		arr[i] = new ArrayList<TreeNode>();
    		for (int j=1; j<=i; j++) {
    			for (TreeNode nodeLeft: arr[j-1]) {
    				for (TreeNode nodeRight: arr[i-j]) {
    					TreeNode node = new TreeNode(j);
    					node.left = deepCopy(nodeLeft,0);
    					node.right = deepCopy(nodeRight,j);
    					arr[i].add(node);
    				}
    			}
    		}
    	}
        return arr[n];
    }
    
    private static TreeNode deepCopy(TreeNode node, int offset) {
    	if (node==null)
    		return null;
    	TreeNode newNode = new TreeNode(node.val+offset);
    	newNode.left = deepCopy(node.left, offset);
    	newNode.right = deepCopy(node.right, offset);
    	return newNode;
    }
}