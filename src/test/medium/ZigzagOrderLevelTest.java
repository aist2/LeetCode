package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.TreeNode;
import medium.ZigzagOrderLevel;

import org.junit.Test;

public class ZigzagOrderLevelTest {

	@Test
	public final void test() {
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(20,9), Arrays.asList(15,7));
		TreeNode n3 = new TreeNode(3);
		TreeNode n9 = new TreeNode(9);
		TreeNode n20 = new TreeNode(20);
		TreeNode n15 = new TreeNode(15);
		TreeNode n7 = new TreeNode(7);
		n3.left = n9;
		n3.right = n20;
		n20.left = n15;
		n20.right = n7;
		List<List<Integer>> actual = ZigzagOrderLevel.zigzagLevelOrder(n3);
		assertThat(actual, is(expected));
	}

}
