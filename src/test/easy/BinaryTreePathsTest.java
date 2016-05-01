package easy;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import easy.BinaryTreePaths;
import easy.TreeNode;


public class BinaryTreePathsTest {

	@Test
	public final void testBinaryTreePaths() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(5);
		p1.left = p2;
		p1.right = p3;
		p2.right = p4;
		
		List<String> expected = new ArrayList<String>();
		expected.add("1->2->5");
		expected.add("1->3");
		assertEquals(expected,BinaryTreePaths.binaryTreePaths(p1));
	}

}
