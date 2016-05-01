package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.PowerOfTwo;


public class PowerOfTwoTest {

	@Test
	public final void testIsPowerOfTwo1() {
		assertTrue(PowerOfTwo.isPowerOfTwo(8));
	}

	@Test
	public final void testIsPowerOfTwo2() {
		assertFalse(PowerOfTwo.isPowerOfTwo(10));
	}

	@Test
	public final void testIsPowerOfTwo3() {
		assertFalse(PowerOfTwo.isPowerOfTwo(0));
	}

}
