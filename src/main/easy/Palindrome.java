package easy;
import java.util.ArrayList;
import java.util.List;



public class Palindrome {
    public static boolean isPalindrome(ListNode head) {
        return isPalindrome2(head);
    }
    
    public static boolean isPalindrome1(ListNode head) {
        ListNode currNode = head;
        List<Integer> list = new ArrayList<Integer>();
        while (currNode!= null) {
        	list.add(currNode.val);
        	currNode = currNode.next;
        }
        
        for (int i=0;i<list.size()/2;i++){
        	if (list.get(i).intValue() != list.get(list.size()-i-1).intValue()) {
        		return false;
        	}
        }
        return true;
    }
    
    public static boolean isPalindrome2(ListNode head) {
    	if (head==null || head.next==null) return true;
    	
    	ListNode fast = head;
    	ListNode slow = head;
    	ListNode previous = head;
    	ListNode secondHalf = head.next;
    	
    	while (fast.next!=null && fast.next.next!= null) {
    		fast = fast.next.next;
    		
    		slow = secondHalf;
    		secondHalf = secondHalf.next;
    		
    		slow.next = previous;
    		previous = slow;
    		
    	}
    	head.next = null;
    	if (fast!=head && fast.next == null) {
    		slow = slow.next;
    	}
    	
    	while(secondHalf!=null) {
    		if (slow==null || slow.val!=secondHalf.val){
    			return false;
    		}
    		slow = slow.next;
    		secondHalf = secondHalf.next;
    	}
    	return true;
    }
}
