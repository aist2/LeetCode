package medium;
import static org.junit.Assert.*;
import medium.PeakElement;

import org.junit.Test;


public class PeakElementTest {

	@Test
	public final void test() {
		assertEquals(2, PeakElement.findPeakElement(new int[] {1,2,3,1}));
	}

}
