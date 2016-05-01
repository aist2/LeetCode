package medium;
import java.util.Arrays;
import java.util.List;

import medium.SubSets;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SubSetsTest {

	@Test
	public final void test() {
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(3),
				Arrays.asList(1),
				Arrays.asList(2),
				Arrays.asList(1,2,3),
				Arrays.asList(1,3),
				Arrays.asList(2,3),
				Arrays.asList(1,2),
				Arrays.asList()
				);
		int[] nums = {1,2,3};
		List<List<Integer>> actual = SubSets.subsets(nums);
		System.out.println(actual);
		assertThat(actual, is(expected));
	}

}
