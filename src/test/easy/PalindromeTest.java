package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.Palindrome;


public class PalindromeTest {

	@Test
	public final void testIsPalindrome1() {
		// 12321
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		assertTrue(Palindrome.isPalindrome(n1));
	}

	@Test
	public final void testIsPalindrome2() {
		// 12
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);

		n1.next = n2;

		assertFalse(Palindrome.isPalindrome(n1));
	}
	
	@Test
	public final void testIsPalindrome3() {
		// 00
		ListNode n1 = new ListNode(0);
		ListNode n2 = new ListNode(0);

		n1.next = n2;

		assertTrue(Palindrome.isPalindrome(n1));
	}
}
