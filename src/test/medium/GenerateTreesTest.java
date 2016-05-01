package medium;
import java.util.List;

import medium.GenerateTrees;
import medium.TreeNode;

import org.junit.Test;


public class GenerateTreesTest {

	@Test
	public final void test() {
		List<TreeNode> actual = GenerateTrees.generateTrees(3);
		System.out.println(actual);
	}

}
