package medium;
import static org.junit.Assert.*;
import medium.InsertionSortList;
import medium.ListNode;

import org.junit.Test;


public class InsertionSortListTest {

	@Test
	public final void test() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l3.next = l2;
		l2.next = l1;
		
		ListNode res = InsertionSortList.insertionSortList(l3);
		assertEquals(l1,res);
		assertEquals(l2,res.next);
		assertEquals(l3,res.next.next);
		assertEquals(null,res.next.next.next);
	}

}
