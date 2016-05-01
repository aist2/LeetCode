package medium;
import static org.junit.Assert.*;
import medium.LowestCommonAncestor;
import medium.TreeNode;

import org.junit.Test;


public class LowestCommonAncestorTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		TreeNode n0 = new TreeNode(0);
		n3.left = n5;
		n3.right = n1;
		n5.left = n6;
		n5.right = n2;
		n1.left = n0;
		n1.right = n8;
		n2.left = n7;
		n2.right = n4;
		
		assertEquals(n3, LowestCommonAncestor.lowestCommonAncestor(n3, n5, n1));
		assertEquals(n5, LowestCommonAncestor.lowestCommonAncestor(n3, n5, n4));
	}

}
