package medium;
public class SortedListToBST {
	public static TreeNode sortedListToBST(ListNode head) {
	    return build(head,null);
	}

	public static TreeNode build(ListNode head,ListNode end) {
		if(head == null || head==end)
	        return null;
		
	    ListNode fast = head.next;
	    ListNode slow = head;
	    while(fast != end && fast.next != end)
	    {
	        fast = fast.next.next;
	        slow=slow.next;
	    }
	    TreeNode root = new TreeNode(slow.val);
	    root.left = build(head,slow);
	    root.right = build(slow.next,end);
	    return root;
	}
}
