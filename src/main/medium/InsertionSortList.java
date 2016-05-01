package medium;

public class InsertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        ListNode helper = new ListNode(0);
        ListNode prev = helper;
    	ListNode curr = head;
    	ListNode next;
        while (curr != null) {
        	next = curr.next;
        	if (prev!=null&&prev.next!=null&&prev.next.val>curr.val)
        		prev = helper;
        	while (prev.next != null && prev.next.val < curr.val) {
        		prev = prev.next;
        	}
        	curr.next = prev.next;
        	prev.next = curr;
        	curr = next;
        }
        return helper.next;
    }
}
