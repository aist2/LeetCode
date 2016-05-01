package medium;
import static org.junit.Assert.*;
import medium.FindMin;

import org.junit.Test;


public class FindMinTest {

	@Test
	public final void test() {
		assertEquals(0,FindMin.findMin(new int[] {4,5,6,7,0,1,2}));
	}

}
