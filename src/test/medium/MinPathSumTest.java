package medium;
import static org.junit.Assert.*;
import medium.MinPathSum;

import org.junit.Test;


public class MinPathSumTest {

	@Test
	public final void test() {
		int[][] grid = {
				{1,1,3,4},
				{5,1,1,4},
				{7,8,1,9},
				{3,1,1,1}
			};
		assertEquals(7, MinPathSum.minPathSum(grid));
	}

}
