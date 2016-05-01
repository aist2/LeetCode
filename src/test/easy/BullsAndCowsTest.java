package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.BullsAndCows;


public class BullsAndCowsTest {

	@Test
	public void testGetHint1() {
		String secret = "1807";
		String guess = "7810";
		String expected = "1A3B";
		String res = BullsAndCows.getHint(secret, guess);
		assertEquals(expected, res);
	}
	
	@Test
	public void testGetHint2() {
		String secret = "1123";
		String guess = "0111";
		String expected = "1A1B";
		String res = BullsAndCows.getHint(secret, guess);
		assertEquals(expected, res);
	}
	
	@Test
	public void testGetHint3() {
		String secret = "1122";
		String guess = "2211";
		String expected = "0A4B";
		String res = BullsAndCows.getHint(secret, guess);
		assertEquals(expected, res);
	}
}
