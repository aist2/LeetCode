package easy;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import easy.MyStack;


public class MyStackTest {

	MyStack stack;
	
	@Before
	public void initialize() {
		stack= new MyStack();
    }
	
	@Test
	public final void test() {
		assertTrue(stack.empty());
		stack.push(1);
		stack.push(3);
		assertEquals(3,stack.top());
		stack.pop();
		assertEquals(1,stack.top());
		assertFalse(stack.empty());
	}
}
