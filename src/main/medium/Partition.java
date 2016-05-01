package medium;

public class Partition {
    public static ListNode partition(ListNode head, int x) {
    	ListNode less = new ListNode(0),greater = new ListNode(0);
    	ListNode lessRoot = less, greaterRoot = greater;
    	while (head != null) {
    		if (head.val < x) {
    			less.next = head;
    			less = less.next;
    		} else {
    			greater.next = head;
    			greater = greater.next;
    		}
    		head = head.next;
    	}
    	less.next = greaterRoot.next;
    	greater.next = null;
        return lessRoot.next;
    }
}
