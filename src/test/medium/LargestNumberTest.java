package medium;
import static org.junit.Assert.*;
import medium.LargestNumber;

import org.junit.Test;


public class LargestNumberTest {

	@Test
	public final void test() {
		assertEquals("9534330", LargestNumber.largestNumber(new int[] {3, 30, 34, 5, 9}));
	}

}
