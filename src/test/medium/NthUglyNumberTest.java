package medium;
import static org.junit.Assert.*;
import medium.NthUglyNumber;

import org.junit.Test;


public class NthUglyNumberTest {

	@Test
	public final void test() {
		assertEquals(1,NthUglyNumber.nthUglyNumber(1));
	}
	@Test
	public final void test2() {
		assertEquals(10,NthUglyNumber.nthUglyNumber(9));
	}
	@Test
	public final void test3() {
		assertEquals(9,NthUglyNumber.nthUglyNumber(8));
	}
	@Test
	public final void test4() {
		assertEquals(25,NthUglyNumber.nthUglyNumber(16));
	}

}
