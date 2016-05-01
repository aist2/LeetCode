package medium;
import static org.junit.Assert.*;
import medium.Rob;

import org.junit.Test;


public class RobTest {

	@Test
	public final void test() {
		assertEquals(3, Rob.rob(new int[]{1,2,3}));
	}
	
	@Test
	public final void test2() {
		assertEquals(2, Rob.rob(new int[]{1,2}));
	}

}
