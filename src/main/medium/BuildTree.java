package medium;
import java.util.HashMap;
import java.util.Map;


public class BuildTree {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
    	Map<Integer,Integer> inOrderTable = new HashMap<Integer,Integer>();
    	for (int i=0; i<inorder.length; i++) {
    		inOrderTable.put(inorder[i], i);
    	}
        return build(preorder,inorder,inOrderTable,0,preorder.length-1,0,inorder.length-1);
    	
    }
    
    private static TreeNode build(int[] preorder, int[] inorder, Map<Integer,Integer> inOrderTable,
    		int preStart, int preEnd, int inStart, int inEnd) {
    	if (preStart > preEnd) return null;
    	
    	TreeNode root = new TreeNode(preorder[preStart]);
    	
    	int leftPreStart,leftPreEnd,leftInStart,leftInEnd;
    	int rightPreStart,rightPreEnd,rightInStart,rightInEnd;
    	
    	int inOrderRootNodeIndex = inOrderTable.get(preorder[preStart]);
    	
    	leftInStart = inStart;
    	leftInEnd = inOrderRootNodeIndex - 1;
    	
    	rightInStart = inOrderRootNodeIndex + 1;
    	rightInEnd = inEnd;
    	
    	leftPreStart = preStart + 1;
    	leftPreEnd = leftPreStart + leftInEnd - leftInStart;
    	
    	rightPreStart = leftPreEnd + 1;
    	rightPreEnd = rightPreStart + rightInEnd - rightInStart;
    	
    	root.left = build(preorder,inorder, inOrderTable, 
    			leftPreStart, leftPreEnd, leftInStart, leftInEnd);
    	root.right = build(preorder,inorder, inOrderTable, 
    			rightPreStart, rightPreEnd, rightInStart, rightInEnd);
    	return root;
    }
}
