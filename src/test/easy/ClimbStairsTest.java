package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ClimbStairs;


public class ClimbStairsTest {

	@Test
	public final void testClimbStairs() {
		ClimbStairs obj = new ClimbStairs();
		assertEquals(3, obj.climbStairs(3));
	}

}
