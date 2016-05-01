package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.RightSideView;
import medium.TreeNode;

import org.junit.Test;

public class RightSideViewTest {

	@Test
	public final void test() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		TreeNode n9 = new TreeNode(9);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n4.right = n7;
		n5.left = n8;
		n7.right = n9;
		
		List<Integer> expected = Arrays.asList(1,3,6,8,9);
		assertThat(RightSideView.rightSideView(n1), is(expected));
	}

}
