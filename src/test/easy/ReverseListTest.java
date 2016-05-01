package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.ReverseList;


public class ReverseListTest {

	@Test
	public final void testReverseList1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ReverseList.reverseList(n1);
		assertEquals(null,n1.next);
		assertEquals(n1,n2.next);
		assertEquals(n2,n3.next);
		assertEquals(n3,n4.next);
		assertEquals(n4,n5.next);
	}

	@Test
	public final void testReverseList2() {
		ListNode res = ReverseList.reverseList(null);
		assertEquals(null,res);
	}
}
