package medium;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import medium.DiffWaysToCompute;

import org.junit.Test;

public class DiffWaysToComputeTest {

	@Test
	public final void test() {
		List<Integer> expected = Arrays.asList(-34, -14, -10, -10, 10);
		assertThat(DiffWaysToCompute.diffWaysToCompute("2*3-4*5"), is(expected));
	}

}
