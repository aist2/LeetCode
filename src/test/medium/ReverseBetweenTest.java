package medium;
import static org.junit.Assert.*;
import medium.ListNode;
import medium.ReverseBetween;

import org.junit.Test;


public class ReverseBetweenTest {

	@Test
	public final void test() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = ReverseBetween.reverseBetween(n1, 2, 4);
		assertEquals(n1,res);
		assertEquals(n4,res.next);
		assertEquals(n3,res.next.next);
		assertEquals(n2,res.next.next.next);
		assertEquals(n5,res.next.next.next.next);
		assertEquals(null,res.next.next.next.next.next);
	}

	@Test
	public final void test2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = ReverseBetween.reverseBetween(n1, 2, 5);
		assertEquals(n1,res);
		assertEquals(n5,res.next);
		assertEquals(n4,res.next.next);
		assertEquals(n3,res.next.next.next);
		assertEquals(n2,res.next.next.next.next);
		assertEquals(null,res.next.next.next.next.next);
	}
	
	@Test
	public final void test3() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = ReverseBetween.reverseBetween(n1, 1, 5);
		assertEquals(n5,res);
		assertEquals(n4,res.next);
		assertEquals(n3,res.next.next);
		assertEquals(n2,res.next.next.next);
		assertEquals(n1,res.next.next.next.next);
		assertEquals(null,res.next.next.next.next.next);
	}
}
