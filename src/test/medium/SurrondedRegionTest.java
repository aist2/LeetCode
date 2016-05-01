package medium;
import static org.junit.Assert.*;

import org.junit.Test;

import medium.SurrondedRegion;

public class SurrondedRegionTest {

	@Test
	public void test() {
		char[][] board = {
				{'X','X','X','X'},
				{'X','O','O','X'},
				{'X','X','O','X'},
				{'X','O','X','X'}
		};
		char[][] expected = {
				{'X','X','X','X'},
				{'X','X','X','X'},
				{'X','X','X','X'},
				{'X','O','X','X'}
		};
		SurrondedRegion.solve(board);
		
		assertArrayEquals(expected, board);
	}
	@Test
	public void test1() {
		char[][] board = {
				{'X'},
		};
		char[][] expected = {
				{'X'}
		};
		SurrondedRegion.solve(board);
		
		assertArrayEquals(expected, board);
	}
	@Test
	public void test2() {
		char[][] board = {
				{'O','O'},
				{'O','O'}
		};
		char[][] expected = {
				{'O','O'},
				{'O','O'}
		};
		SurrondedRegion.solve(board);
		
		assertArrayEquals(expected, board);
	}
}
