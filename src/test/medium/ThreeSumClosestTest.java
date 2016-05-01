package medium;
import static org.junit.Assert.*;
import medium.ThreeSumClosest;

import org.junit.Test;


public class ThreeSumClosestTest {

	@Test
	public final void testThreeSumClosest() {
		assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1,2,1,-4,99,98,97,96}, 1));
	}

}
