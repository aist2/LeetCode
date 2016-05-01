package medium;
import static org.junit.Assert.*;
import medium.UniquePaths2;

import org.junit.Test;

public class UniquePaths2Test {
	@Test
	public final void test() {
		assertEquals(2,UniquePaths2.uniquePathsWithObstacles(new int[][] {{0,0,0},{0,1,0},{0,0,0}}));
	}
	
	@Test
	public final void test1() {
		assertEquals(0,UniquePaths2.uniquePathsWithObstacles(new int[][] {{1,0}}));
	}
}
