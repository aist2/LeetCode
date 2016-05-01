package medium;
import java.util.List;

import medium.PermuteUnique;

import org.junit.Test;


public class PermuteUniqueTest {

	@Test
	public final void test() {
		List<List<Integer>> actual = PermuteUnique.permuteUnique(new int[] {1,2,1});
		System.out.println(actual);
	}

	@Test
	public final void test2() {
		List<List<Integer>> actual = PermuteUnique.permuteUnique(new int[] {1,2,1,2});
		System.out.println(actual);
	}

}
