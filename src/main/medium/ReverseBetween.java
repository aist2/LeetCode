package medium;

public class ReverseBetween {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head==null||head.next==null||m==n) return head;
    	ListNode root= new ListNode(0),pre,p1,p2,p3;
    	root.next = head;
    	pre = root;
    	p1 = head;
    	for (int i=0;i<m-1;i++){
    		pre = pre.next;
    		p1 = p1.next;
    	}
    	p2 = p1.next;
    	p3 = p2.next;
    	
    	for (int i=0;i<n-m;i++) {
    		p2.next = p1;
    		p1 = p2;
    		p2 = p3;
    		if (p3 == null)
    			break;
    		p3 = p3.next;
    	}
    	pre.next.next = p2;
    	pre.next = p1;
    	
    	return root.next;
    }
}
