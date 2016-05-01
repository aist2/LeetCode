package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.MaxDepth;
import easy.TreeNode;


public class MaxDepthTest {

	@Test
	public final void testMaxDepth() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		p1.left = p2;
		p2.right = p3;
		p1.right = p4;
		
		assertEquals(3,MaxDepth.maxDepth(p1));
	}

}
