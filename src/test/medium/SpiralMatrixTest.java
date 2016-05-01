package medium;
import static org.junit.Assert.*;

import java.util.Arrays;

import medium.SpiralMatrix;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class SpiralMatrixTest {

	@Test
	public final void testSpiralOrder1() {
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		assertThat(SpiralMatrix.spiralOrder(matrix),is(Arrays.asList(1,2,3,6,9,8,7,4,5)));
	}
	@Test
	public final void testSpiralOrder2() {
		int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		assertThat(SpiralMatrix.spiralOrder(matrix),is(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7)));
	}
}
