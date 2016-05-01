package medium;
import static org.junit.Assert.*;
import medium.ListNode;
import medium.Partition;

import org.junit.Test;


public class PartitionTest {

	@Test
	public final void test() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(2);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		
		ListNode res = Partition.partition(l1, 3);
		assertEquals(l1,res);
		assertEquals(l4,res.next);
		assertEquals(l6,res.next.next);
		assertEquals(l2,res.next.next.next);
		assertEquals(l3,res.next.next.next.next);
		assertEquals(l5,res.next.next.next.next.next);
	}
	
	@Test
	public final void test2() {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		l1.next = l2;
		
		ListNode res = Partition.partition(l1, 2);
		assertEquals(l2,res);
		assertEquals(l1,res.next);
	}

}
