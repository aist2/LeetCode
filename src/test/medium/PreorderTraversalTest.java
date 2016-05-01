package medium;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.PreorderTraversal;
import medium.TreeNode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class PreorderTraversalTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.right = n2;
		n2.left = n3;
		List<Integer> expected = Arrays.asList(1,2,3);
		assertThat(PreorderTraversal.preorderTraversal(n1), is(expected));
	}

}
