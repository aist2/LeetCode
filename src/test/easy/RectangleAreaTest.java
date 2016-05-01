package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.RectangleArea;


public class RectangleAreaTest {

	@Test
	public final void testComputeArea1() {
		assertEquals(45,RectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}

	@Test
	public final void testComputeArea2() {
		assertEquals(16,RectangleArea.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
	}
	
	@Test
	public final void testComputeArea3() {
		assertEquals(41,RectangleArea.computeArea(-5, 4, 0, 5, -3, -3, 3, 3));
	}
}
