package easy;
import java.util.ArrayList;
import java.util.List;


public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePaths1(root);
    }
    
    public static List<String> binaryTreePaths1(TreeNode root) {
    	List<String> res = new ArrayList<String>();
    	if (root!=null) traverse(root,"", res);
        return res;
    }
    
    private static void traverse(TreeNode root, String currStr, List<String> pathList) {
    	String newStr = currStr;
    	if (newStr.length() > 0)
    		newStr += "->";
    	newStr += Integer.toString(root.val);
    	if (root.left!=null) traverse(root.left,newStr,pathList);
    	if (root.right!=null) traverse(root.right,newStr,pathList);
    	if (root.left==null&&root.right==null) pathList.add(newStr.toString());
    }
}
