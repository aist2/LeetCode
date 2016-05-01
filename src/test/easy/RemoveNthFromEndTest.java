package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.RemoveNthFromEnd;


public class RemoveNthFromEndTest {

	@Test
	public final void testRemoveNthFromEnd1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = RemoveNthFromEnd.removeNthFromEnd(n1, 2);
		assertEquals(n2,res.next);
		assertEquals(n3,n2.next);
		assertEquals(n5,n3.next);
		assertEquals(null,n5.next);
	}
	@Test
	public final void testRemoveNthFromEnd2() {
		ListNode n1 = new ListNode(1);
		n1.next = null;
		
		ListNode res = RemoveNthFromEnd.removeNthFromEnd(n1, 1);
		assertEquals(null,res);
	}
}
