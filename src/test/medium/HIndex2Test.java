package medium;
import static org.junit.Assert.*;
import medium.HIndex2;

import org.junit.Test;


public class HIndex2Test {

	@Test
	public final void test() {
		assertEquals(3, HIndex2.hIndex(new int[] {0,1,3,5,6}));
	}

}
