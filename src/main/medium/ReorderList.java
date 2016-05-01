package medium;

public class ReorderList {
    public static void reorderList(ListNode head) {
    	if (head==null||head.next==null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next!=null) {
        	fast = fast.next.next;
        	slow = slow.next;
        }
        
        ListNode p1 = slow;
        ListNode p2 = slow.next;
        while (p2!=null) {
        	ListNode tmp = p2.next;
        	p2.next = p1;
        	p1 = p2;
        	p2 = tmp;
        }
        
        ListNode end = p1;
        ListNode start = head;
        while (start!=end) {
        	ListNode tmp = end.next;
        	end.next = start.next;
        	start.next = end;
        	start = end.next;
        	end = tmp;
        }
        start.next = null;
    }
}
