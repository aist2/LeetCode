package medium;
import static org.junit.Assert.*;
import medium.HasCycle;
import medium.ListNode;

import org.junit.Test;


public class HasCycleTest {

	@Test
	public final void test() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;
		
		assertTrue(HasCycle.hasCycle(l1));
	}
	
	@Test
	public final void test2() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		assertFalse(HasCycle.hasCycle(l1));
	}

}
