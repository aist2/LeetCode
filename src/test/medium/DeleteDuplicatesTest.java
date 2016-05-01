package medium;
import static org.junit.Assert.*;
import medium.DeleteDuplicates;
import medium.ListNode;

import org.junit.Test;


public class DeleteDuplicatesTest {

	@Test
	public final void test() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode res = DeleteDuplicates.deleteDuplicates(n1);
		assertEquals(n1,res);
		assertEquals(n2,res.next);
		assertEquals(n7,res.next.next);
		assertEquals(null,res.next.next.next);
	}
	
	@Test
	public final void test2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = DeleteDuplicates.deleteDuplicates(n1);
		assertEquals(n4,res);
		assertEquals(n5,res.next);
		assertEquals(null,res.next.next);
	}
	
	@Test
	public final void test3() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		n1.next = n2;
		ListNode res = DeleteDuplicates.deleteDuplicates(n1);
		assertEquals(null,res);
	}
}
