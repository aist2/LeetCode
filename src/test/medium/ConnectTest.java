package medium;
import static org.junit.Assert.*;
import medium.Connect;
import medium.TreeLinkNode;

import org.junit.Test;


public class ConnectTest {

	@Test
	public final void test() {
		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		Connect.connect(n1);
		assertEquals(null, n1.next);
		assertEquals(n3, n2.next);
		assertEquals(null, n3.next);
		assertEquals(n5, n4.next);
		assertEquals(n6, n5.next);
		assertEquals(n7, n6.next);
		assertEquals(null, n7.next);
	}

}
