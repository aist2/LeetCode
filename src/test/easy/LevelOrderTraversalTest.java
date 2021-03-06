package easy;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import easy.LevelOrderTraversal;
import easy.TreeNode;


public class LevelOrderTraversalTest {

	@Test
	public final void testLevelOrder() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		TreeNode p5 = new TreeNode(5);
		p1.left = p2;
		p1.right = p3;
		p3.left = p4;
		p3.right = p5;
		
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5));
		
		assertEquals(expected, LevelOrderTraversal.levelOrder(p1));
	}

}
