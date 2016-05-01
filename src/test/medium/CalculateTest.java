package medium;
import static org.junit.Assert.*;
import medium.Calculate;

import org.junit.Test;


public class CalculateTest {

	@Test
	public final void test() {
		assertEquals(23, Calculate.calculate("(1+(4+5+2)-3)+(6+8)"));
	}
	
	@Test
	public final void test2() {
		assertEquals(3, Calculate.calculate(" 2-1 + 2 "));
	}

}
