package medium;
import static org.junit.Assert.*;
import medium.SearchMatrix;

import org.junit.Test;


public class SearchMatrixTest {

	@Test
	public final void testSearchMatrix1() {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		assertTrue(SearchMatrix.searchMatrix(matrix, 3));
	}
	@Test
	public final void testSearchMatrix2() {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		assertFalse(SearchMatrix.searchMatrix(matrix, 60));
	}
}
