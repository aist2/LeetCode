package medium;
import static org.junit.Assert.*;
import medium.MaxArea;

import org.junit.Test;


public class MaxAreaTest {

	@Test
	public final void testMaxArea() {
		assertEquals(2, MaxArea.maxArea(new int[]{1,2,3}));
	}

}
