package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.DeleteNode;
import easy.ListNode;


public class DeleteNodeTest {

	@Test
	public final void testDeleteNode() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		DeleteNode.deleteNode(n2);
		assertEquals(1,n1.val);
		assertEquals(3,n1.next.val);
		assertEquals(4,n1.next.next.val);
		assertEquals(5,n1.next.next.next.val);
	}

}
