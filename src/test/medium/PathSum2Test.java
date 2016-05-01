package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.PathSum2;
import medium.TreeNode;

import org.junit.Test;

public class PathSum2Test {

	@Test
	public final void test() {
		TreeNode n5 = new TreeNode(5);
		TreeNode n4 = new TreeNode(4);
		TreeNode n8 = new TreeNode(8);
		TreeNode n11 = new TreeNode(11);
		TreeNode n13 = new TreeNode(13);
		TreeNode n4_2 = new TreeNode(4);
		TreeNode n7 = new TreeNode(7);
		TreeNode n2 = new TreeNode(2);
		TreeNode n5_2 = new TreeNode(5);
		TreeNode n1 = new TreeNode(1);
		n5.left = n4;
		n5.right = n8;
		n4.left = n11;
		n8.left = n13;
		n8.right = n4_2;
		n11.left = n7;
		n11.right = n2;
		n4_2.left = n5_2;
		n4_2.right = n1;
		
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(5,4,11,2),Arrays.asList(5,8,4,5));
		assertThat(PathSum2.pathSum(n5, 22), is(expected));
	}

}
