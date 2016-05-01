package medium;
import static org.junit.Assert.*;
import medium.MySqrt;

import org.junit.Test;


public class MySqrtTest {

	@Test
	public final void test() {
		assertEquals(2,MySqrt.mySqrt(5));
	}
	
	@Test
	public final void test2() {
		assertEquals(1,MySqrt.mySqrt(2));
	}
	
	@Test
	public final void test3() {
		assertEquals(46340,MySqrt.mySqrt(2147395600));
	}
	
	@Test
	public final void test4() {
		assertEquals(46340,MySqrt.mySqrt(2147483647));
	}
	
}
