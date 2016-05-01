package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ReverseBits;


public class ReverseBitsTest {

	@Test
	public final void testReverseBits1() {
		assertEquals(964176192, ReverseBits.reverseBits(43261596));
	}
	
	@Test
	public final void testReverseBits2() {
		assertEquals(-2147483648, ReverseBits.reverseBits(1));
	}

	@Test
	public final void testReverseBits3() {
		assertEquals(8388608, ReverseBits.reverseBits(256));
	}
}
