package medium;
import static org.junit.Assert.*;
import medium.SumNumbers;
import medium.TreeNode;

import org.junit.Test;


public class SumNumbersTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.left = n2;
		n1.right = n3;
		assertEquals(25, SumNumbers.sumNumbers(n1));
	}

}
