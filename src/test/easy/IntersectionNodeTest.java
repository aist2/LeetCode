package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.IntersectionNode;
import easy.ListNode;


public class IntersectionNodeTest {

	@Test
	public final void testGetIntersectionNode1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode m1 = new ListNode(1);
		ListNode m2 = new ListNode(2);
		ListNode m3 = new ListNode(3);
		m1.next = m2;
		m2.next = m3;
		m3.next = n2;
		
		ListNode res = IntersectionNode.getIntersectionNode(n1, m1);
		assertEquals(n2,res);
	}

	@Test
	public final void testGetIntersectionNode2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode m1 = new ListNode(1);
		ListNode m2 = new ListNode(2);
		ListNode m3 = new ListNode(3);
		m1.next = m2;
		m2.next = m3;
		m3.next = n4;
		
		ListNode res = IntersectionNode.getIntersectionNode(n1, m1);
		assertEquals(n4,res);
	}
	
	@Test
	public final void testGetIntersectionNode3() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode m1 = new ListNode(1);
		ListNode m2 = new ListNode(2);
		ListNode m3 = new ListNode(3);
		m1.next = m2;
		m2.next = m3;
		
		ListNode res = IntersectionNode.getIntersectionNode(n1, m1);
		assertEquals(null,res);
	}
}
