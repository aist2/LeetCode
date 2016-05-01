package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.MergeTwoLists;


public class MergeTwoListsTest {

	@Test
	public final void testMergeTwoLists() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(7);
		ListNode n4 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode m1 = new ListNode(2);
		ListNode m2 = new ListNode(4);
		ListNode m3 = new ListNode(5);
		ListNode m4 = new ListNode(6);
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		
		ListNode res = MergeTwoLists.mergeTwoLists(n1, m1);
		
		assertEquals(n1,res);
		assertEquals(m1,n1.next);
		assertEquals(n2,m1.next);
		assertEquals(m2,n2.next);
		assertEquals(m3,m2.next);
		assertEquals(m4,m3.next);
		assertEquals(n3,m4.next);
		assertEquals(n4,n3.next);
		assertEquals(null,n4.next);
	}

}
