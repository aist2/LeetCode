package medium;
import static org.junit.Assert.*;
import medium.Flatten;
import medium.TreeNode;

import org.junit.Test;


public class FlattenTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		n1.left = n2;
		n1.right = n5;
		n2.left = n3;
		n2.right = n4;
		n5.right = n6;
		Flatten.flatten(n1);
		assertEquals(n2, n1.right);
		assertEquals(n3, n2.right);
		assertEquals(n4, n3.right);
		assertEquals(n5, n4.right);
		assertEquals(n6, n5.right);
	}

}
