package easy;

public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        return reverseList1(head);
    }
    
    public static ListNode reverseList1(ListNode head) {
    	if (head == null || head.next == null){
    		return head;
    	}
    	ListNode prev = head;
    	ListNode curr = head.next;
    	ListNode next = head.next.next;
    	head.next = null;
    	while(true) {
    		curr.next = prev;
    		if (next == null){
    			return curr;
    		}
    		prev = curr;
    		curr = next;
    		next = next.next;
    	} 
    }
}
