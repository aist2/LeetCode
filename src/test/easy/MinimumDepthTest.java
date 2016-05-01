package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.MinimumDepth;
import easy.TreeNode;


public class MinimumDepthTest {

	@Test
	public final void testMinDepth1() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		TreeNode p5 = new TreeNode(4);
		TreeNode p6 = new TreeNode(4);
		TreeNode p7 = new TreeNode(4);
		p1.left = p2;
		p1.right = p3;
		p2.left = p4;
		p2.right = p5;
		p4.left = p6;
		p4.right = p7;
		
		assertEquals(2,MinimumDepth.minDepth(p1));
	}

	@Test
	public final void testMinDepth2() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		p1.left = p2;
		
		assertEquals(2,MinimumDepth.minDepth(p1));
	}
}
