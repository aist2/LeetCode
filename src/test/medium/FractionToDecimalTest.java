package medium;
import static org.junit.Assert.*;
import medium.FractionToDecimal;

import org.junit.Test;


public class FractionToDecimalTest {

	@Test
	public final void test() {
		assertEquals("0.5", FractionToDecimal.fractionToDecimal(1, 2));
	}
	@Test
	public final void test2() {
		assertEquals("2", FractionToDecimal.fractionToDecimal(2, 1));
	}
	
	@Test
	public final void test3() {
		assertEquals("0.000001", FractionToDecimal.fractionToDecimal(1, 1000000));
	}
	
	@Test
	public final void test4() {
		assertEquals("0.(6)", FractionToDecimal.fractionToDecimal(2, 3));
	}
	
	@Test
	public final void test5() {
		assertEquals("0.1(6)", FractionToDecimal.fractionToDecimal(1, 6));
	}
	
	@Test
	public final void test6() {
		assertEquals("-6.25", FractionToDecimal.fractionToDecimal(-50, 8));
	}
	
	@Test
	public final void test7() {
		assertEquals("-6.25", FractionToDecimal.fractionToDecimal(50, -8));
	}
	
	@Test
	public final void test8() {
		assertEquals("6.25", FractionToDecimal.fractionToDecimal(-50, -8));
	}
	
	@Test
	public final void test9() {
		assertEquals("-0.58(3)", FractionToDecimal.fractionToDecimal(7, -12));
	}
	
	@Test
	public final void test10() {
		assertEquals("0.0000000004656612873077392578125", FractionToDecimal.fractionToDecimal(-1, -2147483648));
	}
	
	@Test
	public final void test11() {
		assertEquals("-2147483648", FractionToDecimal.fractionToDecimal(-2147483648,1));
	}
	
	@Test
	public final void test12() {
		assertEquals("2147483648", FractionToDecimal.fractionToDecimal(-2147483648,-1));
	}
}
