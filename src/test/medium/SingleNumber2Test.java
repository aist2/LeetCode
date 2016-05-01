package medium;
import static org.junit.Assert.*;
import medium.SingleNumber2;

import org.junit.Test;


public class SingleNumber2Test {

	@Test
	public final void test() {
		assertEquals(2, SingleNumber2.singleNumber(new int[] {3,3,3,2}));
	}

}
