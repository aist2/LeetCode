package medium;
import static org.junit.Assert.*;
import medium.NumSquars;

import org.junit.Test;


public class NumSquarsTest {

	@Test
	public final void test() {
		assertEquals(3, NumSquars.numSquares(12));
	}

	@Test
	public final void test2() {
		assertEquals(2, NumSquars.numSquares(13));
	}
	
	@Test
	public final void test3() {
		assertEquals(4, NumSquars.numSquares(7));
	}
	
	@Test
	public final void test4() {
		assertEquals(3, NumSquars.numSquares(43));
	}
}
