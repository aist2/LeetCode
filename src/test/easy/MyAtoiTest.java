package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.MyAtoi;

public class MyAtoiTest {

	@Test
	public final void testMyAtoi1() {
		String str = "2147483647";
		assertEquals(2147483647, MyAtoi.myAtoi(str));
	}

	@Test
	public final void testMyAtoi2() {
		String str = "-2147483648";
		assertEquals(-2147483648, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi3() {
		String str = "-2147483649";
		assertEquals(-2147483648, MyAtoi.myAtoi(str));
	}

	@Test
	public final void testMyAtoi4() {
		String str = "    1230";
		assertEquals(1230, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi5() {
		String str = "    +1230";
		assertEquals(1230, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi6() {
		String str = "    +1230abcde";
		assertEquals(1230, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi7() {
		String str = "    +sabcde";
		assertEquals(0, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi8() {
		String str = "";
		assertEquals(0, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi9() {
		String str = " b11228552307";
		assertEquals(0, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi10() {
		String str = "-1";
		assertEquals(-1, MyAtoi.myAtoi(str));
	}
	
	@Test
	public final void testMyAtoi11() {
		String str = "2147483648";
		assertEquals(2147483647, MyAtoi.myAtoi(str));
	}
}
