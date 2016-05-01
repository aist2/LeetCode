package medium;

public class DetectCycle {
    public static ListNode detectCycle(ListNode head) {
    	ListNode root = head, fast = head, slow = head, meet = null;
    	while (fast!=null && fast.next!=null && fast.next.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if (fast == slow) {
    			meet = fast;
    			break;
    		}
    	}
    	if (meet == null)
    		return null;
    	
    	while (root != meet) {
    		root = root.next;
    		meet = meet.next;
    	}
    	return meet;
    }
}
