package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.PathSum;
import easy.TreeNode;


public class PathSumTest {

	@Test
	public final void testHasPathSum1() {
		TreeNode p1 = new TreeNode(5);
		TreeNode p2 = new TreeNode(4);
		TreeNode p3 = new TreeNode(8);
		TreeNode p4 = new TreeNode(11);
		TreeNode p5 = new TreeNode(13);
		TreeNode p6 = new TreeNode(4);
		TreeNode p7 = new TreeNode(7);
		TreeNode p8 = new TreeNode(2);
		TreeNode p9 = new TreeNode(1);
		p1.left = p2;
		p1.right = p3;
		p2.left = p4;
		p3.left = p5;
		p3.right = p6;
		p4.left = p7;
		p4.right = p8;
		p6.right = p9;
		
		assertTrue(PathSum.hasPathSum(p1, 22));	
	}
	
	@Test
	public final void testHasPathSum2() {
		TreeNode p1 = new TreeNode(5);
		TreeNode p2 = new TreeNode(4);
		TreeNode p3 = new TreeNode(8);
		TreeNode p4 = new TreeNode(11);
		TreeNode p5 = new TreeNode(13);
		TreeNode p6 = new TreeNode(4);
		TreeNode p7 = new TreeNode(7);
		TreeNode p8 = new TreeNode(2);
		TreeNode p9 = new TreeNode(1);
		p1.left = p2;
		p1.right = p3;
		p2.left = p4;
		p3.left = p5;
		p3.right = p6;
		p4.left = p7;
		p4.right = p8;
		p6.right = p9;
		
		assertFalse(PathSum.hasPathSum(p1, 99));	
	}

	@Test
	public final void testHasPathSum3() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);

		p1.left = p2;
		
		assertFalse(PathSum.hasPathSum(p1, 1));	
	}
}
