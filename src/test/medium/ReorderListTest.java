package medium;
import static org.junit.Assert.*;
import medium.ListNode;
import medium.ReorderList;

import org.junit.Test;


public class ReorderListTest {

	@Test
	public final void test() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		ReorderList.reorderList(l1);
		assertEquals(l5,l1.next);
		assertEquals(l2,l1.next.next);
		assertEquals(l4,l1.next.next.next);
		assertEquals(l3,l1.next.next.next.next);
		assertEquals(null,l1.next.next.next.next.next);
		
	}
	@Test
	public final void test2() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		
		ReorderList.reorderList(l1);
		assertEquals(l4,l1.next);
		assertEquals(l2,l1.next.next);
		assertEquals(l3,l1.next.next.next);
		assertEquals(null,l1.next.next.next.next);
		
	}
}
