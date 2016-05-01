package easy;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import easy.MinStack;


public class MinStackTest {
	MinStack stack;
	
	@Before
	public void initialize() {
		stack= new MinStack();
    }
	
	@Test
	public final void testPushTopPop() {
		stack.push(1);
		stack.push(3);
		assertEquals(3,stack.top());
		stack.pop();
		assertEquals(1,stack.top());
	}

	@Test
	public final void testGetMin() {
		assertEquals(0,stack.getMin());
		stack.push(3);
		assertEquals(3,stack.getMin());
		stack.push(1);
		assertEquals(1,stack.getMin());
		stack.pop();
		assertEquals(3,stack.getMin());
	}

}
