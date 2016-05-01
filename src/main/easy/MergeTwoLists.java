package easy;

public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return mergeTwoLists1(l1,l2);
    }
    
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
    	ListNode curr1 = l1;
    	ListNode curr2 = l2;
    	ListNode head = new ListNode(0);
    	ListNode curr = head;
    	
    	if (l1==null) return l2;
    	if (l2==null) return l1;
    	while (curr1!=null && curr2!=null){
    		if (curr1.val<curr2.val) {
    			curr.next = curr1;
    			curr1 = curr1.next;
    		}
    		else {
    			curr.next = curr2;
    			curr2 = curr2.next;
    		}
    		curr = curr.next;
    	}
    	if (curr1!=null) curr.next = curr1;
    	if (curr2!=null) curr.next = curr2;
        return head.next;
    }
}
