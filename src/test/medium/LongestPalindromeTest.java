package medium;
import static org.junit.Assert.*;
import medium.LongestPalindrome;

import org.junit.Test;


public class LongestPalindromeTest {

	@Test
	public final void test() {
		assertEquals("abbabba",LongestPalindrome.longestPalindrome("cabbabbab"));
	}
	@Test
	public final void test2() {
		assertEquals("a",LongestPalindrome.longestPalindrome("a"));
	}
}
