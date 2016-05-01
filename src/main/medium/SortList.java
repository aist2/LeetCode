package medium;

public class SortList {
    public static ListNode sortList(ListNode head) {
    	if (head==null || head.next==null) return head;
        return sort(head);
    }
    
    private static ListNode sort(ListNode start) {
    	ListNode slow = start;
    	ListNode fast = start;
    	if (start.next==null) return start;
    	while (fast.next!=null && fast.next.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	ListNode right = sort(slow.next);
    	slow.next = null;
    	ListNode left = sort(start);
    	
    	return merge(left,right);
    }
    private static ListNode merge(ListNode left, ListNode right) {
    	ListNode p1 = left;
    	ListNode p2 = right;
    	ListNode dummy = new ListNode(0);
    	ListNode root = dummy;
    	while (p1!=null && p2!=null) {
    		if (p1.val < p2.val) {
    			root.next = p1;
    			p1 = p1.next;
    		} else {
    			root.next = p2;
    			p2 = p2.next;
    		}
    		root = root.next;
    	}
    	if (p1!=null) root.next = p1;
    	if (p2!=null) root.next = p2;
    	return dummy.next;
    }
}
