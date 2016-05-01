package medium;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import medium.CombinationSum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class CombinationSumTest {

	@Test
	public final void testCombinationSum1() {
		int[] candidates = { 3, 2, 6, 7 };
		List<List<Integer>> actual = CombinationSum.combinationSum(candidates, 7);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7));
		assertThat(actual, is(expected));
	}
	
	@Test
	public final void testCombinationSum2() {
		int[] candidates = { 1 };
		List<List<Integer>> actual = CombinationSum.combinationSum(candidates, 2);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,1));
		assertThat(actual, is(expected));
	}
	
	@Test
	public final void testCombinationSum3() {
		int[] candidates = { 2,3,5 };
		List<List<Integer>> actual = CombinationSum.combinationSum(candidates, 8);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2,3,3), Arrays.asList(3,5));
		assertThat(actual, is(expected));
	}

}
