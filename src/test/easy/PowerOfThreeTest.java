package easy;
import static org.junit.Assert.*;

import org.junit.Test;


public class PowerOfThreeTest {

	@Test
	public final void testIsPowerOfThree1() {
		assertTrue(PowerOfThree.isPowerOfThree(9));
	}
	
	@Test
	public final void testIsPowerOfThree2() {
		assertTrue(PowerOfThree.isPowerOfThree(1));
	}

	@Test
	public final void testIsPowerOfThree3() {
		assertFalse(PowerOfThree.isPowerOfThree(6));
	}
	
	@Test
	public final void testIsPowerOfThree4() {
		assertFalse(PowerOfThree.isPowerOfThree(0));
	}
	
	@Test
	public final void testIsPowerOfThree5() {
		assertTrue(PowerOfThree.isPowerOfThree(243));
	}
}
