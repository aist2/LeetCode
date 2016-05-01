package medium;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode root = new ListNode(0);
    	ListNode curr = root;
    	boolean carry = false;
    	while (l1!=null || l2!=null) {
    		int i1 = 0;
    		int i2 = 0;
    		if (l1!=null) {
    			i1 = l1.val;
    			l1 = l1.next;
    		}
    		if (l2!=null) {
    			i2 = l2.val;
    			l2 = l2.next;
    		}
    		int sum = i1+i2;
    		if (carry) {
    			sum++;
    			carry = false;
    		}
    		if (sum > 9) {
    			carry = true;
    			sum %= 10;
    		}
    		ListNode newNode = new ListNode(sum);
    		curr.next = newNode;
    		curr = curr.next;
    	}
    	if (carry) {
    		ListNode newNode = new ListNode(1);
    		curr.next = newNode;
    	}
    	return root.next;
    }
}
