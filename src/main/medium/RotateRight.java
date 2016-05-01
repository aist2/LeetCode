package medium;

public class RotateRight {
    public static ListNode rotateRight(ListNode head, int k) {
    	if (head == null || k == 0) return head;
    	ListNode p1,p2;
    	p1 = p2 = head;
    	int len;
    	for (len=1; p2.next!=null; len++)
			p2 = p2.next;
		k %= len;
		if (k==0)
			return head;
		for (int i=0; i<len-1-k; i++)
			p1 = p1.next;
    	ListNode res = p1.next;
    	p2.next = head;
    	p1.next = null;
    	return res;
    }
}
