package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.UglyNumber;


public class UglyNumberTest {

	@Test
	public final void testIsUgly1() {
		assertTrue(UglyNumber.isUgly(1));
	}
	
	@Test
	public final void testIsUgly2() {
		assertTrue(UglyNumber.isUgly(6));
	}
	
	@Test
	public final void testIsUgly3() {
		assertFalse(UglyNumber.isUgly(14));
	}

}
