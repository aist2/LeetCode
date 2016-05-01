package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ReverseInteger;

public class ReverseIntegerTest {

	@Test
	public final void testReverse1() {
		assertEquals(321, ReverseInteger.reverse(123));
	}

	@Test
	public final void testReverse2() {
		assertEquals(-321, ReverseInteger.reverse(-123));
	}

	@Test
	public final void testReverse3() {
		assertEquals(0, ReverseInteger.reverse(1534236469));
	}

	@Test
	public final void testReverse4() {
		assertEquals(0, ReverseInteger.reverse(-1534236469));
	}
	
}
