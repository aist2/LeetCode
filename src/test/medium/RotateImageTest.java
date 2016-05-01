package medium;
import static org.junit.Assert.*;
import medium.RotateImage;

import org.junit.Test;


public class RotateImageTest {

	@Test
	public final void testRotate1() {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] expected = {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}};
		RotateImage.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}
	
	@Test
	public final void testRotate2() {
		int[][] matrix = {{1,2},{3,4}};
		int[][] expected = {{3,1},{4,2}};
		RotateImage.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}

	@Test
	public final void testRotate3() {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
		RotateImage.rotate(matrix);
		assertArrayEquals(expected, matrix);
	}

}
