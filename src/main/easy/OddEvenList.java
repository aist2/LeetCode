package easy;

public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        return oddEvenList1(head);
    }
    
    public static ListNode oddEvenList1(ListNode head) {
    	if (head == null||head.next==null||head.next.next==null) {
    		return head;
    	}
    	ListNode curr = head;
    	ListNode next = head.next;
    	ListNode evenHead = head.next;
    	ListNode oddLast = head;
    	int count = 1;

    	while (next != null) {
    		curr.next = curr.next.next;
    		curr = next;
    		next = next.next;
    		count++;
    		if (count%2 != 0) {
    			oddLast = curr;
    		}
    	}
    	oddLast.next = evenHead;
        return head;
    }
}
