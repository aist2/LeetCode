package medium;
import java.util.List;

import medium.Permutation;

import org.junit.Test;


public class PermutationTest {

	@Test
	public final void testPermute() {
		List<List<Integer>> actual = Permutation.permute(new int[]{1,2,3,4});
		System.out.println(actual);
	}
	
	@Test
	public final void testPermute2() {
		List<List<Integer>> actual = Permutation.permute(new int[]{1,2,3});
		System.out.println(actual);
	}

	@Test
	public final void testPermute3() {
		List<List<Integer>> actual = Permutation.permute(new int[]{});
		System.out.println(actual);
	}
}
