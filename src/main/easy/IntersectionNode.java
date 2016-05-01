package easy;

public class IntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return getIntersectionNode1(headA, headB);
    }
    
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
    	if (headA==null || headB==null) return null;
    	ListNode currA = headA;
    	ListNode currA2 = headA;
    	ListNode currB = headB;
    	ListNode currB2 = headB;
    	while (currA!=null && currB!=null){
    		currA = currA.next;
    		currB = currB.next;
    	}
    	if (currA==null && currB!=null){
    		//List B is longer
    		while (currB!=null){
    			currB = currB.next;
    			currB2 = currB2.next;
    		}
    	}
    	else if (currB==null && currA!=null){
    		//List A is longer
    		while (currA!=null){
    			currA = currA.next;
    			currA2 = currA2.next;
    		}
    	}
    	while (currA2!=null && currB2!=null){
    		if (currA2==currB2) return currA2;
    		currA2 = currA2.next;
    		currB2 = currB2.next;
    	}
    	
        return null;
    }
    
}
