package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import medium.CombinationSum2;

import org.junit.Test;


public class CombinationSum2Test {

	@Test
	public final void testCombinationSum21() {
		int[] candidates = { 10,1,2,7,6,1,5 };
		List<List<Integer>> actual = CombinationSum2.combinationSum2(candidates, 8);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,1,6), Arrays.asList(1,2,5), Arrays.asList(1,7), Arrays.asList(2,6));
		assertThat(actual, is(expected));
	}
	
	@Test
	public final void testCombinationSum22() {
		int[] candidates = { 1,2,2,2,2 };
		List<List<Integer>> actual = CombinationSum2.combinationSum2(candidates, 5);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,2,2));
		assertThat(actual, is(expected));
	}

}
