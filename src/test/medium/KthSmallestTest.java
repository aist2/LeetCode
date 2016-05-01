package medium;
import static org.junit.Assert.*;
import medium.KthSmallest;
import medium.TreeNode;

import org.junit.Test;


public class KthSmallestTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n3 = new TreeNode(3);
		TreeNode n6 = new TreeNode(6);
		TreeNode n8 = new TreeNode(8);
		TreeNode n9 = new TreeNode(9);
		n8.left = n3;
		n8.right = n9;
		n3.left = n1;
		n3.right = n6;
		
		assertEquals(6, KthSmallest.kthSmallest(n8, 3));
	}

}
