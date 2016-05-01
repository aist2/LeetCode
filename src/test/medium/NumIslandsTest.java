package medium;
import static org.junit.Assert.*;

import org.junit.Test;

import medium.NumIslands;

public class NumIslandsTest {

	@Test
	public void test() {
		char[][] grid = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','1'}
		};
		
		assertEquals(2,NumIslands.numIslands(grid));
	}

}
