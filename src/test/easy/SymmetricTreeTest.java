package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.SymmetricTree;
import easy.TreeNode;


public class SymmetricTreeTest {

	@Test
	public final void testIsSymmetric1() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p11 = new TreeNode(2);
		TreeNode p12 = new TreeNode(2);
		TreeNode p21 = new TreeNode(3);
		TreeNode p22 = new TreeNode(4);
		TreeNode p23 = new TreeNode(4);
		TreeNode p24 = new TreeNode(3);
		p1.left = p11;
		p1.right = p12;
		p11.left = p21;
		p11.right = p22;
		p12.left = p23;
		p12.right = p24;

		assertTrue(SymmetricTree.isSymmetric(p1));
	}
	
	@Test
	public final void testIsSymmetric2() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p11 = new TreeNode(2);
		TreeNode p12 = new TreeNode(2);
		TreeNode p21 = new TreeNode(3);
		TreeNode p22 = new TreeNode(3);
		p1.left = p11;
		p1.right = p12;
		p11.right = p21;
		p12.right = p22;

		assertFalse(SymmetricTree.isSymmetric(p1));
	}

}
