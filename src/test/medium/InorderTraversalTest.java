package medium;
import java.util.Arrays;
import java.util.List;

import medium.InorderTraversal;
import medium.TreeNode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InorderTraversalTest {

	@Test
	public final void test() {
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		p1.right = p2;
		p2.left = p3;
		
		List<Integer> expected = Arrays.asList(1,3,2);
		assertThat(InorderTraversal.inorderTraversal(p1),is(expected));
	}

}
