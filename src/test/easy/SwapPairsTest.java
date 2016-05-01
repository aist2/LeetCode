package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.ListNode;
import easy.SwapPairs;


public class SwapPairsTest {

	@Test
	public final void test() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode res = SwapPairs.swapPairs(n1);
		assertEquals(n2,res);
		assertEquals(n1,res.next);
		assertEquals(n4,res.next.next);
		assertEquals(n3,res.next.next.next);
		assertEquals(n5,res.next.next.next.next);
		assertEquals(null,res.next.next.next.next.next);
	}

}
