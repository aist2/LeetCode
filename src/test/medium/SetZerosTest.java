package medium;
import static org.junit.Assert.*;
import medium.SetZeros;

import org.junit.Test;


public class SetZerosTest {

	@Test
	public final void testSetZeroes1() {
		int[][] matrix = {{1,2,3},{4,5,6},{7,0,0},{10,11,12}};
		int[][] expected = {{1,0,0},{4,0,0},{0,0,0},{10,0,0}};
		SetZeros.setZeroes(matrix);
		assertArrayEquals(matrix,expected);
	}
	
	@Test
	public final void testSetZeroes2() {
		int[][] matrix = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		int[][] expected = {{0,0,0,0},{0,0,0,4},{0,0,0,0},{0,0,0,3},{0,0,0,0}};
		SetZeros.setZeroes(matrix);
		assertArrayEquals(matrix,expected);
	}

}
