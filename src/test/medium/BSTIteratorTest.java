package medium;
import static org.junit.Assert.*;
import medium.BSTIterator;
import medium.TreeNode;

import org.junit.Test;


public class BSTIteratorTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n2.left = n1;
		n2.right = n4;
		n4.left = n3;
		n4.right = n5;
		BSTIterator iterator = new BSTIterator(n2);
		assertEquals(1,iterator.next());
		assertEquals(2,iterator.next());
		assertEquals(3,iterator.next());
		assertEquals(4,iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(5,iterator.next());
		assertFalse(iterator.hasNext());
	}

}
