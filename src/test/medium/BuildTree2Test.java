package medium;
import static org.junit.Assert.*;
import medium.BuildTree2;
import medium.TreeNode;

import org.junit.Test;


public class BuildTree2Test {
	@Test
	public final void test() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		p1.left = p2;
		p1.right = p3;
		p2.right = p4;
		
		int[] post = {4,2,3,1};
		int[] in = {2,4,1,3};
		TreeNode res = BuildTree2.buildTree(in,post);
		
		assertEquals(p1.val,res.val);
		assertEquals(p2.val,res.left.val);
		assertEquals(p3.val,res.right.val);
		assertEquals(p4.val,res.left.right.val);
	}

}
