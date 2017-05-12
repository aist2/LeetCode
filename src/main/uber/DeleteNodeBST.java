package uber;

/**
 * Created by ericli on 11/5/17.
 */
public class DeleteNodeBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else { // key == root.val
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                TreeNode newNode = root.right;
                while (newNode.left != null) {
                    newNode = newNode.left;
                }
                root.val = newNode.val;
                root.right = deleteNode(root.right, newNode.val);
            }
        }
        return root;
    }
}
