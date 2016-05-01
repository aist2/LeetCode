package medium;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import medium.Triangle;

import org.junit.Test;


public class TriangleTest {

	@Test
	public final void test() {
		List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2),Arrays.asList(3,4),Arrays.asList(6,5,7),Arrays.asList(4,1,8,3));
		assertEquals(11,Triangle.minimumTotal(triangle));
	}

	@Test
	public final void test1() {
		List<List<Integer>> triangle = Arrays.asList(Arrays.asList(7),Arrays.asList(-5,9),Arrays.asList(6,5,2),Arrays.asList(-8,-2,-7,3),Arrays.asList(-2,6,-6,-1,4));
		assertEquals(-6,Triangle.minimumTotal(triangle));
	}
}
