package easy;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNthFromEnd1(head,n);
    }
    
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
    	ListNode fast = head;
    	ListNode slow = head;
    	ListNode prev = null;
    	for (int i=1; i<n; i++){
    		fast = fast.next;
    	}
    	
    	while(fast.next!=null){
    		prev = slow;
    		slow = slow.next;
    		fast = fast.next;
    	}
    	if (slow==head) return slow.next;
    	
    	prev.next = slow.next;
        return head;
    }
}
