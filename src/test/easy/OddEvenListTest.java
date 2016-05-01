package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.OddEvenList;


public class OddEvenListTest {

	@Test
	public final void testOddEvenList1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = OddEvenList.oddEvenList(n1);
		assertEquals(n1,res);
		assertEquals(n3,n1.next);
		assertEquals(n5,n3.next);
		assertEquals(n2,n5.next);
		assertEquals(n4,n2.next);
		assertEquals(null,n4.next);
	}

	@Test
	public final void testOddEvenList2() {
		ListNode n1 = new ListNode(1);
		n1.next = null;
		ListNode res = OddEvenList.oddEvenList(n1);
		assertEquals(n1,res);
		assertEquals(null,n1.next);
	}
	
	@Test
	public final void testOddEvenList3() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		n1.next = n2;
		n2.next = null;
		ListNode res = OddEvenList.oddEvenList(n1);
		assertEquals(n1,res);
		assertEquals(n2,n1.next);
		assertEquals(null,n2.next);
	}
}
