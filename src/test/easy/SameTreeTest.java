package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.SameTree;
import easy.TreeNode;


public class SameTreeTest {

	@Test
	public final void testIsSameTree1() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		p1.left = p2;
		p2.right = p3;
		p1.right = p4;
		
		TreeNode q1 = new TreeNode(1);
		TreeNode q2 = new TreeNode(2);
		TreeNode q3 = new TreeNode(3);
		TreeNode q4 = new TreeNode(4);
		q1.left = q2;
		q2.right = q3;
		q1.right = q4;
		
		assertTrue(SameTree.isSameTree(p1, q1));
	}

	@Test
	public final void testIsSameTree2() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		p1.left = p2;
		p2.left = p3;
		p1.right = p4;
		
		TreeNode q1 = new TreeNode(1);
		TreeNode q2 = new TreeNode(2);
		TreeNode q3 = new TreeNode(3);
		TreeNode q4 = new TreeNode(4);
		q1.left = q2;
		q2.right = q3;
		q1.right = q4;
		
		assertFalse(SameTree.isSameTree(p1, q1));
	}
}
