package medium;
import static org.junit.Assert.*;
import medium.SuperUglyNumber;

import org.junit.Test;


public class SuperUglyNumberTest {

	@Test
	public final void test() {
		assertEquals(32,SuperUglyNumber.nthSuperUglyNumber(12, new int[] {2,7,13,19}));
	}

}
