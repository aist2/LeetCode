package medium;
import java.util.HashSet;
import java.util.Set;


public class HasCycle {
    public static boolean hasCycle(ListNode head) {
    	ListNode fast = head, slow = head;
    	while (fast!=null && fast.next!=null && fast.next.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if (fast == slow)
    			return true;
    	}
    	return false;
    }
    
    public static boolean hasCycle1(ListNode head) {
    	Set<ListNode> set = new HashSet<>();
    	while (head!=null){
    		if (!set.add(head))
    			return true;
    		head = head.next;
    	}
    	return false;
    }
}
