package medium;
import static org.junit.Assert.*;
import medium.SearchMatrix2;

import org.junit.Test;


public class SearchMatrix2Test {

	@Test
	public final void test() {
		int[][] matrix = {
		                  {1,   4,  7, 11, 15},
		                  {2,   5,  8, 12, 19},
		                  {3,   6,  9, 16, 22},
		                  {10, 13, 14, 17, 24},
		                  {18, 21, 23, 26, 30}};
		assertTrue(SearchMatrix2.searchMatrix(matrix, 14));
		assertTrue(SearchMatrix2.searchMatrix(matrix, 30));
		assertTrue(SearchMatrix2.searchMatrix(matrix, 1));
		assertTrue(SearchMatrix2.searchMatrix(matrix, 19));
		assertFalse(SearchMatrix2.searchMatrix(matrix, 0));
		assertFalse(SearchMatrix2.searchMatrix(matrix, 31));
		assertFalse(SearchMatrix2.searchMatrix(matrix, 20));
	}
	
	@Test
	public final void test2() {
		int[][] matrix = {{-1,3}};
		assertTrue(SearchMatrix2.searchMatrix(matrix, 3));
	}
	@Test
	public final void test3() {
		int[][] matrix = {{1,3,5}};
		assertTrue(SearchMatrix2.searchMatrix(matrix, 1));
	}
	@Test
	public final void test4() {
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		assertTrue(SearchMatrix2.searchMatrix(matrix, 15));
	}

}
