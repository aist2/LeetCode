package easy;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import easy.MyQueue;


public class MyQueueTest {
	MyQueue queue;
	
	@Before
	public void initialize() {
		queue= new MyQueue();
    }
	
	@Test
	public final void test1() {
		assertTrue(queue.empty());
		queue.push(1);
		queue.push(3);
		assertEquals(1,queue.peek());
		queue.pop();
		assertEquals(3,queue.peek());
		assertFalse(queue.empty());
	}
	
	
	@Test
	public final void test2() {
		assertTrue(queue.empty());
		queue.push(1);
		assertEquals(1,queue.peek());
		queue.push(2);
		assertEquals(1,queue.peek());
		queue.pop();
		assertEquals(2,queue.peek());
		queue.push(3);
		assertEquals(2,queue.peek());
		queue.push(4);
		assertEquals(2,queue.peek());
		queue.pop();
		assertEquals(3,queue.peek());
	}

}
