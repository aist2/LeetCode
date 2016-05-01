package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.PalindromeInteger;


public class PalindromeIntegerTest {

	@Test
	public final void test1() {
		assertTrue(PalindromeInteger.isPalindrome(12321));
	}
	
	@Test
	public final void test2() {
		assertTrue(PalindromeInteger.isPalindrome(123321));
	}
	
	@Test
	public final void test3() {
		assertTrue(PalindromeInteger.isPalindrome(0));
	}
	
	@Test
	public final void test4() {
		assertFalse(PalindromeInteger.isPalindrome(-112211));
	}
	
	@Test
	public final void test5() {
		assertFalse(PalindromeInteger.isPalindrome(123));
	}
	
	@Test
	public final void test6() {
		assertFalse(PalindromeInteger.isPalindrome(-2147447412));
	}
	
}
