package easy;

public class SwapPairs {
    public static ListNode swapPairs(ListNode head) {
    	if (head==null||head.next==null)
    		return head;
        ListNode p1=head,p2=head.next,p3=head.next.next,root=p2;
        while (p1!=null && p2!=null) {
        	p2.next = p1;
        	if (p3!=null)
        		if (p3.next==null)
        			p1.next = p3;
        		else
        			p1.next = p3.next;
        	else
        		p1.next = null;

        	if (p1.next == null || p3.next == null)
        		break;
        	p2 = p1.next;
        	p1 = p3;
        	p3 = p3.next.next;
        }
        return root;
        
    }
}
