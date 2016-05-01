package medium;

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
    	if (head==null||head.next==null) return head;
    	
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode p1=root,p2=head,p3=head.next;
        while (p3!=null) {
    		while (p3!=null && p2.val == p3.val) {
    			p3 = p3.next;
    		}
    		if (p2.next != p3)
    			p1.next = p3;
    		else
    			p1 = p2;
    		p2 = p3;
    		if (p3==null)
    			break;
    		p3 = p3.next;
        }
    	return root.next;
    }
}
