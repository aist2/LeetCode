package medium;
import java.util.List;

import medium.Combine;

import org.junit.Test;


public class CombineTest {

	@Test
	public final void test() {
		List<List<Integer>> actual = Combine.combine(4, 2);
		System.out.println(actual);
	}

}
