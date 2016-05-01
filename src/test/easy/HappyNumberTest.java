package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.HappyNumber;


public class HappyNumberTest {

	@Test
	public void testIsHappy1() {
		int n = 19;
		assertTrue(HappyNumber.isHappy(n));
	}

	@Test
	public void testIsHappy2() {
		int n = 2;
		assertFalse(HappyNumber.isHappy(n));
	}
}
