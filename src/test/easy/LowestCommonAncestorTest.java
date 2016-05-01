package easy;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import easy.LowestCommonAncestor;
import easy.TreeNode;


public class LowestCommonAncestorTest {
	TreeNode p1;
	TreeNode p2;
	TreeNode p3;
	TreeNode p4;
	TreeNode p5;
	TreeNode p6;
	TreeNode p7;
	TreeNode p8;
	TreeNode p9;
	
	@Before
	public final void init() {
		p1 = new TreeNode(6);
		p2 = new TreeNode(2);
		p3 = new TreeNode(8);
		p4 = new TreeNode(0);
		p5 = new TreeNode(4);
		p6 = new TreeNode(7);
		p7 = new TreeNode(9);
		p8 = new TreeNode(3);
		p9 = new TreeNode(5);
		p1.left = p2;
		p1.right = p3;
		p2.left = p4;
		p2.right = p5;
		p3.left = p6;
		p3.right = p7;
		p4.left = p8;
		p4.right = p9;
	}
	
	@Test
	public final void testLowestCommonAncestor1() {
		assertEquals(p1, LowestCommonAncestor.lowestCommonAncestor(p1, p2, p3));
	}
	
	@Test
	public final void testLowestCommonAncestor2() {
		assertEquals(p2, LowestCommonAncestor.lowestCommonAncestor(p1, p2, p5));
	}

}
