package medium;
import static org.junit.Assert.*;
import medium.Divide;

import org.junit.Test;

public class DivideTest {

	@Test
	public void test() {
		assertEquals(1, Divide.divide(3, 2));
	}
	
	@Test
	public void test2() {
		assertEquals(0, Divide.divide(-10000000, -20000000));
	}

}
