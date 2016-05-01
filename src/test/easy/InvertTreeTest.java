package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.InvertTree;
import easy.TreeNode;


public class InvertTreeTest {

	@Test
	public final void testInvertTree() {
		TreeNode p1 = new TreeNode(5);
		TreeNode p2 = new TreeNode(4);
		TreeNode p3 = new TreeNode(8);
		TreeNode p4 = new TreeNode(11);
		TreeNode p5 = new TreeNode(13);
		TreeNode p6 = new TreeNode(4);
		TreeNode p7 = new TreeNode(7);
		p1.left = p2;
		p1.right = p3;
		p2.left = p4;
		p2.right = p5;
		p3.left = p6;
		p3.right = p7;
		
		TreeNode res = InvertTree.invertTree(p1);
		assertEquals(p1,res);
		assertEquals(p3,p1.left);
		assertEquals(p2,p1.right);
		assertEquals(p5,p2.left);
		assertEquals(p4,p2.right);
		assertEquals(p7,p3.left);
		assertEquals(p6,p3.right);
	}
}
