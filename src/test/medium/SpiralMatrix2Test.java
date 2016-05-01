package medium;
import static org.junit.Assert.*;
import medium.SpiralMatrix2;

import org.junit.Test;


public class SpiralMatrix2Test {

	@Test
	public final void testGenerateMatrix1() {
		int[][] matrix = new int[][]{{1,2,3},{8,9,4},{7,6,5}};
		assertArrayEquals(matrix, SpiralMatrix2.generateMatrix(3));
	}
	
	@Test
	public final void testGenerateMatrix2() {
		int[][] matrix = new int[][]{};
		assertArrayEquals(matrix, SpiralMatrix2.generateMatrix(0));
	}
	
	@Test
	public final void testGenerateMatrix3() {
		int[][] matrix = new int[][]{{1}};
		assertArrayEquals(matrix, SpiralMatrix2.generateMatrix(1));
	}

}
