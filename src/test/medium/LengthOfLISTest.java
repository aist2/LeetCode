package medium;
import static org.junit.Assert.*;
import medium.LengthOfLIS;

import org.junit.Test;

public class LengthOfLISTest {

	@Test
	public final void test() {
		assertEquals(4, LengthOfLIS.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
	}

	@Test
	public final void test1() {
		assertEquals(3, LengthOfLIS.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 4 }));
	}

	@Test
	public final void test2() {
		assertEquals(7, LengthOfLIS.lengthOfLIS(new int[] { 2,3,8,9,4,5,6,7,8 }));
	}
	
	@Test
	public final void test3() {
		assertEquals(6, LengthOfLIS.lengthOfLIS(new int[] { 1,3,6,7,9,4,10,5,6 }));
	}
}
