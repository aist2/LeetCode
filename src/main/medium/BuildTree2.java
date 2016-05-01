package medium;
import java.util.HashMap;
import java.util.Map;


public class BuildTree2 {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inOrderMap = new HashMap<Integer,Integer>();
        for (int i=0; i<inorder.length; i++){
        	inOrderMap.put(inorder[i], i);
        }
    	return build(inorder,postorder,inOrderMap,0,postorder.length-1,0,postorder.length-1);
    }
    
    private static TreeNode build(int[] inorder, 
    		int[] postorder, 
    		Map<Integer,Integer> inOrderMap,
    		int inStart,int inEnd, 
    		int postStart, int postEnd) {
    	if (inStart>inEnd) return null;
    	TreeNode node = new TreeNode(postorder[postEnd]);
    	int inOrderNodeIndex = inOrderMap.get(postorder[postEnd]);
    	int newInStart, newInEnd, newPostStart, newPostEnd;
    	
    	newInStart = inStart;
    	newInEnd = inOrderNodeIndex-1;
    	newPostStart = postStart;
    	newPostEnd = newPostStart + newInEnd - newInStart;
		node.left = build(inorder,postorder,inOrderMap,newInStart,newInEnd,newPostStart,newPostEnd);
    	newInStart = inOrderNodeIndex+1;
    	newInEnd = inEnd;
    	newPostStart = newPostEnd+1;
    	newPostEnd = newPostStart + newInEnd - newInStart;
		node.right = build(inorder,postorder,inOrderMap,newInStart,newInEnd,newPostStart,newPostEnd);
    	return node;
    }
}
