package medium;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import medium.FourSum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class FourSumTest {

	@Test
	public final void testFourSum1() {
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(-1, 0, 0, 1), 
				Arrays.asList(-2, -1, 1, 2),
				Arrays.asList(-2, 0, 0, 2));
		List<List<Integer>> actual = FourSum.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
		assertThat(actual, is(expected));
	}
	@Test
	public final void testFourSum2() {
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(-3,-2,2,3), 
				Arrays.asList(-3,-1,1,3),
				Arrays.asList(-3,0,0,3),
				Arrays.asList(-3,0,1,2),
				Arrays.asList(-2,-1,0,3),
				Arrays.asList(-2,-1,1,2),
				Arrays.asList(-2,0,0,2),
				Arrays.asList(-1,0,0,1)
				);
		List<List<Integer>> actual = FourSum.fourSum(new int[] { -3,-2,-1,0,0,1,2,3 }, 0);
		assertThat(actual, is(expected));
	}
}
