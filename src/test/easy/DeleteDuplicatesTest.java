package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.DeleteDuplicates;
import easy.ListNode;


public class DeleteDuplicatesTest {

	@Test
	public final void testDeleteDuplicates1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = DeleteDuplicates.deleteDuplicates(n1);
		assertEquals(n1,res);
		assertEquals(n3,n1.next);
		assertEquals(n4,n3.next);
		assertEquals(null,n4.next);
	}

	@Test
	public final void testDeleteDuplicates2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(1);
		ListNode n5 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = DeleteDuplicates.deleteDuplicates(n1);
		assertEquals(n1,res);
		assertEquals(n5,n1.next);
		assertEquals(null,n5.next);
	}
}
