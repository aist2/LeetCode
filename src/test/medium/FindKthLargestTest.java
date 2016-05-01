package medium;
import static org.junit.Assert.*;
import medium.FindKthLargest;

import org.junit.Test;


public class FindKthLargestTest {

	@Test
	public final void test() {
		assertEquals(5, FindKthLargest.findKthLargest(new int[] {3,2,1,5,6,4}, 2));
	}

}
