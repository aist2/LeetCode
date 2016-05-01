package medium;
import static org.junit.Assert.*;
import medium.ListNode;
import medium.SortedListToBST;
import medium.TreeNode;

import org.junit.Test;


public class SortedListToBSTTest {

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
		
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t3.left = t1;
		t3.right = t4;
		t1.right = t2;
		t4.right = t5;
		
		TreeNode res = SortedListToBST.sortedListToBST(l1);
		assertEquals(t3.val,res.val);
		assertEquals(t1.val,res.left.val);
		assertEquals(t4.val,res.right.val);
		assertEquals(t2.val,res.left.right.val);
		assertEquals(t5.val,res.right.right.val);
		
		
	}

}
