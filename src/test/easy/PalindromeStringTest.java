package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.PalindromeString;


public class PalindromeStringTest {

	@Test
	public final void testIsPalindrome1() {
		assertTrue(PalindromeString.isPalindrome(""));
	}
	
	@Test
	public final void testIsPalindrome2() {
		assertTrue(PalindromeString.isPalindrome("123A man, a plan, a canal: Panama321"));
	}

	@Test
	public final void testIsPalindrome3() {
		assertFalse(PalindromeString.isPalindrome("race a car"));
	}
}
