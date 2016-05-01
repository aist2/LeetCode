package medium;
import static org.junit.Assert.*;
import medium.AddTwoNumbers;
import medium.ListNode;

import org.junit.Test;


public class AddTwoNumbersTest {

	@Test
	public final void test() {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode m1 = new ListNode(5);
		ListNode m2 = new ListNode(6);
		ListNode m3 = new ListNode(4);
		m1.next = m2;
		m2.next = m3;
		ListNode n1 = new ListNode(7);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		
		ListNode res = AddTwoNumbers.addTwoNumbers(l1, m1);
		assertEquals(n1.val,res.val);
		assertEquals(n1.next.val,res.next.val);
		assertEquals(n1.next.next.val,res.next.next.val);
		assertEquals(null,res.next.next.next);
		
	}

}
