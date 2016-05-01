package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.RomanToInteger;


public class RomanToIntegerTest {

	@Test
	public final void testRomanToInt1() {
		assertEquals(36, RomanToInteger.romanToInt("XXXVI"));
	}

	@Test
	public final void testRomanToInt2() {
		assertEquals(2012, RomanToInteger.romanToInt("MMXII"));
	}
	
	@Test
	public final void testRomanToInt3() {
		assertEquals(1996, RomanToInteger.romanToInt("MCMXCVI"));
	}
}
