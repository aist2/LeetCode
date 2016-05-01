package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import medium.SubSets2;

import org.junit.Test;


public class SubSets2Test {

	@Test
	public final void testSubsetsWithDup() {
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(2),
				Arrays.asList(1),
				Arrays.asList(1,2,2),
				Arrays.asList(2,2),
				Arrays.asList(1,2),
				Arrays.asList()
				);
		int[] nums = {1,2,2};
		List<List<Integer>> actual = SubSets2.subsetsWithDup(nums);
		System.out.println(actual);
		assertThat(actual, is(expected));
	}

}
