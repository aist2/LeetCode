package easy;

public class DeleteNode {
    public static void deleteNode(ListNode node) {
        deleteNode1(node);
    }
    
    public static void deleteNode1(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
