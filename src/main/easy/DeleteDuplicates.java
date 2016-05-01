package easy;

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        return deleteDuplicates1(head);
    }
    
    public static ListNode deleteDuplicates1(ListNode head) {
    	if (head==null||head.next==null) return head;
    	ListNode curr = head;
    	while (curr.next!=null) {
    		if (curr.val == curr.next.val) {
    			curr.next = curr.next.next;
    		}
    		else {
    			curr = curr.next;
    		}
    	}
        return head;
    }
}
