package medium;
import static org.junit.Assert.*;
import medium.ListNode;
import medium.RotateRight;

import org.junit.Test;


public class RotateRightTest {

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
		
		ListNode res = RotateRight.rotateRight(l1, 2);
		assertEquals(l4,res);
		assertEquals(l5,res.next);
		assertEquals(l1,res.next.next);
		assertEquals(l2,res.next.next.next);
		assertEquals(l3,res.next.next.next.next);
	}

}
