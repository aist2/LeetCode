package medium;
import static org.junit.Assert.*;
import medium.SortedArrayToBST;
import medium.TreeNode;

import org.junit.Test;


public class SortedArrayToBSTTest {

	@Test
	public final void test() {
		TreeNode root = SortedArrayToBST.sortedArrayToBST(new int[] {1,2,3,4,5});
		assertEquals(3, root.val);
		assertEquals(1, root.left.val);
		assertEquals(4, root.right.val);
		assertEquals(2, root.right.left.val);
		assertEquals(5, root.right.right.val);
	}

}
