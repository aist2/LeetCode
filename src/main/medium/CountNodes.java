package medium;

public class CountNodes {
    public static int countNodes(TreeNode root) {
    	if (root==null) return 0;
        int height = getHeight(root);
        int count = 0;
        while (root != null) {
        	if (getHeight(root.right) == height-1) {
        		count += 1 << height;
        		root = root.right;
        	} else {
        		count += 1 << height-1;
        		root = root.left;
        	}
        	height--;
        }
    	return count;
    }
    
    private static int getHeight(TreeNode root) {
    	if (root == null)
    		return -1;
    	return 1+getHeight(root.left);
    }
    
}
