package easy;

public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        return removeElements1(head, val);
    }
    
    public static ListNode removeElements1(ListNode head, int val) {
    	if (head==null) return head;
    	
    	ListNode preHead = new ListNode(0);
    	preHead.next = head;
    	
    	ListNode slow = preHead;
    	ListNode fast = head;
    	
    	while (fast!=null) {
    		if (fast.val==val) {
    			slow.next = fast.next;
    		}
    		else {
    			slow = fast;
    		}
    		fast = fast.next;
    	}
        return preHead.next;
    }
}
