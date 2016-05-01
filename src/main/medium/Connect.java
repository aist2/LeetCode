package medium;
import java.util.LinkedList;
import java.util.Queue;


public class Connect {
    public static void connect(TreeLinkNode root) {
    	if (root==null) return;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        int count = 0;
        int h = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
        	count++;
        	TreeLinkNode node = queue.poll();
        	if (count == 1<<h ) {
        		h++;
        		count = 0;
        	} else {
        		node.next = queue.peek();
        	}
        	if (node.left!=null)
        		queue.offer(node.left);
        	if (node.right!=null)
        		queue.offer(node.right);
        }
    }
}
