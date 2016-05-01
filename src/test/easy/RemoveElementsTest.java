package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.RemoveElements;


public class RemoveElementsTest {

	@Test
	public final void testRemoveElements1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode res = RemoveElements.removeElements(n1, 2);
		assertEquals(n1,res);
		assertEquals(n4,n1.next);
		assertEquals(null,n4.next);
	}

	@Test
	public final void testRemoveElements2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode res = RemoveElements.removeElements(n1, 1);
		assertEquals(n2,res);
		assertEquals(n3,n2.next);
		assertEquals(n4,n3.next);
		assertEquals(n5,n4.next);
		assertEquals(null,n5.next);
	}
}
