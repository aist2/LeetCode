package medium;
import static org.junit.Assert.*;
import medium.ListNode;
import medium.SortList;

import org.junit.Test;


public class SortListTest {

	@Test
	public final void test() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l3.next = l2;
		l2.next = l1;
		
		ListNode res = SortList.sortList(l3);
		assertEquals(l1,res);
		assertEquals(l2,res.next);
		assertEquals(l3,res.next.next);
		assertEquals(null,res.next.next.next);
	}

}
